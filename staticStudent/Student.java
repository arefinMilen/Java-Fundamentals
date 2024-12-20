
package staticStudent;


public class Student {
    
    String name;
    int id;
    static String UniversityName = "DIU";
    
    Student(String n,int i )
    {
            id = i;
            name = n;
    }  
    void displayInformation()
    {
        System.out.println("Name :"+name);
        System.out.println("ID  :"+id);
        System.out.println("University Name :"+UniversityName);
        System.out.println("");
    }
            
}
