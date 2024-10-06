/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task_4;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        System.out.print("Enter String 3: ");
        String str3 = sc.nextLine();

        if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
            System.out.println("String 1 is greatest.");
        } else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
            System.out.println("String 2 is greatest.");
        } else {
            System.out.println("String 3 is greatest.");
        }
    }
}
