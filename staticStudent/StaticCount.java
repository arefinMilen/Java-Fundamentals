
package staticStudent;

public class StaticCount {
    
  static int count = 0;
  StaticCount()
  {
      count++;
  }
  void info()
  {
      System.out.println("the total number of student :"+count);
  }
   
}
