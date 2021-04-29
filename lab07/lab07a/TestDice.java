import java.util.Scanner;

/**
 * Test Program for Dice class 
 * @author Metehan Saçakçý
 * @version 24.11.2019
 */ 
public class TestDice
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Die die1 = new Die();
      Die die2 = new Die();  
      Dice dice = new Dice();

      // program code     
            
      System.out.println( dice.rollBothDie());
//      System.out.println( dice2);
      
// Test of the roll method.
//      System.out.println( dice1.roll());
//      System.out.println( dice2.roll());
      
// Test of the get face value method.
//      System.out.println( dice1.getFaceValue());
//     System.out.println( dice2.getFaceValue());

// Test of the to string method.
      System.out.println( dice.toString());
//      System.out.println( dice2.toString());
   }

} // end class