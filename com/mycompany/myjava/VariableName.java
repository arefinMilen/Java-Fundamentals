
package com.mycompany.myjava;

import java.util.Scanner;


public class VariableName {
    public static void main(String[] args) {
        
    
    
        /*
      boolean b = true;
      int i = 5279;
      char c = 'm';
      double d  = 32.3;
      float f = 4.3f;
      System.out.println("boolean is = "+b);
      System.out.println("int = "+i);
      System.out.println("char ="+c);
      System.out.println("double is ="+d);
      System.out.println("float is = "+f);
      */
      Scanner input = new Scanner(System.in);
      
      int num;
      System.out.println("Enter your number:");
      num = input.nextInt();
      System.out.print("number = "+num);
      
     String name;
     Scanner input1= new Scanner(System.in);
      System.out.println("Enter your name : ");
      name = input1.nextLine();
      System.out.println("Welcome "+name);
     
     
    }
  
}
