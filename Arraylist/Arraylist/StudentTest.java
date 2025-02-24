
package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
   
    
    
    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Number :");
        int N = input.nextInt();

        System.out.println("\n");

        for(int i= 0 ; i < N; i++){
            System.out.print("Enter Student Name : ");
            String aName = input.next();

            System.out.print("Enter Age : ");
            int aAge = input.nextInt();

            System.out.print("Enter Education : ");
            String aEducation = input.next();
            StudentList.add(new Student(aName,aAge,aEducation));
            System.out.println();
        }

        System.out.println("\n  Display Student List  \n");
        for(int i = 0 ; i < StudentList.size();i++)
        {
          StudentList.get(i).Display();  
        }
        
        System.out.print("\nEnter age of Student which You want to search : ");
        int StudentAge = input.nextInt(); 
        int flag = 0;

        for(int i = 0 ; i< StudentList.size(); i ++){
        if(StudentAge == StudentList.get(i).getAge()){
            System.out.println("Found In "+(i+1)+" Number Serial Student");
            flag = 1;
            break;
        }
        }
        if(flag == 0){
        System.out.println(" Not Found in Any Index ");
        }
        
        System.out.println("\n  Edit Student Information ");
        System.out.print("Enter Index Number which you want to update :");
        int IndexNumber =input.nextInt();

        System.out.print("Enter new name : ");
        String nName = input.next();
        System.out.print("Enter new Age : ");
        int nAge = input.nextInt();
        System.out.print("Enter new Education : ");
        String nEducation = input.next();

      // animalList.add(IndexNumber, new student(nName,nAge,neducation));

       StudentList.get(IndexNumber).setName(nName);
       StudentList.get(IndexNumber).setAge(nAge);
       StudentList.get(IndexNumber).setEducation(nEducation);
        
       for(int i =0 ; i < StudentList.size(); i++){
        System.out.println("\n");
        StudentList.get(i).Display();
       }
       
        System.out.println(" Remove The Information ");
        int delete = input.nextInt();
        StudentList.remove(delete);
        
        System.out.println(" After Delete Information  Display");
        for (int i = 0; i < StudentList.size(); i++) {
            System.out.println("Name : "+StudentList.get(i).getName());
            System.out.println("Age : "+StudentList.get(i).getAge());
            System.out.println("Education  : "+StudentList.get(i).getEducation());
          //  StudentList.get(i).Display();
        }
    }
}



