
package LabTask_3;


import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Studetns’ CGPA you want to insert? ");
        int n = sc.nextInt();
        double[] cgpa = new double[n];
        System.out.print("Enter "+n+"  array elements ");
        for (int i = 0; i < n; i++) {
            cgpa[i] = sc.nextDouble();
        }

        double smallest = cgpa[0];
        double largest = cgpa[0];

        for (int i = 1; i < n; i++) {
            if (cgpa[i] < smallest) {
                smallest = cgpa[i];
            }
            if (cgpa[i] > largest) {
                largest = cgpa[i];
            }
        }

        System.out.println("Smallest CGPA: " + smallest);
        System.out.println("Largest CGPA: " + largest);
    }
}

