import java.util.Scanner;

/**
 * lab04b 
 * @author Metehan Sa�ak��
 * @version 29.10.2019
 */ 
public class lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables      
      int n;
      int total;
      int count;
      int average;
      int max;
      int min;      
      
      // program code
      n = 0;
      total = 0;
      count = 0;
      average = 0;      
      max = 0;
      min = 0;
      
      while ( count < 150 )
      {        
         n = scan.nextInt();
         
         
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
      }
      average = total / count;
      System.out.println( "Count of numbers: " + count );
      System.out.println( "Sum of numbers: " + total );
      System.out.println( "Average of numbers: " + (double) average);
      System.out.println( "Max number: " + max );
      System.out.println( "Min number: " + min );                        
   }   
} // end class