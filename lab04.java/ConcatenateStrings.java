
package lab_task_4;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" String-1: ");
        String str1 = sc.nextLine();

        System.out.print(" String-2: ");
        String str2 = sc.nextLine();

        System.out.print(" String-3: ");
        String str3 = sc.nextLine();

        String result = str1 + " " + str2 + " " + str3;

        System.out.println( result);
    }
}
