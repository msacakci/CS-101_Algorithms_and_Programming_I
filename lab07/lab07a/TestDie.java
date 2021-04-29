import java.util.Scanner;

/**
 * Test Program for Die class 
 * @author Metehan Saçakçý
 * @version 24.11.2019
 */ 
public class TestDie
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Die die1,
          die2;

      // program code
      die1 = new Die();
      die2 = new Die();
      
      // we get weird numbers if we just print them. AFTER I ADDED TO STRING METHOD IT IS CHANGED!         
      System.out.println( die1);
      System.out.println( die2);
      
      // Test of the roll method.
      System.out.println( die1.roll());
      System.out.println( die2.roll());
      
      // Test of the get face value method.
      System.out.println( die1.getFaceValue());
      System.out.println( die2.getFaceValue());

      // Test of the to string method.
     System.out.println( die1);
     System.out.println( die2);
   }

} // end class