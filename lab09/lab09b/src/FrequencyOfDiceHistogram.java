import java.util.Scanner;

/**
 * Frequency
 * @author Metehan Saçakçý
 * @version 24.11.2019
 */ 
public class FrequencyOfDiceHistogram
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
       // variable      
      double star,
             antiLine,
             multiplayer,
             number;
      DiceFaceRecorder dice;
      
      String column,
             graph;      
      
      int    index;
      // program code
      dice = new DiceFaceRecorder();
      
      dice.frequencyData();
      index = 0;
      antiLine = 10;
      multiplayer = 10;
      star = dice.frequency / 10;
      graph = "";
      System.out.println( dice.recorder );
      do
      {
         index = 0;
         do
         {   
            number = dice.recorder.get( index );
            if (  number  < star * multiplayer ) 
            {                          
               graph = graph + " ";
               
            }          
            else if ( number  >= star * multiplayer )
            {
               graph = graph + "*";
            }
            index = index + 1;
         } while ( index < dice.recorder.size());
         graph = graph + "\n";
         antiLine = antiLine - 1;
         multiplayer = multiplayer - 1;
      } while ( antiLine > 0 );
      System.out.println( graph);               
   }
   
}   

