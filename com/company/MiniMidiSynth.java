
package com.company;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.sound.midi.*;

public class MiniMidiSynth extends JFrame
{
    public MiniMidiSynth ()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini Midi Synthesizer");

        //Holds combobox and keyboard
        Box box = Box.createVerticalBox();
        getContentPane() .add(box);
        //Access the syntesizer
        try {
            synthesizer = MidiSystem.getSynthesizer();       //Get the synthesizer...
            synthesizer.open();         //...and open it
        }
        catch(MidiUnavailableException e)
        {
            JOptionPane.showMessageDialog(null, "No synthesizer available - terminating...","MIDI Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        MidiChannel[] channels = synthesizer.getChannels();  //Get the channels
        for(int i=0 ; i< channels.length ; i++ )   //Get first non-null channel
        {
            channel = channels[i];
            break;
        }
        instruments = synthesizer.getAvailableInstruments ();   //Get the instruments
        if(instruments.length == 0 )    //...and check we have some
        {
            JOptionPane.showMessageDialog(null,"No instruments - terminating...","MIDI Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        //create instrument list in combobox
        instrumentChoice = new JComboBox();
        for(int i=0 ; i<Math.min(128,instruments.length);i++)
            instrumentChoice.addItem(instruments[i]);

        //select the first instrument for the channel
        channel.programChange(instruments[0].getPatch() .getProgram() );
        instrumentChoice.setSelectedIndex(0) ;    //select the chosen one

        //Add listener for new instrument selected
        instrumentChoice.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                Patch patch=
                        ((Instrument)instrumentChoice.getSelectedItem()) .getPatch();
                channel.programChange (patch.getBank(), patch.getProgram());
            }
        });

        JPanel instrumentPane = new JPanel(new FlowLayout());    //Panel for instrument choice
        instrumentPane.add(instrumentChoice);              //Add combobox
        box.add(Box.createVerticalStrut(10));         //space above....
        box.add(instrumentPane);                           //...instrument panel...
        box.add(Box.createVerticalStrut(10));             //...and below
        //create keyboard
        JPanel kbPane = new JPanel(new BorderLayout());     //panel for keyboard
        kbPane.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));  //with space around
        kbPane.add(new Keyboard());         //Add the Keyboard
        box.add(kbPane);             //Add the panel to the box
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        MiniMidiSynth synth = new MiniMidiSynth();
    }



    private Synthesizer synthesizer;                      // The synthesizer
    private MidiChannel channel;                        //The channel we will use
    private Instrument instruments[];                     //Available instruments
    private JComboBox instrumentChoice;                    //Choice of instruments
    private static int velocity =70;                     // Note velocity

    //Inner class defining a keyboard
    class Keyboard extends JPanel
    {
        public Keyboard ()
        {
            setLayout(new BorderLayout());
            setPreferredSize(new Dimension(7* OCTAVES*Key.width, Key.height+1));
            int firstKeyNum = 60 - 6* OCTAVES;
            int whiteIDs[] = { 0, 2, 4, 5, 7, 9, 11 };           //White key positions
            //in an octave
            int blackIDs[] = { 0, 1, 3, 0, 6, 8, 10 };          //Black key positions
            //in an octave
            int position = 0;
            int whiteKeyIndex = 0;                            //Current white key
            int blackKeyIndex = 0;                           //current black key
            for( int i=0; i < OCTAVES; i++)
            {
                int keyNum =  i * 12 + firstKeyNum;
                for(int j=0; j<7; j++, position += Key.width)
                {
                    whiteKeys[whiteKeyIndex++] =
                            new Key(position, 0, keyNum+whiteIDs[j], Color.white);

                    if(j==0||j==3)
                        continue;
                    else
                        blackKeys[blackKeyIndex++] = new Key (position-Key.width/4, 0, keyNum+blackIDs[j],Color.black);
                }
            }
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e)
                {
                    pressedKey = getKey(e.getPoint());       //Find the key under the cursor
                    if(pressedKey == null)                   //If there isn't one ...
                        return;                              //We are done
                    pressedKey.press();                     //Press the key...
                    repaint();                               //...and redraw the keyboard
                }
                public void mouseReleased(MouseEvent e)
                {
                    if(pressedKey != null)                 //If a key is presssed...
                    {
                        pressedKey.release();             //...release it...
                        repaint();                      //...redraw the keyword
                    }
                }
            });
        }
        //Find the key at a point
        public Key getKey(Point  point)
        {
            for(int i= 0; i<blackKeys.length; i++)
                if(blackKeys[i].contains(point))
                    return blackKeys[i];
            for(int i=0; i<whiteKeys.length; i++)
                if(whiteKeys[i].contains(point))
                    return whiteKeys[i];
            return null;
        }
        public void paint(Graphics g)
        {
            Graphics2D g2d =(Graphics2D) g;

            for(int i=0; i<whiteKeys.length; i++)
                whiteKeys[i] .draw(g2d);
            for(int i=0; i< blackKeys.length; i++)
                blackKeys[i].draw(g2d);
        }
        final int OCTAVES = 4;              //Number of octaves on keyword
        Key[] whiteKeys = new Key[7*OCTAVES];    // The white keys
        Key[] blackKeys = new Key[5* OCTAVES];    //The black keys
        Key pressedKey;           //Key that is currently pressed
        // Inner class defining a key
        class Key extends Rectangle
        {
            public Key (int x, int y, int num, Color color)
            {
                super(x, y,
                        color . equals(Color.white)? width: width/2,       //Black keys are half
                        color. equals (Color.white)?height:height/2 );       //width & height
                this.color = color;
                noteNumber =num;
            }
            // Press the key
            public void press()
            {
                keydown =true;               //set indicator
                channel.noteOn(noteNumber, velocity);              //and play the note
            }
            // Release the key
            public void release ()
            {
                keydown = false;           //reset the indicator
                channel.noteOff(noteNumber, velocity/2);          //stop playing note
            }
            // Draw the key
            public void draw (Graphics2D g2d)
            {
                g2d.setColor(keydown? Color.blue:color);   //Blue when pressed
                g2d.fill (this);               //Fill key
                g2d.setColor(Color.black);            //set outline color
                g2d.draw(this);                //Draw outline
            }
            final static int width = 20;             //white key width
            final static int height = 100;          //White key length
            private boolean keydown = false;           //Key pressed indicator
            private Color color;                    //Key color
            int noteNumber;                         //Note number for the key
        }
    }

}
 