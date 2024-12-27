
package LabTask_3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();

        double max = Math.max(Math.max(num1, num2), num3);
        double min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
