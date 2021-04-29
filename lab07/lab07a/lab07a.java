import java.util.Scanner;
   /*
    * Rolling Dice
    * @author Metehan Saçakçý
    * @version 24.11.2019
    */
public class lab07a
{
   public static int roll()
   {
      // variables
      int theCurrentFaceValueOfDice;
                           
      // program code
      
// Calculate current dice number with Math.random method and return it.
      theCurrentFaceValueOfDice = ( int ) ( ( Math.random() * 6 ) + 1 );                       
      return theCurrentFaceValueOfDice;
   } //end of roll method 
            
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int die1,
          die2,
          die3,
          die4,
          attemptNumber;
      
      // program code
      attemptNumber = 1;
      
      // Roll both dies individually  and if there is a two six  stop the program.      
      do
      {
         die1 = roll();
         die2 = roll();
         die3 = roll();
         die4 = roll();

         System.out.println( "Attempt number is " + attemptNumber);
         System.out.println( "First die's number is " + die1);
         System.out.println( "Second die's number is " + die2);
         System.out.println( "Third die's number is " + die3);
         System.out.println( "Fourth die's number is " + die4);
         
         System.out.println( "\n");
         attemptNumber = attemptNumber + 1;
      } while ( die1 + die2 + die3 + die4 != 24 );
      System.out.println( "We have two six!");
   }
   
}   