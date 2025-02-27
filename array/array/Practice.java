
package array;

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] number = new double[5];
        System.out.println("Enter The 5 number :");
        double sum= 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
            sum+=number[i];
        }
        System.out.println("the sum is : "+sum);
        double max =number[0];
        double min = number[o];
 
                for (int i = 1; i < 5; i++) {
             if (max<number[i]) {
            max=number[i];
           }
             
       
    }
        System.out.println("the max is "+max);
}
