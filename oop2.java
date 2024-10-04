package com.myJava;
import java.util.Scanner;
import java.lang.Math;
public class myRadius {
 public static void main(String[] args) {
 System.out.println("Input your radius:");
 int rad;
 final double pi=3.1416;
 Scanner input=new Scanner(System.in);
 rad=input.nextInt();
 double area =(Math.pow(rad,2))*pi;
 System.out.println(String.format("%.2f",area));
 }
}