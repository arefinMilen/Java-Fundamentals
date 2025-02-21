/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myjava;

import java.util.Scanner;

/**
 *   
 * @author arefin
 */
public class VowelConsonant {
public void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any letter: ");
        char ch;
        ch = input.next().charAt(0);
        if (ch == 'a'){
        System.out.println("vowel"); 
}
        else if(ch=='e'){
        System.out.println("vowel"); 
}
         else if(ch=='i'){
        System.out.println("vowel"); 
}
         else if(ch=='u'){
        System.out.println("vowel"); 
        
}
         else {
            System.out.println("Consonent");  
         }
}
}
 