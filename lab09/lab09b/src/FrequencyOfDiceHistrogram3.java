import java.util.Scanner;

/**
 * Frequency
 * @author Metehan Sa�ak��
 * @version 24.11.2019
 */ 
public class FrequencyOfDiceHistrogram3
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
      
      dicegame.getFrequency();
      
      //System.out.println( dicegame.histogram());

   }

} // end class