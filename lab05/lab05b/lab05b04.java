import java.util.Scanner;

/**
 * Cells with Strings 
 * @author Metehan Saçakçý
 * @version 04.11.2019
 */ 
public class lab05b04
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String string = "-";
      // variables
      int row;
      int column;
      int counter;
      int columnCounter;
      int rowCounter;
      int currentRow;
      int cellNumber;
      int stringCounter;
      String cell;
      int space;
      int spaceCounterTwo;

      // program code
      spaceCounterTwo = 0;
      row = 0;
      column = 0;
      columnCounter = 0;
      rowCounter = 0;
      currentRow = 1;
      cellNumber = 0;
      stringCounter = 0;
      System.out.println( "Please enter row and column respectively:");
      row = scan.nextInt();
      column = scan.nextInt();
      do
      { 
         columnCounter = 0;
         rowCounter = 0;
         System.out.print( currentRow );
         columnCounter = columnCounter + 1;
         do
         {              
            cell = "" + currentRow + string;
            space = 6 - cell.length();
            for ( spaceCounterTwo = 0; spaceCounterTwo < space; spaceCounterTwo++)
            {     
               System.out.print(" ");
            }
            System.out.print( string );
            cellNumber = cellNumber + 1;
            columnCounter = columnCounter + 1;                        
         } while ( columnCounter < column );
         System.out.print( "\n");
         currentRow = currentRow + 1;
      } while ( currentRow <= row );
   }
} // end class