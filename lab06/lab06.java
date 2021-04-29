import java.util.Scanner;

/**
 * Using Methods
 * @author Metehan Saçakçý
 * @version 12.11.2019
 */
public class lab06
{
   /**
    * This method is writen to do power operations.
    * 
    */
   
   public static double power( double x, int y)
   {
      // variables
      double result;
      result = 1;
      // program codes
      if ( y < 0 )
      {
         System.out.println( "Power cannot be negative value!");
      }
      else if ( y == 0 )
      {
         result = 1;
      }
      else
      {   
         result = 1;
         int powerCounter;
         powerCounter = 0;
         
         do
         {
            result = result * x;
            powerCounter = powerCounter + 1;   
         } while ( powerCounter < y) ; 
      }   
      return result;
   } // end power method
   
   /**
    * This method is writen to do factorial operations.
    * 
    */ 
   public static double factorial( int n)
   {
      //variables
      int factorialCounter;
      factorialCounter = 0;           
      int result;
      result = 1;
      
      //program codes
      for ( factorialCounter = 1; factorialCounter <= n; factorialCounter++ )
      {
         result = result * factorialCounter;
      }         
      return result;      
   }   //end factorial method
   
   /**
    * This method is writen to write reverse string variable.
    * 
    */ 
    public static void reverse( String s)
   {      
      String[] words = s.split(" ");
      String reversedString = "";
      for ( int i = 0; i < words.length; i++ )
      {
         String word = words[i]; 
         String reverseWord = "";
         for ( int j = word.length()-1; j >= 0; j-- ) 
         {
            reverseWord = reverseWord + word.charAt(j);
         }
         reversedString = reversedString + reverseWord + " ";
      }
      System.out.println( s);
      System.out.println( reversedString); 
      
   }   // end reverse method
    
   /**
    *  This method is writen to calculate decimal values.
    * 
    */    
   public static int toDecimal( String base2)
   {
      long decimalNumber;
      decimalNumber = 0;
      long binaryNumber;
      long two;
      two = 1;
      long remainder;
      remainder = 0;     
      binaryNumber = Integer.valueOf( base2);     
      
      while ( binaryNumber != 0 ) 
      {
         remainder = binaryNumber % 10;
         decimalNumber = decimalNumber + remainder * two;
         two = two * 2;
         binaryNumber = binaryNumber / 10;
      }
      return ( int) decimalNumber;
   }  // end toDecimal method 
   /**
    *  This method is writen to calculate binary values from decimals.
    * 
    */      
   public static String antiDecimal( int x)
   {
      String temp;
      temp = "";
      int number;
      number = x;
      
      while( number > 0 )
      {
         temp = number % 2 + temp;
         number = number / 2;
      }   
      
      return temp;
   }  // end antiDecimal method 
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      String cell;
      int cellLength;
      double mainNumber;
      int powerNumber;
      int space;
      int spaceCounter;
      
      mainNumber = 0;
      powerNumber = 1;
      cellLength = 0;
      space = 0;
      spaceCounter = 0;
      
      //program code      
      //Part 01 Power Table
      System.out.println( "------------");
      System.out.println( "Part 01:");
      do
      {   
         for ( mainNumber = -1; mainNumber <= 10; mainNumber++ )
         {
            cell = "" + power( mainNumber, powerNumber );
            cellLength = cell.length();
            space = 8 - cell.length();
            for ( spaceCounter = 0; spaceCounter <= space; spaceCounter++ )
            {   
               System.out.print( " " );
            }
            System.out.print( cell );
         }
         System.out.print( "\n");
         powerNumber = powerNumber + 1;
      } while ( powerNumber <= 4 );
      
       System.out.println( "------------");

       // Part 02 Factorial Computer

       System.out.println( "------------");
       System.out.println( "Part 02:");  
       
       //variables
       String cellTwo;
       int spaceTwo;
       int spaceCounterTwo;
       int n;
       n = 0;
       spaceTwo = 0;
       spaceCounterTwo = 0;
       
       for ( n = 1; n <= 15; n++ )
       {  
          cellTwo = "" + n + " = " + ( long ) factorial( n);
          spaceTwo = 20 - cellTwo.length();        
          System.out.print( cellTwo );
           for ( spaceCounterTwo = 0; spaceCounterTwo <= spaceTwo; spaceCounterTwo++ )
          {
             System.out.print( " ");
          }   
          System.out.print( "\n");
       }
       System.out.println( "------------");
      
       // Part 03 Base 2 To Base 10     
       // variables
       String firstValue;
       String secondValue;
       int result;
       result = 0;
       
       // Program Codes
       System.out.println( "------------");
       System.out.println( "Part 03:");
       
       System.out.println( "Please enter first base 2 value:");
       firstValue = scan.nextLine();
       result = result + toDecimal( firstValue );
          
       System.out.println( "Please enter second base 2 value:");
       secondValue = scan.nextLine();
       
       result = result + toDecimal( secondValue);
       System.out.println( "Total Decimal: " + result);
       System.out.println( "Binary: " + antiDecimal( result ));
              
       System.out.println( "------------");
       
       //Part 04       
       // variables
       String s;
       
       //Program code
       System.out.println( "------------");
       System.out.println( "Part 04:");
       
       System.out.println( "Please type a name:");
       s = scan.nextLine();
       reverse( s );
       
       System.out.println( "------------");
       
       // Part 05 Sin(x) Formula
       System.out.println( "------------");
       System.out.println( "Part 05:");
       
       //variables
       int nSecond;
       double resultThird;
       resultThird = 0;
       double x;
       nSecond = 0;
       x = 0;
       double firstElement;
       double secondElement;
       double thirdElement;
       firstElement = 0;
       secondElement = 0;
       thirdElement = 0;
       double mainElement;
       mainElement = 0;
       String cellFifth;
       
       //Program Codes
       System.out.println( "Please enter x value: ");
       x = scan.nextDouble();
       
       for ( nSecond = 0; nSecond <= 10; nSecond++ )
       {
          firstElement = (long) power( -1, nSecond);
          secondElement = (long) factorial( (( 2 * nSecond ) + 1 ) );
          thirdElement = (long) power( x, (( 2 * nSecond ) + 1));
          mainElement = ( ( firstElement /  secondElement * thirdElement ));          
          resultThird = resultThird + mainElement;
          System.out.println( nSecond + "   " + firstElement + "   " + secondElement + "   " + thirdElement );                            
       }   
       System.out.println( "Calculated sin(x) is " + resultThird);
       System.out.println( Math.sin( x ) + " Real sin(x)"); 
       System.out.println( "------------");
       
       // Part 06 Real sin(x)
       System.out.println( "------------");
       System.out.println( "Part 06:");
       
        //variables
       int operatorCounter;
       operatorCounter = 4;
       double upstairs;
       upstairs = 0;
       double downstairs;
       downstairs = 0;
       int nThird;
       double resultFourth;
       resultFourth = 0;
       double xSecond;
       nThird = 0;
       xSecond = 0;
       double firstElementTwo;
       double secondElementTwo;
       double thirdElementTwo;
       firstElementTwo = 0;
       secondElementTwo = 0;
       thirdElementTwo = 0;
       double mainElementTwo;
       
       //Program Codes
       System.out.println( "Please enter x value: ");
       xSecond = scan.nextDouble();
       resultFourth = 0;
       nThird = 1;
      
       do
       {  
          mainElementTwo = 0;
          upstairs = power( xSecond, nThird);
          downstairs = factorial( nThird);
          mainElementTwo = upstairs / downstairs;
          
          if ( operatorCounter % 2 == 0 )
          {
             resultFourth = resultFourth + mainElementTwo;            
          }   
          else if ( operatorCounter % 2 != 0 )
          {
             resultFourth = resultFourth - mainElementTwo;           
          }   
          nThird = nThird + 2;
          operatorCounter = operatorCounter + 1;
                    
       } while ( nThird <= 10 );
       
       System.out.println( Math.sin(xSecond) + " Real sin(x)");     
       System.out.println( resultFourth + " Computed sin(x)");
       System.out.println( "------------");
       
  } // end main method
} // end main class
      
      
   
   
   
   
   
   
   
   
  
 