
package lab_task_4;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        System.out.print("CGPA: ");
        double cgpa1 = sc.nextDouble();

        System.out.println("Enter details for Student 2:");
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        System.out.print("CGPA: ");
        double cgpa2 = sc.nextDouble();

        Student student1 = new Student(name1, id1, cgpa1);
        Student student2 = new Student(name2, id2, cgpa2);

        System.out.println("Student 1 details: Name - " + student1.getName() + ", ID - " + student1.getId() + ", CGPA - " + student1.getCgpa());
        System.out.println("Student 2 details: Name - " + student2.getName() + ", ID - " + student2.getId() + ", CGPA - " + student2.getCgpa());
    }
}
