
package returnType;


public class Factorial {
    int fact(int num){
    if(num == 1)
        return 1;
    else 
        return num*fact(num-1);
}
}
