import java.util.Scanner;

/**
 * lab04d
 * @author Metehan Sa�ak��
 * @version 29.10.2019
 */ 
public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      String ch;
      int widht;
      int count;
      int countTwo;
      
      // program code
      widht = 0;
      count = 0;
      countTwo = 0;      
      ch = scan.next();
      widht = scan.nextInt();
      while ( count < widht )
      {  
         countTwo = 0;
         while ( countTwo <= count )
         {   
            System.out.print( ch + " ");
            countTwo = countTwo + 1;                    
         }
         count = count + 1;
         System.out.print( "\n");         
      }
      
      //Part02
      double d;
      d = 0.1;
      while ( d < 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");      
   }   
} // end class