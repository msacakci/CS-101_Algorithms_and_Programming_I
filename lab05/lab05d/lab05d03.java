import java.util.Scanner;

/**
 * Pi Accuracy
 * @author Metehan Sa?ak??
 * @version 04.11.2019
 */ 
public class lab05d03
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
      double accuracy;
      double realAccuracy;
      double realPi;
      
      // program code
      numberOne = 0;
      numberOneCounter = 0;
      pi = 0;
      downstairs = 1;
      operatorCounter = 1;
      accuracy = 0;
      realAccuracy = 0;
      realPi = Math.PI;
      System.out.println( "Please enter a accuracy value:");
      accuracy = scan.nextDouble();
      do
      {
         if ( operatorCounter % 2 == 0 )
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
         // Accuracy control unit
         realAccuracy = Math.abs( realPi - pi );
      } while ( accuracy < realAccuracy  );  
      
      System.out.println( "Result is " + pi );      
   }
} // end class