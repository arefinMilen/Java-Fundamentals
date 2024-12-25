
package OverloadingConstractor;


public class OverloadingConstructorTest {
    public static void main(String[] args) {
        
        Student stu1 = new Student();
        
        Student stu2 = new Student("Samsul Arefin","Male",221-15-5279);
        stu2.displayInformation();
        Student stu3 = new Student("Milen","Male");
        stu3.displayInformation();
        
    }
 
}
