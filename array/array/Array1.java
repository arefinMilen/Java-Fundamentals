
package array;


public class Array1 {
 
    public static void main(String[] args) {
        int[] number = new int[5];
     number[0]=1;
     number[1]=13;
     number[2]=14;
     number[3]=13;
     number[4]=17;
    int sum= number[0]+number[1]+number[2]+number[3]+number[4];
    int len = number.length;
    
        System.out.println("the sum is :"+sum);
        System.out.println("the length of this array is :"+number.length);
    }
}
