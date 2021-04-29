import java.util.Scanner;

/**
 * Calculator v1.0 
 * @author Metehan Saçakçý
 * @version 16.10.2019
 */ 
public class lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variable
      double firstNumber;
      
      double secondNumber;          
      
      String operation;
               

      // program code   
      System.out.println( "Welcome to the calculator " );
      
      System.out.println( "Please enter the first number");
      
      firstNumber = scan.nextDouble();
      
      System.out.println( "Please enter the second number");
      
      secondNumber = scan.nextDouble();
      
      System.out.println( "Please write one of these operations:");
      
      System.out.println( " Sum , Difference , Product , Divide , Remainder ");
      
      operation = scan.next();
      
      if ( operation.equals( "Sum") )
      {
         
         System.out.println( "Your answer is " + (firstNumber + secondNumber));
      }
      
      else if ( operation.equals( "Difference" ) )
      {
         
         System.out.println( "Your answer is " + (firstNumber - secondNumber));
      }
      
      else if ( operation.equals( "Product" ) )
      {
         
         System.out.println( "Your answer is " + (firstNumber * secondNumber));
      }
      
      else if ( operation.equals( "Divide" ) )
      {
         
         System.out.println( "Your answer is " + (firstNumber / secondNumber));
      }
      
      else if ( operation.equals( "reaminder"))
      {
         System.out.println( "Your answer is " + (firstNumber % secondNumber));
      }
      
      else 
      {
         
         System.out.println( "Operator error");
      }
      
      System.out.println( "Goodbye" );
   

   }

} // end class
