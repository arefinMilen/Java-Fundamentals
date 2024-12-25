
package OverloadingConstractor;


public class Overloading_Test {
    public static void main(String[] args) {
        DIU stu1 = new DIU();
        stu1.info();
        
        DIU stu2 = new DIU("samsul arefin",61);
        stu2.info();
        
        DIU stu3 = new DIU("milen",62,20);
        stu3.info();
        
       
    }
}
