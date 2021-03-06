import java.util.Scanner;

/**
 * Test program for BigNum Class
 * @author Metehan Sa?ak??
 * @version 17.12.2019
 */ 
public class lab10a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      BigNum b1,
             b2,
             b3;
      // variables

      // program code
      b1 = new BigNum();
      System.out.println( "B1 is " + b1.toString());
      System.out.println( "---------------------------");
      b2 = new BigNum( "110");
      System.out.println( "B2 is " + b2.toString());
      System.out.println( "---------------------------");
      b3 = new BigNum( b2);
      System.out.println( "B3 is " + b3.toString());
      System.out.println( "---------------------------");
      System.out.println( "B1 equals B3: " + b1.equals( b3));      
      System.out.println( "B2 equals B1: " + b2.equals( b1));
      System.out.println( "B3 equals B2: " + b3.equals( b2));
      System.out.println( "---------------------------"); 
      System.out.println( "Is b1 zero: " + b1.isZero());
      System.out.println( "Is b2 zero: " + b2.isZero());
      System.out.println( "Is b3 zero: " + b3.isZero());
      System.out.println( "---------------------------");      
      System.out.println( "After shift method: ");
      b3.shift( true);
      b3.shift( true);
      System.out.println( "Shift is true");
      System.out.println( "B3 is " + b3.toString());      
      b3.shift( false);      
      System.out.println( "Shift is false");
      System.out.println( "B3 is " + b3.toString());
      System.out.println( "---------------------------");
      System.out.println( "After add method: ");
      b3 = new BigNum( "10");
      System.out.println( b2.add( b3));
      b2 = new BigNum( b2);
      System.out.println( "After to string method: ");
      System.out.println( b2.toString());
   }

} // end class