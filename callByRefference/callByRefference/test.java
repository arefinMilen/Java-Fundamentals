
package callByRefference;


public class test {
    public static void main(String[] args) {
        Refference r1 = new Refference();
        r1.name ="arefin";
        System.out.println("before calling :"+r1.name);
        r1.change(r1);
        System.out.println("after calling :"+r1.name);
    }
}
