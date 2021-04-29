// header comment
public class DiceGame
{
   // properties
   Dice dice = new Dice();
   
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
      
      do
      {
         dice.rollBothDie();
         
         totalAttemptNumberAsString = "" + "Attempt number is " + attemptNumber;
         result = "" + totalAttemptNumberAsString + "\n" + dice.toString() + "\n" + "--------------------";
         System.out.println( result);
         
         attemptNumber = attemptNumber + 1;
      } while( dice.getDiceTotal() != 12 );
      
//      totalAttemptNumberAsString = "" + "Total attempt number is " + attemptNumber;
//      result = "" + dice.toString() + totalAttemptNumberAsString;
//      return totalAttemptNumberAsString;
      return "Goodbye!";
   }   
}