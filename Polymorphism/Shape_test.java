
package Polymorphism;


public class Shape_test {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Shape();
         s[1] = new Rectangle(20,30);
         s[2] =new Triangle(20,30);
        for (int i = 0; i < 3; i++) {
           System.out.println(s[i].area()); 
        }
        
        
    }
}
