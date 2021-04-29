import java.util.Scanner;

/**
 * Even and Odd Number Counter 
 * @author Metehan Saçakçý
 * @version 20.10.2019
 */ 
public class lab03a01
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      
      int x;
      x = 0;
      int y;
      y = 0;
      int evenNumbers;
      int oddNumbers;
      int count;
           
      
      // program code
      evenNumbers = 0;
      oddNumbers = 0;
      count = 0;                  
      
      
      for ( x = 0; x <= 50; x++ )
      {   
         if ( x < 12 || x > 25 )
         {
            System.out.println( x + " Out of range 12-25");
         }
         else
         {   
            System.out.println( x );
         }
         
      }
   }
}  