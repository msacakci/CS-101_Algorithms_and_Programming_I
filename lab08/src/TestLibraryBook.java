import java.util.Scanner;

/**
 * Library Book Test Program 
 * @author Metehan Sa?ak??
 * @version 25.11.2019
 */ 
public class TestLibraryBook
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      LibraryBook book1;
      LibraryBook book2;
      // program code
      book1 = new LibraryBook( "Nutuk", "Atat?rk");
      book2 = new LibraryBook( "Dirili?", "?zakman");
            
      System.out.println( book1.toString());
      
      System.out.println( "--------------------------");
      
      book1.loanTheBook( "20.12.2019");        
      System.out.println( book1.getTimesLoaned());      
      System.out.println( book1.onLoan());
      System.out.println( book1.toString());
      
      System.out.println( "--------------------------");
      
           
      System.out.println( book1.returnTheBook());         
      System.out.println( book1.getTimesLoaned());     
      System.out.println( book1.onLoan());  
      System.out.println( book1.toString());
      
      System.out.println( "--------------------------");
      
          
      book1.loanTheBook( "27.01.2020");    
      System.out.println( book1.getTimesLoaned());      
      System.out.println( book1.onLoan());
      System.out.println( book1.toString());
      
      System.out.println( "--------------------------");
      
      if( book1 == book2)
      {
         System.out.println( "They are equal!");
      }
      else
      {
         System.out.println( "They are not equal!(Clone)");
      } 
      
      if ( book1.equals( book2))
      {
         System.out.println( "02 They are equal!(Clone)");         
      } 
      else
      {
         System.out.println( "02 They are not equal!");
      }
      System.out.println( "--------------------------");

      book1 = new LibraryBook( "Nutuk", "Atat?rk");
      book2 = new LibraryBook( "Nutuk", "Atat?rk");
      
      if ( book1.equals( book2))
      {
         System.out.println( "02 They are equal!(Clone)");         
      } 
      else
      {
         System.out.println( "02 They are not equal!(Clone)");
      }
      System.out.println( "--------------------------");     
      
      // Same title method
      System.out.println( book1.hasSameTitle( book2));                         
                         
      // Same author method
      System.out.println( book1.hasSameAuthor( book2));
      System.out.println( "--------------------------");     
      
      book1 = new LibraryBook( "A", "A");
      book2 = new LibraryBook( "Nutuk", "Atat?rk");      
      
      // Same title method
      System.out.println( book1.hasSameTitle( book2));                         
                         
      // Same author method
      System.out.println( book1.hasSameAuthor( book2));
      System.out.println( "--------------------------"); 
      
      // Copy constructor
      book2 = new LibraryBook ( book1);
      
      // Same title method
      System.out.println( book1.hasSameTitle( book2));                         
                         
      // Same author method
      System.out.println( book1.hasSameAuthor( book2));
      System.out.println( "--------------------------");
      
      // (a) two references to a single object
      book1 = book2;
      System.out.println( "a");
      if( book1 == book2)
      {
         System.out.println( "They are equal!");
      }
      else
      {
         System.out.println( "They are not equal!");
      } 
      
      if ( book1.equals( book2))
      {
         System.out.println( "02 They are equal!(Clone)");         
      } 
      else
      {
         System.out.println( "02 They are not equal!(Clone)");
      }
      System.out.println( "--------------------------");      
      // b) two references to two individual objects with different properties.
      System.out.println( "b");
      book1 = new LibraryBook( "A", "A");
      book2 = new LibraryBook( "Nutuk", "Atat?rk");
      
      if( book1 == book2)
      {
         System.out.println( "They are equal!");
      }
      else
      {
         System.out.println( "They are not equal!");
      } 
      
      if ( book1.equals( book2))
      {
         System.out.println( "02 They are equal!(Clone)");         
      } 
      else
      {
         System.out.println( "02 They are not equal!(Clone)");
      }
      // (c) two references to two individual objects with identical relevant properties.
      System.out.println( "--------------------------");
      System.out.println( "c");
      book1 = new LibraryBook( "Nutuk", "Atat?rk");
      book2 = new LibraryBook( "Nutuk", "Atat?rk");
      if( book1 == book2)
      {
         System.out.println( "They are equal!");
      }
      else
      {
         System.out.println( "They are not equal!");
      } 
      
      if ( book1.equals( book2))
      {
         System.out.println( "02 They are equal!(Clone)");         
      } 
      else
      {
         System.out.println( "02 They are not equal!(Clone)");
      }
      
   }

} // end class