package thread;
 public class Throw
{
  static void avg()
  {
    try
    {
      throw new ArithmeticException("demo");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Throw");
    }
 }

 public static void main(String args[])
 {
    avg();
 }
}