
package methode_overriding;


public class SupClass_A {
    
    String color;
    double weight;
    SupClass_A(String c,double w)
    {
        color = c;
        weight = w;
    }
    void display()
    {
        System.out.println("c0l0r  :"+color);
        System.out.println("weight :"+weight);
    }
}
