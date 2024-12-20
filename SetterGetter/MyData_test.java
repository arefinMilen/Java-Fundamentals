
package SetterGetter;


public class MyData_test {
    public static void main(String[] args) {
        MyData my = new MyData();
        my.setName("arefin");
        System.out.println("My name is :"+my.getName());
        my.setAge(22);
        System.out.println("my age is :"+my.getAge());
    }
}
