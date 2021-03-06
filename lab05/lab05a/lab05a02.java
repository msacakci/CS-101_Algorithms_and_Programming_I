import java.util.Scanner;

/**
 * Stars and Hole 
 * @author Metehan Sa?ak??
 * @version 05.11.2019
 */ 
public class lab05a02
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
      int infinite;
      
      // program code
      String lastAnswer = "-";
      // Quit Controller Unit
      for ( infinite = 2; infinite > 1 ; infinite++)  
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
         space = width - ( 2 * thickness );
         //Part01
         if ( width < 0 || height < 0 || thickness < 0 )
         {
            System.out.println( "Values cannot be negative!");
         }
         // Hole detection unit
         else if ( height - ( 2 * thickness ) > 0 && width - ( 2 * thickness ) > 0 )
         {
            for ( heightCounter = 0; heightCounter < thickness; heightCounter++)
            {
               for ( widthCounter = 0; widthCounter < width; widthCounter++ )
               {
                  System.out.print( "*");
               }               
               System.out.print( "\n");
            } 
            //Part02
            for (spaceLine = 0; spaceLine < height - ( 2 * thickness); spaceLine++)
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
               System.out.print( "\n");
               heightCounter = heightCounter + 1;
            } 
            for (heightCounter = heightCounter; heightCounter < height; heightCounter++)
            {
               for ( widthCounter = 0; widthCounter < width; widthCounter++)
               {
                  System.out.print( "*");
               }
               System.out.print( "\n"); 
            }
         }
         else
         {
            for ( heightCounter = 0; heightCounter < height; heightCounter++)
            {
               for ( widthCounter = 0; widthCounter < width; widthCounter++)
               {
                  System.out.print( "*");
               }                             
               System.out.print( "\n"); 
            } 
            System.out.println( "Oops... no hole!");            
         }
         System.out.println( "If you wish to create another pattern, press Y or y:");
         lastAnswer = scan.next();
         if ( lastAnswer.equals("Y") || lastAnswer.equals("y") )
         { 
            infinite = +5; 
         }
         else
         {
            infinite = -5;
         }      
      }
      System.out.println( "Goodbye!");                             
   }
} // end class