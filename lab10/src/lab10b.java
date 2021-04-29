import java.util.Scanner;

/**
 * Create, Compare and report the Biggest Number
 * @author Metehan Saçakçý
 * @version 17.12.2019
 */ 
public class lab10b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      BigNum b1,
             b2,
             b3;
      // variables
     
      int randomNumber,
          index,
          localBase,
          localSize,
          localResult;
      int[] list;
      String resultAsString;
      
      // program code
       b1 = new BigNum();
      //localBase = b1.BASE;
      list = new int[b1.SIZE];
      localSize = b1.SIZE;
      resultAsString = "";
      for( index = 0; index < b1.SIZE; index++ )
      {
         localBase = (int) Math.round(( Math.random() * ( b1.BASE - 1) ));
         localResult = localBase;
         list[index] = localResult;
      }
      for( index = 0; index < list.length ; index++)
      {
         resultAsString = resultAsString + list[index];
      }
      //Calculated random result:
      System.out.println( resultAsString);
      b1 = new BigNum ( resultAsString);
      System.out.println( b1.toString());
   }
   
}   