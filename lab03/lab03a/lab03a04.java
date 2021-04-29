import java.util.Scanner;

/**
 * Even and Odd Number Counter 
 * @author Metehan Saçakçý
 * @version 20.10.2019
 */ 
public class lab03a04
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
       
      
      //Part C 01
      System.out.println("Please enter your value:");
      y = scan.nextInt();
      
      
      for ( x = 0; x <= 50; x++ )
      { 
         System.out.println( x );
      }
      
      int sumComputer = x * (x + 1)/ 2;
      int sumUser = (y + 1) * ((y + 1) + 1)/ 2;
      System.out.println( sumUser );
      
      if ( sumComputer == sumUser)
      {
         System.out.println( "Their sum are equal and it is " + sumComputer);
      }
      else if ( sumComputer != sumUser)
      {
         System.out.println ( "Their sum are not equal. Computer's sum is " + sumComputer + " Your sum is " + sumUser);
      }
   }
}  
       
          