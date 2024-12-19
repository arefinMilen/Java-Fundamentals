
package this_keyword;


public class Person {
    String name ;
    int age;
    String adress;
    Person(String name, int age, String adress)
    {
        this.name =name;
        this.adress = adress;
        this.age = age;
    }
    void info()
    {
        System.out.println("this is info methode");
    }
    void display ()
    {
        info();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Adress :"+adress);
    }
}
