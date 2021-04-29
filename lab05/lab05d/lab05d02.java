import java.util.Scanner;

/**
 * Pi Calculator with User 
 * @author Metehan Saçakçý
 * @version 04.11.2019
 */ 
public class lab05d02
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final double upstairs = 4;

      // variables
      int numberOne;
      int numberOneCounter;
      double pi;
      double downstairs;
      int operatorCounter;
       
      // program code
      numberOne = 0;
      numberOneCounter = 0;
      pi = 0;
      downstairs = 1;
      operatorCounter = 1;
      System.out.println( "Please enter a int value:");
      numberOne = scan.nextInt();
      do
      {
         // sum or difference detection unit
         if ( operatorCounter % 2 == 0)
         {
            pi = pi - (upstairs / downstairs);
         }   
         else
         {
            pi = pi + (upstairs / downstairs);
         }   
         downstairs = downstairs + 2;
         operatorCounter = operatorCounter + 1;
         numberOneCounter = numberOneCounter + 1;
      } while ( numberOneCounter < numberOne );
      System.out.println( "Result is " + pi );
   }
} // end class