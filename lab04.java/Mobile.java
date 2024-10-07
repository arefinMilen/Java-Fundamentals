/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task_4;

import java.util.Scanner;

public class Mobile {
    private String modelName;
    private String brand;
    private int code;
    private double price;

    public Mobile(String modelName, String brand, int code, double price) {
        this.modelName = modelName;
        this.brand = brand;
        this.code = code;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of mobiles: ");
        int n = sc.nextInt();

        Mobile[] mobiles = new Mobile[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Mobile " + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Model Name: ");
            String modelName = sc.nextLine();
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Code: ");
            int code = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            mobiles[i] = new Mobile(modelName, brand, code, price);
        }

        System.out.println("Details of all mobiles:");

        for (int i = 0; i < n; i++) {
            System.out.println("Mobile " + (i + 1) + ": Model Name - " + mobiles[i].getModelName() + ", Brand - " + mobiles[i].getBrand() + ", Code - " + mobiles[i].getCode() + ", Price - " + mobiles[i].getPrice());
        }
    }
}
