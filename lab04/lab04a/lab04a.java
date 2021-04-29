import java.util.Scanner;

/**
 * Lab04a 
 * @author Metehan Saçakçý
 * @version 29.10.2019
 */ 
public class lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int n;
      int count;
      int totalNumber;
      int divisor;
      int result;
      double k;
      int saveN;
      
      // program code
      count = 0;
      n = scan.nextInt();
      saveN = n;
      
      if( n < 0 )
      {
         System.out.println( "You cannot enter a negative value.");
      }
      else
      {
         //Part 01
         count = 0;
         totalNumber = 0;
         System.out.println( "Part 1: ");
         while( count < n )
         {
            System.out.print( count );
            count = count + 1;
            System.out.print( " ");
         }
         System.out.println( "\n----");
         
         //Part 02  
         count = 0;
         totalNumber = 0;
         System.out.println( "Part 2: ");
         while ( count < n )
         {
            System.out.print( count + " ");
            count = count + 1;
            if ( count % 5 == 0 )
            {
               System.out.print( "\n");
            }   
         }
         System.out.println( "\n----");
         //Part03
         count = 0;
         totalNumber = 0;
         System.out.println( "Part 3: ");
         while ( n >= 0 )
         {
            System.out.print( n );
            n = n - 1;
            System.out.print( " ");
         }
         System.out.println( "\n----");
         //Part04
         n = saveN;
         count = -n;
         System.out.println( "Part 4: ");
         while ( count <= n )
         {                      
            if ( count % 2 == 0)
            {   
               System.out.print( count );
               System.out.print( " ");
            }
            count = count + 1;
         }
         System.out.println( "\n----");
         
         //Part05
         count = 0;
         totalNumber = 0;
         System.out.println( "Part 5: ");
         while ( count <= n)
         {            
            if ( count % 2 == 0 )
            {
               System.out.print( count * count + " ");
               totalNumber = totalNumber + 1;
            }                            
            count = count + 1;
            
            if ( totalNumber % 5 == 0 )
            {
               System.out.print( "\n");               
            }
         }   
         System.out.println( "\n----");
         
         //Part06
         count = 0;
         totalNumber = 0;
         n = saveN;
         System.out.println( "Part 6: ");
         while ( n >= 3 )
         {
            if ( ( n % 3 == 0 || n % 4 == 0 ) && n % 12 != 0)
            {
               
//               if (n % 3 == 0 && n % 4 == 0 )
//               { 
//                 n = n - 1;
//                 totalNumber = totalNumber + 1;                  
//               }
               
               System.out.print( n + " ");
               totalNumber = totalNumber + 1;
               n = n - 1;
           }
           else
           {
              n= n - 1;             
           }   
         }
            if ( totalNumber % 5 == 0)
            {
               System.out.print( "\n");
            }   
         }  
         System.out.println( "\n----");
         
         //Part07
         n = saveN;
         count = 0;
         totalNumber = 0;
         divisor = 1;
         result = 0;
         System.out.println( "Part 7: ");
         while ( divisor <= n )
         {
            if ( n % divisor == 0 )
            {
               System.out.print( divisor + " ");               
            }   
            divisor = divisor + 1;                                                     
         }            
         System.out.println( "\n----");
         
         //Part08 
         k = 0;
         System.out.println( "Part 8: ");
         while ( n >= 1 )
         {
            if ( 1 / k > 0.1 )
            {   
               k = n;  
               System.out.print( Math.round( 100 / k ) / 100.0 + " ");
            }
            k = k - 1;
            n = n - 1;
         }   
         System.out.println( "\n----");                                          
   }
} // end class