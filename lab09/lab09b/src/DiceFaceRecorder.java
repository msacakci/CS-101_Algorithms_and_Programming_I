import java.util.ArrayList;
/**
 * To roll dice 1000 times and record the their frequency.
 * @author Metehan Saçakçý
 * Date: 11.12.2019
 */
public class DiceFaceRecorder
{
   // properties
   ArrayList<Double>  recorder = new ArrayList<Double>();
   private Dice dice = new Dice();
   double frequency,
          frequency1,
          frequency2,
          frequency3,
          frequency4,
          frequency5,             
          frequency6,
          frequency7,
          frequency8,
          frequency9,
          frequency10,
          frequency11;
   
   // constructor
   public DiceFaceRecorder()
   {
      //variable
      int index;
      for( index = 0; index < 11; index++ )
      {   
      recorder.add( 0.0);
      }   
   }   
   
   //methods
   public String frequencyData()
   {
      //variables
      int    aNumber;      
      String totalAttemptNumberAsString,
             result;
                  
      // program code
      aNumber = 1;
      frequency = 0;
      frequency1 = 0;
      frequency2 = 0;
      frequency3 = 0;
      frequency4 = 0;
      frequency5 = 0;
      frequency6 = 0;
      frequency7 = 0;
      frequency8 = 0;
      frequency9 = 0;
      frequency10 = 0;
      frequency11 = 0;
      do
      {
         dice.rollBothDie();
         frequency = frequency + ( dice.getDiceTotal() / 36 );
         totalAttemptNumberAsString = "" + "Attempt number is " + aNumber;
         result = "" + totalAttemptNumberAsString + "\n" + dice.toString() + "\n" + "--------------------";
         System.out.println( result);
         if ( dice.getDiceTotal() == 2 )
         {
            frequency1 = frequency1 + 1;
            recorder.set( 0, frequency1);
         }
         else if (dice.getDiceTotal() == 12 )
         {   
            frequency2 = frequency2 + 1;
            recorder.set( 10, frequency2);
         }
         else if (dice.getDiceTotal() == 3 )
         {
            frequency3 = frequency3 + 1;
            recorder.set( 1, frequency3);
         }   
         else if (dice.getDiceTotal() == 11 )
        {
            frequency4 = frequency4 + 1;
            recorder.set( 9, frequency4);
         }   
         else if (dice.getDiceTotal() == 4 )
         {
            frequency5 = frequency5 + 1;
            recorder.set( 2, frequency5);
         }   
         else if (dice.getDiceTotal() == 10 )
         {
            frequency6 = frequency6 + 1;
            recorder.set( 8, frequency6);
         }   
         else if (dice.getDiceTotal() == 5 )
         {
            frequency7 = frequency7 + 1;
            recorder.set( 3, frequency7);
         }   
         else if (dice.getDiceTotal() == 9 )
         {
            frequency8 = frequency8 + 1;
            recorder.set( 7, frequency8);
         }   
         else if (dice.getDiceTotal() == 6 )
         {
            frequency9 = frequency9 + 1;
            recorder.set( 4, frequency9);
         }
         else if (dice.getDiceTotal() == 8 )
         {

            frequency10 = frequency10 + 1;
            recorder.set( 6, frequency10);
         }   
         else if (dice.getDiceTotal() == 7 )
         {
            frequency11 = frequency11 + 1;
            recorder.set( 5, frequency11);
         } 
         aNumber = aNumber + 1;                           
      } while( aNumber <= 100 ); 
      
      frequency = Math.round(frequency);
      result = result + "\n" + "Frequency Distribution for 1000 dice rolls is equals " + frequency + "\n";
      return result;
   }
   
   public String histogram()      
   {
      // variable      
      double star,
             antiLine,
             multiplayer,
             number;
      
      String column,
             graph;      
      
      int    index;
      // program code
      index = 0;
      antiLine = 10;
      multiplayer = 10;
      star = frequency / 10;
      graph = "";
      System.out.println( recorder );
      do
      {
         index = 0;
         do
         {   
            number = recorder.get( index );
            if (  number  < star * multiplayer ) 
            {                          
               graph = graph + " ";
               
            }          
            else if ( number  >= star * multiplayer )
            {
               graph = graph + "*";
            }
            index = index + 1;
         } while ( index < recorder.size());
         graph = graph + "\n";
         antiLine = antiLine - 1;
         multiplayer = multiplayer - 1;
      } while ( antiLine > 0 );
      return graph;               
   } 
   
   public void getFrequency()
   {
     System.out.println( recorder );  
   }   
   
   public void frequencyData2()
   {
      //variables
      int    aNumber;      
      String totalAttemptNumberAsString,
             result;
                  
      // program code
      aNumber = 1;
      frequency = 0;
      frequency1 = 0;
      frequency2 = 0;
      frequency3 = 0;
      frequency4 = 0;
      frequency5 = 0;
      frequency6 = 0;
      frequency7 = 0;
      frequency8 = 0;
      frequency9 = 0;
      frequency10 = 0;
      frequency11 = 0;
      do
      {
         dice.rollBothDie();
         frequency = frequency + ( dice.getDiceTotal() / 36 );
         totalAttemptNumberAsString = "" + "Attempt number is " + aNumber;
         result = "" + totalAttemptNumberAsString + "\n" + dice.toString() + "\n" + "--------------------";
//         System.out.println( result);
          if ( dice.getDiceTotal() == 2 )
         {
            frequency1 = frequency1 + 1;
            recorder.set( 0, frequency1);
        }
         else if (dice.getDiceTotal() == 12 )
         {   
            frequency2 = frequency2 + 1;
            recorder.set( 10, frequency2);
         }
         else if (dice.getDiceTotal() == 3 )
         {
            frequency3 = frequency3 + 1;
            recorder.set( 1, frequency3);
         }   
         else if (dice.getDiceTotal() == 11 )
        {
            frequency4 = frequency4 + 1;
            recorder.set( 9, frequency4);
         }   
         else if (dice.getDiceTotal() == 4 )
         {
            frequency5 = frequency5 + 1;
            recorder.set( 2, frequency5);
         }   
         else if (dice.getDiceTotal() == 10 )
         {
            frequency6 = frequency6 + 1;
            recorder.set( 8, frequency6);
         }   
         else if (dice.getDiceTotal() == 5 )
         {
            frequency7 = frequency7 + 1;
            recorder.set( 3, frequency7);
         }   
         else if (dice.getDiceTotal() == 9 )
         {
            frequency8 = frequency8 + 1;
            recorder.set( 7, frequency8);
         }   
         else if (dice.getDiceTotal() == 6 )
         {
            frequency9 = frequency9 + 1;
            recorder.set( 4, frequency9);
         }
         else if (dice.getDiceTotal() == 8 )
         {

            frequency10 = frequency10 + 1;
            recorder.set( 6, frequency10);
         }   
         else if (dice.getDiceTotal() == 7 )
         {
            frequency11 = frequency11 + 1;
            recorder.set( 5, frequency11);
         } 
         aNumber = aNumber + 1;                           
      } while( aNumber <= 1000 ); 
      
      frequency = Math.round(frequency);
//      result = result + "\n" + "Frequency Distribution for 1000 dice rolls is equals " + frequency + "\n";
//      return result;
   }
}