import java.util.ArrayList;
/*
 *Library that manages four books.
 */
public class Library
{
   // properties
  private ArrayList<LibraryBook> list;
 
   // constructor
   //LibraryBook list
   public Library ()
   {
      list = new ArrayList<LibraryBook>();

   }   
   
   // methods
   
   // To check is there any book.
   public boolean isEmpty()
   {
      if( list == null )
      {
         return true;
      }   
      else
      {
         return false;
      }   
   }   
   public String toString()
   {
      // variables
      String result;
      int totalBookNumber,
          bookNumberCounter,
          index;
      
      // program code
      totalBookNumber = list.size();
      bookNumberCounter = 1;
      index = 0;
      result = "";
      for( LibraryBook i: list)
      {
         result = result + "Book " + bookNumberCounter + " " + i + "\n";
        
         bookNumberCounter = bookNumberCounter + 1;
      }
                          
      return result;
   } 
   
   // To add title and author.
   public void addd( String title, String author)
   {
      //variable      
      list.add( new LibraryBook ( title, author));
   } 
   
   // To remove a book.
   public void remove( LibraryBook book )
   {  
      // variables
      String result;
      int totalBookNumber,
          bookNumberCounter,
          index;
      // program code
      totalBookNumber = list.size();
      index = 0;
      for( index = 0; index < totalBookNumber; index++)               
      {                  
         if ( book.equals( list.get( index)))
         {
            list.remove( index);
         }                   
      } 
   }
   
   // To find a book from a title.
   public LibraryBook findByTitle( String title)
   { 
      String result;
      int bookNumberCounter2,
          index2,
          equalFounder;
          
      LibraryBook titleBook;
      // program code
      titleBook = new LibraryBook( "A", "B");
      equalFounder = 0;
      
      index2 = 0;
      for ( index2 = 0; index2 < list.size(); index2++)
      {
         titleBook = list.get(index2);
         if ( title.equals( list.get(index2).getTitle( )))
         {
            return titleBook;
            //equalFounder = equalFounder + 1;
         }           
      }
      return null;
   }   
   
}   