package com.myJava;
import java.util.Scanner;
public class myaAlpha {
 public static void main(String[] args) {
 char value;
 Scanner input = new Scanner(System.in);
 int T=input.next.Int();
while(T-- > 0){
 value = input.next().charAt(0);
 if ((value >= 'A' && value <= 'Z') || (value >= 'a' && value <= 'z')) {
 System.out.print(value + " is a Alphabet : ");
 if (value == 'A' || value == 'E' || value == 'I' || value == 'O' ||
value == 'U' || value == 'a' || value == 'i' || value == 'e' || value == 'o' ||
value == 'u') {
 System.out.println("It is an Vowel");
 } else {
 System.out.println("It is an Consonant");
 }
 } else if (value >= '0' && value <= '9') {
 System.out.println(value + " is a Digit");
 } else {
 System.out.println(value + " is a special character");
 }
 }
 }
}