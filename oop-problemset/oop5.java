package com.myJava;
import java.lang.Math;
import java.util.Scanner;
public class myValue {
 public static void main(String[] args) {
 int A,B,C,D;
 Scanner input=new Scanner(System.in);
 System.out.print("A is=");
 A=input.nextInt();
 System.out.print("B is=");
 B=input.nextInt();
 System.out.print("C is=");
 C=input.nextInt();
 D=Math.max(A,B);
 System.out.println(String.format("Maximum Value is =
%d",Math.max(D,C)));
 }
}