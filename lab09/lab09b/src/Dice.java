public class Dice
{
   //properties
   Die die1 = new Die();
   Die die2 = new Die();   
   
   //constructors
   
   
   //methods
   public int rollBothDie()
   {
      // variables
      int result;
      
      // program code
// Roll both die's individually and than add them together. Then give the result.      
      result = die1.roll() + die2.roll();
      return result;
   }   
// These method shows face values of the dice.   
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   } 
   
   public int getDie2FaceValue() 
   {
      return die2.getFaceValue();
   } 
   
// This method gives the total values of the dice.  
   public double getDiceTotal()
   {
      //variables
      int result;
      
      //program code
      result = getDie1FaceValue() + getDie2FaceValue();
      
      return result;
   }
   
   public String toString()
   {
      // variables
      String result;
      
      //program code
      result = "" + "Current face value of the first die is " + getDie1FaceValue() + "\n" + "Current face value of the second die is " + getDie2FaceValue() + "\n" + "Their sum is " + getDiceTotal() + "\n";      
      
      return result;
   }   
}   