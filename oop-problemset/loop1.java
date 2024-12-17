package com.myJava;
import java.util.Scanner;
public class loop {
 public static void main(String[] args) {
 int num,i,value=0;
 Scanner input=new Scanner(System.in);
 System.out.print("Input a num:");
 num=input.nextInt();
 for(i=1;i<=10;i++){
 value=num*i;
 System.out.println(num +"x"+i+" = "+value);
 }
 }
}