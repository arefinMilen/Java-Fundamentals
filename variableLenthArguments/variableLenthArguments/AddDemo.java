
package variableLenthArguments;


public class AddDemo {
    
  void add(int ... num)
  {
      int sum = 0;
      for (int x:num) {
          sum+=x;
      }
      System.out.println("the total value is :"+sum);
  }
    
}
