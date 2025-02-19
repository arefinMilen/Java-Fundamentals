
package inheritance;


public class Teacher extends Person {
    String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
   void display()
   {
       System.out.println("Name :"+getName());
        System.out.println("Adress :"+getAdress());
        System.out.println("Id "+getId()); 
   }
}
