/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask_3;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            int num = rand.nextInt(201);
            System.out.println("Random number " + i + ": " + num);
        }
    }
}
