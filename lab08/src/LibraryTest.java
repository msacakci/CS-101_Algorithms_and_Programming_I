import java.util.Scanner;

/**
 * Library Book Test Program 
 * @author Metehan Saçakçý
 * @version 25.11.2019
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      

      // variables
      String answer,
             searchTitle,
             potentialTitle,
             potentialAuthor;   
      Library library;
      
      LibraryBook currentBook;
      
      // program code
      library = new Library();
      currentBook = new LibraryBook( "A", "B");
      System.out.println( "------------------------------");
      System.out.println( "Welcome to the Library!");
      do
      {  
         System.out.println( "------------------------------");
         System.out.println( "- Show" + "\n" + "- Find" + "\n" + "- Add" + "\n" + "- Exit");
         System.out.print( "Please select one: ");
         answer = scan.next();
         
         if( answer.equals( "Show"))
         {
            System.out.println( library.toString());            
         }         
         if ( answer.equals( "Find"))
         {
            if ( library.isEmpty())
            {
               System.out.println( "!!Library is empty!!");              
            }
            else
            {   
               // Ask and get book title.
               System.out.print( "Please enter a book title:");
               searchTitle = scan.next();
               currentBook = library.findByTitle( searchTitle);
               if( currentBook != null)
               {                  
                  // With use that title find the book.
                  System.out.println( currentBook.toString());
                  System.out.println( "If you want to loan it, type \"Loan\": ");
                  System.out.println( "If you want to return it, type \"Return\": ");
                  System.out.println( "If you want to remove it, type \"Remove\": ");
                  answer = scan.next();                      
               }
               else
               {
                  System.out.println( "Couldn't find the book!");
               }   
               
               // Ask and get new due date.
               if ( answer.equals( "Loan"))
               {
                  System.out.print( "Please enter a new due date: ");
                  answer = scan.next();
                  currentBook.loanTheBook( answer);                    
               }  
               // Set empty string to book's due date.
               else if( answer.equals( "Return"))
               {
                  currentBook.returnTheBook();
                  System.out.println( "Book is returned.");
               }
               // Remove book entirely.
               else if ( answer.equals( "Remove"))
               {              
                  library.remove( currentBook);
                  System.out.println( "Book is removed.");
               }
            }
         }
         // Take title and name from user to add a new book to the library.
         if ( answer.equals( "Add"))
         {
            System.out.print( "Please enter a book title:");
            potentialTitle = scan.next();
            System.out.print( "Please enter a author name:");
            potentialAuthor = scan.next();
            library.add( potentialTitle, potentialAuthor);
            
         }   
         
      } while ( !answer.equals( "Exit"));
      System.out.println( "Goodbye!");
   }
}   