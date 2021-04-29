import java.util.Scanner;

/**
 * Garden Flower Counter 
 * @author Metehan Saçakçý
 * @version 16.10.2019
 */ 
public class lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
      final int FLOWER = 17;

      // variables      
      double edgeOne;
      
      double edgeTwo;
      
      double edgeThree;   
                                     

      // program code      
      System.out.println( "Welcome to the Garden Flower Counter");
      
      System.out.println( "Please enter first edge:");
      
      edgeOne = scan.nextDouble();
      
      System.out.println( "Please enter second edge:");
      
      edgeTwo = scan.nextDouble();
      
      System.out.println( "Please enter third edge:");
      
      edgeThree = scan.nextDouble();
      
      System.out.println( "Please enter flower number:");
            
      
      double semiPerimeterT = (edgeOne + edgeTwo + edgeThree)/ 2 ;
      
      double area = Math.sqrt(semiPerimeterT * (semiPerimeterT - edgeOne) * (semiPerimeterT - edgeTwo) * (semiPerimeterT - edgeThree));
      
      System.out.println( " The area of the garden is " + area );
      
      System.out.println( (int) (area * FLOWER) );
      
      
      
          

   }

} // end class