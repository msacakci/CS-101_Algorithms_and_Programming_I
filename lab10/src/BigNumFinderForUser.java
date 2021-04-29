import java.util.Scanner;

/**
 * Lots of Big Numbers
 * @author Metehan Saçakçý
 * @version 17.12.2019
 */ 
public class BigNumFinderForUser
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      BigNum b1,
             b2,
             bSpecial;
      // variables
     
      int randomNumber,
          index,
          index2,
          localBase,
          localSize,
          n,
          attempt,
          specialAttempt,
          localResult;
      int[] list;
      String resultAsString;
      
      // program code
       b1 = new BigNum();
       b2 = new BigNum();
       //bSpecial = new BigNum();
       n = 1;
                             
      while( n != -1 )
      {
         // 1. Take a n value from the user.
         System.out.print( "Please enter a value to find big numbers:");
         n = scan.nextInt();
         attempt = 1;
         list = new int[b1.SIZE];
         localSize = b1.SIZE;
         resultAsString = "";
         specialAttempt = 0;
         bSpecial = new BigNum();
         while( 0 < n && n <= b1.SIZE)      
         {
            // 2. Compute variable range with using BASE variable.
            resultAsString = "";
            for( index = 0; index < n; index++ )
            {
               for( index2 = 0; index2 < list.length ; index2++)
               {   
                  localBase = (int) Math.round(( Math.random() * ( b1.BASE - 1) ));
                  localResult = localBase;
                  list[index2] = localResult; 
               }   
            } 
            // 3. Add the String result in order to create new big number.
            for( index = 0; index < list.length ; index++)
            {
               resultAsString = resultAsString + list[index];            
            }          
            b1 = new BigNum ( resultAsString);
            //System.out.println( b2.isLessThan(b1));
            // 4. If this bigger than other ones set them as special big number.
            if( bSpecial.isLessThan( b1))
            {
               specialAttempt = attempt;
               bSpecial = b1;
            } 
            // 5. Report the result.
            System.out.println( "Current Attempt: " + attempt + " Big number is "  + b1.toString());
            n = n - 1;
            attempt = attempt + 1;
            System.out.println( "---------------------------------------------------------------------");
         }
         // 6. Report the biggest number.
         if ( n != -1)
         {   
            System.out.println( "*****Biggest number so far with attempt: " + specialAttempt + "\n");
            System.out.println( bSpecial.toString());
         }
      }
   }
   
}   