import java.util.Scanner;

/**
 * lab05c 
 * @author Metehan Saçakçý
 * @version 04.11.2019
 */ 
public class lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      double value;
      double valueTwo;
      int quitCounter;
      String operation;
      double mainValue;
      
      // program code
      value = 0;
      valueTwo = 0;
      quitCounter = 0;
      mainValue = 0;
      System.out.println( "Welcome to the Calculator...");
      System.out.println( "------------------");
      System.out.println( "[ " + mainValue + " ]");
      System.out.println( "------------------");
      System.out.println( "+, " + "-, " + "*, " + "/ " + "value"); 
      System.out.println( "Clear");
      System.out.println( "Quit");
      System.out.println( "------------------");
      System.out.println( "operator, " + "value");
      do
      {   
         operation = scan.next();
         if ( operation.equals( "Clear"))
         {
            mainValue = 0;
         }
         else if ( operation.equals( "Quit"))
         {
            quitCounter = quitCounter + 1;
         }   
         else
         {   
            value = scan.nextDouble();
            
            if ( operation.equals("+"))
            {
               mainValue = mainValue + value;
            }
            if ( operation.equals("-"))
            {
               mainValue = mainValue - value;
            }
            if ( operation.equals("*"))
            {
               mainValue = mainValue * value;
            }
            if ( operation.equals("/"))
            {
               mainValue = mainValue / value;
            }
            if ( operation.equals("Clear"))
            {
               mainValue = 0;             
            }   
         }
         if ( operation.equals( "Quit"))
         {
            System.out.println( "Thanks for using Calculator, goodbye.");
         }
         else
         {   
            System.out.println( "Welcome to the Calculator...");
            System.out.println( "------------------");
            System.out.println( "[ " + mainValue + " ]");
            System.out.println( "------------------");
            System.out.println( "+, " + "-, " + "*, " + "/ " + "value"); 
            System.out.println( "Clear");
            System.out.println( "Quit");
            System.out.println( "------------------");
         }
      } while ( quitCounter < 1);     
   }
} // end class