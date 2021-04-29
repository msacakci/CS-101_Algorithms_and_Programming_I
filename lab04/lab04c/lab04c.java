import java.util.Scanner;

/**
 * lab04c
 * @author Metehan Saçakçý
 * @version 29.10.2019
 */ 
public class lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables      
      int n;
      int total;
      int count;
      double average;
      int max;
      int min;
      
      // program code
      n = 0;
      total = 0;
      count = 0;
      average = 0;      
      max = 0;
      min = 0;      
      n = scan.nextInt();
      while ( n > 0 )
      {                             
         if ( count == 0 )
         {
            max = n;
            min = n;
         }         
         if ( n >= max )
         {
            max = n;            
         }
         if ( n < min )
         {
            min = n;
         }
         count = count + 1;
         total = total + n;      
         n = scan.nextInt();
      }
      average = (double) total / (double) count;
      System.out.println( "Count of numbers: " + count );      
      System.out.println( "Average of numbers: " + average);
      System.out.println( "Max number: " + max );
      System.out.println( "Min number: " + min );            
   }   
} // end class