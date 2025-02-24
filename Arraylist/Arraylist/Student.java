
package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    String education;
 Student(String name , int age , String education){
    this.name = name;
    this.age = age;
    this.education = education;

 }
 void setName(String name){
    this.name = name ;

 }
 void setAge(int age){
    this.age = age;
 }
void setFood(String education){
    this.education = education ;
}

String getName(){
    return name;
}
int getAge(){
    return age;
}
String getEducation(){
    return education;
}

void Display(){
    System.out.println("Name : "+this.name);
    System.out.println("Age : "+this.age);
    System.out.println("Food : "+this.education);
    System.out.println();
}

    void setEducation(String nEducation) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
