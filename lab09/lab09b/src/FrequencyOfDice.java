import java.util.Scanner;

/**
 * Frequency
 * @author Metehan Sa?ak??
 * @version 11.12.2019
 */ 
public class FrequencyOfDice
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      DiceFaceRecorder dicegame;      

      // program code
      dicegame = new DiceFaceRecorder();
      
      System.out.println( dicegame.frequencyData());
      
      System.out.println( "-------------------------");
      
      System.out.println( dicegame.histogram());

   }

} // end class