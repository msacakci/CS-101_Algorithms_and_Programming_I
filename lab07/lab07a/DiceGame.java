// This class is writen to roll two dies (dice) and returns the result.
public class DiceGame
{
   // properties
   Die die1 = new Die();
   Die die2 = new Die();
   Dice dice = new Dice( );
   
   // constructors

   // methods
   public String play()
   {
      //variables
      int attemptNumber;
      
      String totalAttemptNumberAsString,
             result;
      
      // program code
      attemptNumber = 1;
      // It rolls both dies until both of them have number six.      
      do
      {
         dice.rollBothDie();
         
         totalAttemptNumberAsString = "" + "Attempt number is " + attemptNumber;
         result = "" + totalAttemptNumberAsString + "\n" + dice.toString() + "\n" + "--------------------";
         System.out.println( result);
         
         attemptNumber = attemptNumber + 1;
      } while( dice.getDiceTotal() != 12 );
      
      return "Goodbye!";
   }   
}