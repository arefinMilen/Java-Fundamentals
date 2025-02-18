
package instanceOfOparetor;


public class test {
    public static void main(String[] args) {
       Diu d = new Diu();
        Cse c = new Cse();
        Sec_j s = new Sec_j();
        
        System.out.println(d instanceof Diu);
        System.out.println(c instanceof Diu);
        System.out.println(s instanceof Cse);
        System.out.println(c instanceof Sec_j);
        System.out.println(s instanceof Diu);
        
    }
         
}
