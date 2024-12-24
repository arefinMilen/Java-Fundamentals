
package Polymorphism;


public class Rectangle extends Shape {
    double length,width;
     Rectangle(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    
    double area()
    {
        System.out.print("The Rectangle is :");
       return length*width;
    } 
    
    
    }
    
