package com.myJava;
import java.lang.Math;
import java.util.Scanner;
public class mySolution {
 public static void main(String[] args) {
 int A,B,C,D;
 Scanner input=new Scanner(System.in);
 A=input.nextInt();
 B=input.nextInt();
 C=input.nextInt();
 D=input.nextInt();
 System.out.println(String.format("Solution is : a = %d ",(A
* B - C * D)));
 System.out.println(String.format("Solution is : b = %d ",2*A
- B + 3*D));
 System.out.println(String.format("Solution is : c =
%d",(int)Math.pow(A,2)+(int)Math.pow(B,2)-
(int)Math.pow(C,2)+(int)Math.pow(D,2)));
 System.out.print(String.format("Solution is : d =
%d",(int)Math.pow(A,3)+B-(int)Math.pow(C,2)));
 }
}
