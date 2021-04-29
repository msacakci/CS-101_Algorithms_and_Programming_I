import java.util.Scanner;

/**
 * Let's Roll Dice
 * @author Metehan Saçakçý
 * @version 24.11.2019
 */ 
public class TestDiceGame
{
   public static void main( String[] args)
   {

      // constants

      // variables
      DiceGame dicegame;      

      // program code
      dicegame = new DiceGame();
      
      System.out.println( dicegame.play());

   }

} // end class