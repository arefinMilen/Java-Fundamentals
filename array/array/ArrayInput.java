
package array;

import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double  []num=new double[5];
        double sum = 0;
        System.out.print("Please Enter the numbers: ");
        for (int i = 0; i < 5; i++) {
            num[i]=input.nextDouble();
        }
        
       /* num[1]=input.nextDouble();
        num[2]=input.nextDouble();
        num[3]=input.nextDouble();
        num[4]=input.nextDouble();*/
        for (int i = 0; i < 5; i++) {
            sum+=num[i];
        }
        //sum = num[0] + num[1] + num[2] + num[3] + num[4] ;
        System.out.println("the result is: " +sum);
        double avg = sum/5;
        System.out.println("the average is : "+avg);
        double max = num[0];
        double min = num[0];
        for (int i = 1; i < 5; i++) {
         if(max<num[i]) {
             max=num[i];
         }  
        }
        for (int i = 1; i < 5; i++) {
            if(min>num[i]){
                min = num[i];
            }
        }
        System.out.println("The maximum number is : "+max);
        System.out.println("The minimum number is : "+min);
        
    }
    
}
