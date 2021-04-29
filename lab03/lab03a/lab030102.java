import java.util.Scanner;

/**
 * Even and Odd Number Counter 
 * @author Metehan Saçakçı
 * @version 20.10.2019
 */ 
public class lab030102
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      
      int x;
      
      int y;
      
      int evenNumbers;
      int oddNumbers;
      int count;
           
      
      // program code
      evenNumbers = 0;
      oddNumbers = 0;
      count = 0;                      
      
      for ( x = 0; x <= 50; x++ )
      {   
         if ( x <= 25 || x >= 12 )
         {
            System.out.println( x );
         }
         else if ( x > 25 || x < 12 )
         {   
            System.out.println ( x + " out of range 12-25");
         }   
            
      }   
 
   }
} // end class