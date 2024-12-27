/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask_3;

import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double absValue = Math.abs(num);
        double floorValue = Math.floor(num);
        double ceilValue = Math.ceil(num);
        double roundValue = Math.round(num);
        double sqrtValue = Math.sqrt(num);

        System.out.println("Absolute value: " + absValue);
        System.out.println("Floor value: " + floorValue);
        System.out.println("Ceiling value: " + ceilValue);
        System.out.println("Rounded value: " + roundValue);
        System.out.println("Square root value: " + sqrtValue);
    }
}
