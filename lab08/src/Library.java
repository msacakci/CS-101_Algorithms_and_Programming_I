/*
 *Library that manages four books.
 */
public class Library
{
   // properties
  private LibraryBook b1,
                      b2,
                      b3,
                      b4;
   
   // constructor
   //LibraryBook b1, LibraryBook b2, LibraryBook b3, LibraryBook b4   
   public Library ()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }   
   
   // methods
   
   // To check is there any book.
   public boolean isEmpty()
   {
      if( b1 == null && b2 == null && b3 == null && b4 == null )
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
      
      // program code
      result = "Book1 = " + "\n" + b1 + "\n" + "Book2 = " + "\n" + b2 + "\n" + "Book3 = " + "\n" + b3 + "\n" + "Book4 = " + "\n" + b4 + "\n";
      return result;
   } 
   
   // To add title and author.
   public void add( String title, String author)
   {
      if ( b1 == null )
      {
         b1 = new LibraryBook ( title, author);
      }   
      else if ( b2 == null )   
      {
         b2 = new LibraryBook ( title, author);
      }  
      else if ( b3 == null )   
      {
         b3 = new LibraryBook ( title, author);
      }   
      else if ( b4 == null )   
      {
         b4 = new LibraryBook ( title, author);
      }   
   } 
   
   // To remove a book.
   public void remove( LibraryBook book )
   {
      if ( book.equals( b1) )
      {
         b1 = null;
      }
      else if( book.equals( b2) )
      {
         b2 = null;
      } 
      else if( book.equals( b3) )
      {
         b3 = null;
      }   
      else if( book.equals( b4) )
      {
         b4 = null;
      }       
   }
   
   // To find a book from a title.
   public LibraryBook findByTitle( String title)
   {      
      if ( b1 != null && b1.getTitle().equals( title ))
      {
         return b1;
      }
      else if( b2 != null && b2.getTitle().equals( title ))
      {
         return b2;
      } 
      else if( b3 != null && b3.getTitle().equals( title))
      {
         return b3;
      }   
      else if( b4 != null && b4.getTitle().equals( title))
      {
         return b4;
      } 
      else
      {   
      return null ;
      }
   }   
   
   
}   