/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task_4;

import java.util.Scanner;

public class FindEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String-1: ");
        String str1 = sc.nextLine();

        System.out.print("String-2: ");
        String str2 = sc.nextLine();

        System.out.print("String-3: ");
        String str3 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("String-1 and String-2 are equal.");
        } else if (str1.equals(str3)) {
            System.out.println("String-1 and String-3 are equal.");
        } else if (str2.equals(str3)) {
            System.out.println("String-2 and String-3 are equal.");
        } else {
            System.out.println("No two strings are equal.");
        }
    }
}
