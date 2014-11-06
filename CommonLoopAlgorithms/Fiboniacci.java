

/**
 * Write a description of class NumericalMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fiboniacci
{
  public static void main(String[] args)
  {
      int counter = 0; 
      int a = 0;
      int b = 1;
      int c = b + a;
      while (counter != 10)
      {
          System.out.println(c);
          a = b;
          b = c;
          c = b + a;
          counter++;
      }
      
  }
}
