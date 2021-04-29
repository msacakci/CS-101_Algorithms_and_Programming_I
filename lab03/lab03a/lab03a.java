import java.util.Scanner;

/**
 * Even and Odd Number Counter 
 * @author Metehan Saçakçý
 * @version 23.10.2019
 */ 
public class lab03a
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
       //while ( count <= 50)
       {
         if ( x % 2 == 0 ) 
         {
            if ( x > 25  ||  x <12 )
            {   
            System.out.println ( x + " This number is even and out of range 12-25.");
            evenNumbers = evenNumbers + 1 ;
            count = count + 1 ;
            //Part B
            if ( x % 5 == 0)
            {
               System.out.println( " Hi five!");
            
            }
            
            if ( x % 2 == 0)
            {
               System.out.println( " Hi two!");
            
            }
            if ( x % 3 == 0 || x % 7 == 0 )
            {
               System.out.println( " Hi three or seven!");
            
            }
            else if( x % 3 != 0 && x % 7 != 0 && x % 2 != 0 &&  x % 5 != 0)
            {
               System.out.println( " Hi others!");
            
            }
            }
            else
            {
                           
            System.out.println( x + " This number is even." );
            evenNumbers = evenNumbers + 1 ;
            count = count + 1 ;
            //Part B
            if ( x % 5 == 0)
            {
               System.out.println( " Hi five!");
            
            }
            if ( x % 2 == 0)
            {
               System.out.println( " Hi two!");
            
            }
            if ( x % 3 == 0 || x % 7 == 0 )
            {
               System.out.println( " Hi three or seven!");
            
            }
            else if ( x % 3 != 0 && x % 7 != 0 && x % 2 != 0 &&  x % 5 != 0)
            {
               System.out.println( " Hi others!");
            
            }
            
            }
            
         }   
         else if ( x % 2 != 0 )
         {
            if ( x > 25  ||  x <12 )
            {   
            System.out.println ( x + " This number is odd and out of range 12-25.");
            oddNumbers = oddNumbers + 1 ;
            count = count + 1 ;
            }
            else
            {
            System.out.println ( x + " This number is odd.");
            oddNumbers = oddNumbers + 1 ;
            count = count + 1 ;
            }
            // Part B
            if ( x % 5 == 0)
            {
               System.out.println( " Hi five!");
            
            }
            if ( x % 3 == 0 || x % 7 == 0 )
            {
               System.out.println( " Hi three or seven!");
            
            }
            else if ( x % 3 != 0 && x % 7 != 0 && x % 2 != 0 &&  x % 5 != 0)
            {
               System.out.println( " Hi others!");
            
            }
            
         }
        }
        if ( count == 51 )
      {   
            System.out.println( "Count of even numbers is " + evenNumbers );  
            System.out.println( "Count of odd numbers is " + oddNumbers );
      }   
      }
      //Part C 02
      
      
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
   
} // end class

