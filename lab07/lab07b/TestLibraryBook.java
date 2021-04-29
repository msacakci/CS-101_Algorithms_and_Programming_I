import java.util.Scanner;

/**
 * Library Book Test Program 
 * @author Metehan Sa�ak��
 * @version 25.11.2019
 */ 
public class TestLibraryBook
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      LibraryBook book;
      // program code
      book = new LibraryBook( "Nutuk", "Atat�rk");
      System.out.println( book.toString());
      
      System.out.println( "--------------------------");
      
      book.loanTheBook( "20.12.2019");        
      System.out.println( book.getTimesLoaned());      
      System.out.println( book.onLoan());
      System.out.println( book.toString());
      
      System.out.println( "--------------------------");
      
           
      System.out.println( book.returnTheBook());         
      System.out.println( book.getTimesLoaned());     
      System.out.println( book.onLoan());  
      System.out.println( book.toString());
      
      System.out.println( "--------------------------");
      
          
      book.loanTheBook( "27.01.2020");    
      System.out.println( book.getTimesLoaned());      
      System.out.println( book.onLoan());
      System.out.println( book.toString());
      
      System.out.println( "--------------------------");
   }

} // end class