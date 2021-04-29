import java.util.Scanner;

/**
 * Even and Odd Number Counter 
 * @author Metehan Saçakçı
 * @version 20.10.2019
 */ 
public class lab03aHi
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
       if ( x % 5 == 0)
       {
          System.out.println( x + " Hi five!");
       }
       else if ( x % 2 == 0)
       {
          System.out.println( x + " Hi two!");
       }
       else if ( x % 3 == 0 && x % 7 == 0 )
       {
          System.out.println( x + " Hi three or seven");
       }
       else
       {
          System.out.println( x + " Hi others!");
       }
      }
   }
}  
                                