import java.util.Scanner;

/**
 * Frequency
 * @author Metehan Saçakçý
 * @version 24.11.2019
 */ 
public class FrequencyOfDiceHistogram2
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      DiceFaceRecorder dicegame;      

      // program code
      dicegame = new DiceFaceRecorder();
      
      dicegame.frequencyData2();
      
      System.out.println( "-------------------------");
      
      System.out.println( dicegame.histogram());

   }

} // end class