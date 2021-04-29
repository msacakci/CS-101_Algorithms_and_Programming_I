import java.util.Scanner;
import java.util.ArrayList;

/**
 * Let's Roll Dice
 * @author Metehan Saçakçý
 * @version 24.11.2019
 */ 
public class TestDiceGame
{
   public static ArrayList frequency()
   {
      // constants

      // variables
      ArrayList<Double>  recorder = new ArrayList<Double>();
      Dice dice = new Dice();      
      int index,
          aNumber;
      double frequency,
             frequency1;
             
      String totalAttemptNumberAsString,
             result;
      // program code
      aNumber = 1;
      frequency = 0;
      frequency1 = 0;      
      totalAttemptNumberAsString = "";
      for( index = 0; index < 12; index++ )
      {   
      recorder.add( 0.0);
      }                 
      for( aNumber = 1; aNumber <= 1000; aNumber++ )
      {
         dice.rollBothDie();
         frequency = frequency + ( dice.getDiceTotal() / 36 );
         //totalAttemptNumberAsString = "" + "Attempt number is " + aNumber;
         //result = "" + totalAttemptNumberAsString + "\n" + dice.toString() + "\n" + "--------------------";
         //System.out.println( result);
         frequency1 = recorder.get( (int) dice.getDiceTotal() - 2) + 1;
         recorder.set ( (int) dice.getDiceTotal() - 2, frequency1);
         aNumber = aNumber + 1;                           
      } 
      
      frequency = Math.round(frequency);
      recorder.set( 11, frequency);     
      //System.out.println( recorder); 
      return recorder;
   }   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variable
      ArrayList<Double>  recorder2 = new ArrayList<Double>();
      double star,
             antiLine,
             multiplayer,
             number,
             frequency2;
      String column,
             graph;      
      
      int    index;
      // program code
      recorder2 = frequency();
      index = 0;
      antiLine = 10;
      multiplayer = 10;
      star = 0;
      graph = "";
      frequency2 = Math.round( recorder2.get(11));
      System.out.println( frequency() );
//      for( index = 0; index < recorder2.size() - 1; index++)
//      {
//         frequency2 = frequency2 + recorder2.get( index);
//      }        
      star = frequency2 / 10;
      System.out.println( star);
      do
      {
         index = 0;
         do
         {   
            number = recorder2.get( index );
            if (  number  < star * multiplayer ) 
            {                          
               graph = graph + " ";
               
            }          
            else if ( number  >= star * multiplayer )
            {
               graph = graph + "*";
            }
            index = index + 1;
         } while ( index < recorder2.size() - 1);
         graph = graph + "\n";
         antiLine = antiLine - 1;
         multiplayer = multiplayer - 1;
      } while ( antiLine > 0 );
      System.out.println( graph);               
   }

} // end class