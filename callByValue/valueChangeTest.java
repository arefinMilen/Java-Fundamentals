
package callByValue;


public class valueChangeTest {
    public static void main(String[] args) {
        Value v = new Value();
        int x = 10;
        System.out.println(x);
        v.change(x);
        System.out.println("the chage value will be same :"+x);
    }
  
}
