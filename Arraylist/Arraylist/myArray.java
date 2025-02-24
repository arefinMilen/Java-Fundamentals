
package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class myArray {
    String name;
    int age;
    String food;
 myArray(String name , int age , String food){
    this.name = name;
    this.age = age;
    this.food = food;

 }
 void setName(String name){
    this.name = name ;

 }
 void setAge(int age){
    this.age = age;
 }
void setFood(String food){
    this.food = food ;
}

String getName(){
    return name;
}
int getAge(){
    return age;
}
String getFood(){
    return food;
}

void Display(){
    System.out.println("Name : "+this.name);
    System.out.println("Age : "+this.age);
    System.out.println("Food : "+this.food);
    System.out.println();
}
}
