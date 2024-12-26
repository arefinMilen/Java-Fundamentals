
package methode_overriding;


public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        
            p1.name ="milen";
            p1.age = 22;
           // p1.qualification="Bsc in CSE";
            p1.displayInformation();
        
      
      Teacher t1 = new Teacher();
      
            t1.name ="milen";
            t1.age = 22;
            t1.qualification="Bsc in CSE";
     t1.displayInformation();
    }
}
