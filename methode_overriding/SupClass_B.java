
package methode_overriding;


public class SupClass_B extends SupClass_A {
    
    int gear;
    SupClass_B(String c,double w,int g)
    { 
        super(c,w);
        gear = g;
        
        
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("gear :"+gear);
    }
    
}
