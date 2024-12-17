package com.myJava;
import java.util.Scanner;
public class myNum {
 public static void main(String[] args) {
 int num, i, n;
 boolean flag=true;
 Scanner input = new Scanner(System.in);
 System.out.print("Test Case :");
 n = input.nextInt();
 while (n-- >= 0) {
 num = input.nextInt();
 for (i = 2; i <= (num / 2) ; i++) {
 if (num % i == 0) {
 flag = false;
System.out.println(num + " is not prime");
 break;
}
 }
 if (flag == true) {
 System.out.println(num + " is prime");
 }
 }
 }
}