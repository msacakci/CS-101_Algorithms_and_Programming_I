import java.util.Scanner;

/**
 * Even and Odd Number Counter 
 * @author Metehan Saçakçý
 * @version 20.10.2019
 */ 
public class lab03aFinal
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
      int userValue;
      int sumComputer;
      int sumUser;
      // program code
      evenNumbers = 0;
      oddNumbers = 0;
      count = 0;
      sumComputer = 0;
      System.out.println("Please enter your value:");
      userValue = scan.nextInt();
      
      for ( x = 0; x <= 50; x++ )
      {           
         if ( x > 25  ||  x < 12 )
         {   
            System.out.println ( x + " This number is even and out of range 12-25.");
         }
         else
         {
            System.out.println( x );
         }   
         
         if ( x % 2 == 0 )
         {
            evenNumbers = evenNumbers + 1 ;
         }
         else
         {   
            oddNumbers = oddNumbers + 1 ;
         }
         if ( x % 5 == 0)
         {
            System.out.println( "Hi five!");
         }
         else if ( x % 2 == 0)
         {
            System.out.println( "Hi two!");
         }
         else if ( x % 3 == 0 || x % 7 == 0 )
         {
            System.out.println( "Hi three or seven");
         }
         else
         {
            System.out.println( "Hi others");
         }   
         if ( x <= userValue)
         {
            sumComputer = sumComputer + x ;
         }
      }
      System.out.println( "Even Numbers: " + evenNumbers );
      System.out.println( "Odd Numbers: " + oddNumbers );
      
      //Part 03
      sumUser =  userValue * (userValue + 1)/ 2 ;   
      if ( sumComputer == sumUser)
      {
         System.out.println("Sums are equal.");
      }   
     
   }
}  

