package com.myJava;
import java.util.Scanner;
public class myRemaks {
 public static void main(String[] args) {
 int mark;
 String grade=" ",remark=" ";
 double gpa=0;
 Scanner input=new Scanner(System.in);
 System.out.print("Enter your mark:");
 mark=input.nextInt();
 if(mark>=80){
 grade="A+";
 gpa=4.00;
 remark="Best";
 }
 else if(mark<80 && mark >=75){
 grade="A";
 gpa=3.75;
 remark="Better";
 }
 else if(mark<75 && mark >=70){
 grade="A-";
 gpa=3.50;
 remark="Very Good";
 }
 else if(mark<70 && mark >=65){
 grade="B+";
 gpa=3.25;
 remark="Good";
 }
 else if(mark<65 && mark >=60){
 grade="B";
 gpa=3.00;
 remark="Satisfaied";
 }
 else if(mark<60 && mark >=55){
 grade="B-";
 gpa=2.75;
 remark="Above Average";
 }
 else if(mark<55 && mark >=50){
 grade="C+";
 gpa=2.50;
 remark="Avarage";
 }
 else if(mark<50 && mark >=45){
 grade="C";
 gpa=2.25;
 remark="Below Avarage";
 }
 else if(mark<45 && mark >=40){
 grade="D";
 gpa=2.00;
 remark="Pass";
 }
 else if(mark<40 && mark >=0){
 grade="F";
 gpa=0.00;
 remark="Fail";
 }
 System.out.println("Marks:"+mark+"\nGrade:"+ grade +"\nGrade point
Equivalent:"+ gpa+"\nRemark:"+remark);
 }
}