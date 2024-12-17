package com.myJava;
import java.util.Scanner;
public class myInfo {
 public static void main(String[] args) {
 String name,dept,blnk;
 int age;
 double cgpa;
 char section;
 Scanner input=new Scanner(System.in);
 name=input.nextLine();
 age=input.nextLine();
 cgpa=input.nextDouble();
 blnk=input.nextLine();
 dept=input.nextLine();
 section=input.next().charAt(0);
 System.out.println("Enter the Name:"+name);
 System.out.println("Enter the age:"+age);
 System.out.println(" Enter the CGPA:"+cgpa);
 System.out.println("Enter the Department: "+dept);
 System.out.print("Enter the Section :"+section);
 }
}
