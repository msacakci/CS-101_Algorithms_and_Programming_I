import java.util.Scanner;

/**
 * Stars and Hole 
 * @author Metehan Saçakçý
 * @version 05.11.2019
 */ 
public class lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int width;
      int height;
      int thickness;
      int widthCounter;
      int heightCounter;
      int thicknessCounter;
      int space;
      int spaceCounter;
      int spaceLine;
      String lastAnswer;

      // program code
      do
      {          
         widthCounter = 0;
         heightCounter = 0;
         thicknessCounter = 0;
         space= 0;
         spaceCounter = 0;
         spaceLine = 0;
         System.out.println( "Please enter width, height and thickness, respectively:");
         width = scan.nextInt();
         height = scan.nextInt();
         thickness = scan.nextInt();
         space = width - (2 * thickness);
         //Part01
         if ( width < 0 || height < 0 || thickness < 0)
         {
            System.out.println( "Values cannot be negative!");
         }            
         else if ( height - (2 * thickness) > 0 && width - (2 * thickness) > 0)
         {
            do
            {
               for ( widthCounter = 0; widthCounter < width; widthCounter++)
               {
                  System.out.print( "*");
               }
               heightCounter = heightCounter + 1;
               System.out.print( "\n");
            }  while ( heightCounter < height && heightCounter < thickness ); 
            //Part02
            do
            {   
               for( widthCounter = 0; widthCounter < thickness; widthCounter++)
               {
                  System.out.print( "*");
               }
               for( spaceCounter = 0; spaceCounter < space; spaceCounter++)
               {
                  System.out.print( " ");
               }
               for( widthCounter = 0; widthCounter < thickness; widthCounter++)
               {
                  System.out.print( "*");
               }
               heightCounter = heightCounter + 1;
               System.out.print( "\n");
               spaceLine = spaceLine + 1;               
            }  while ( heightCounter < height && spaceLine < height - (2 * thickness));
            do
            {
               for ( widthCounter = 0; widthCounter < width; widthCounter++)
               {
                  System.out.print( "*");
               }
               heightCounter = heightCounter + 1;
               System.out.print( "\n"); 
            } while ( heightCounter < height );  
         }
         else
         {
            do
            {
               for ( widthCounter = 0; widthCounter < width; widthCounter++)
               {
                  System.out.print( "*");
               }
               heightCounter = heightCounter + 1;
               System.out.print( "\n"); 
            }  while ( heightCounter < height );
            System.out.println( "Oops... no hole!");            
         }
         System.out.println( "If you wish to create another pattern, press Y or y:");
         lastAnswer = scan.next();
      } while ( lastAnswer.equals("Y") || lastAnswer.equals("y") );
      System.out.println( "Goodbye!");                             
   }
} // end class
