import java.util.Scanner;

/**
 * Row and Column 
 * @author Metehan Saçakçý
 * @version 04.11.2019
 */ 
public class lab05b01
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int row;
      int column;
      int counter;
      int columnCounter;
      int rowCounter;
      int currentRow;
      int spaceCounter;
      int spaceCounterTwo;
      int space;
      String cell;

      // program code
      row = 0;
      column = 0;
      columnCounter = 0;
      rowCounter = 0;
      currentRow = 1;
      spaceCounter = 0;
      space = 0;
      System.out.println( "Please enter row and column respectively:");
      row = scan.nextInt();
      column = scan.nextInt();
      do
      { 
         columnCounter = 0;
         rowCounter = 0;
         do
         {               
            columnCounter = columnCounter + 1;
            cell = ( currentRow + "," + columnCounter );
            space = 6 - cell.length();
            for ( spaceCounterTwo = 0; spaceCounterTwo < space; spaceCounterTwo++)
            {     
               System.out.print(" ");
            }
            System.out.print( cell );
            rowCounter = rowCounter + 1;
         } while ( columnCounter < column );
         
         System.out.print( "\n");
         currentRow = currentRow + 1;        
      } while ( currentRow <= row );
      
      System.out.print( "\n");                        
   }
} // end class