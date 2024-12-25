
package OverloadingConstractor;


public class Student {
    String name,gender;
    int id;
    
    Student()
    {
        System.out.println("NO value");
        System.out.println("\n\n");
    }
    
    Student(String n,String g,int i)
    {
        name = n;
        gender = g;
        id = i;
    }
    
    Student(String n,String g)
    {
        name = n;
        gender = g;
       
    }
    
    void displayInformation()
    {
        System.out.println("NAME :"+name);
        System.out.println("GENDER :"+gender);
        System.out.println("ID :"+id);
        System.out.println("\n\n");
    }
}
