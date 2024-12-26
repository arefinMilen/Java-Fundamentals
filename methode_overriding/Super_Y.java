
package methode_overriding;


public class Super_Y extends Super_X {
    //x=20; because extends Super_X
    int x = 30;


void display()
{
   System.out.println("x:"+x);
    System.out.println("x:"+super.x);
}
}
