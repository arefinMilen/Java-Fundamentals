/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask_3;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        int index = -1; // initialize index to -1
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break; // break out of the loop once the element is found
            }
        }

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}

