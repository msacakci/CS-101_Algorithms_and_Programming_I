import java.util.ArrayList;
/*
 * This is writen to create and manage library books.
 */ 
public class LibraryBook
{
   // properties
   private String title,
      author,
      dueDate;
   private int    timesLoaned;
   
   // constructors
   // It constructs created new library book.  
   public LibraryBook( String theTitle, String theAuthor)
   {
      title = theTitle;
      author = theAuthor;
      dueDate = "";
      timesLoaned = 0;
   }   
   
   // Copy constructor
   public LibraryBook( LibraryBook book)
   {
      title = book.getTitle();
      author = book.getAuthor();
   }     
   
   // methods
   // Write each information as String.   
   public String toString()
   {
      
      String result;    
      result = ( "" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Due Date: " + dueDate + "\n" + "Times Loaned: " + timesLoaned + "\n" + "" );      
      return result;      
   }
   
   public String toString( LibraryBook book )
   {
      
      String result;    
      result = ( "" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Due Date: " + dueDate + "\n" + "Times Loaned: " + timesLoaned + "\n" + "" );      
      return result;      
   }
   
   // Sets new due date.   
   public void loanTheBook( String newDueDate)
   {
      if ( !onLoan())
      {   
         dueDate = newDueDate;
         timesLoaned = timesLoaned + 1;
         System.out.println( "Book is loaned.");
      }
      else
      {
         System.out.println( "You cannot loan that book.");
      }   
   } 
   // Simply resets the due date with empty string.   
   public String returnTheBook()
   {
      dueDate = "";
      return dueDate;
   }   
   // get times loaned method returns the number of the loaned times.   
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   public String getTitle()
   {
      return title;
   }
   public String getAuthor()
   {
      return author;
   }   
   // on loan method check there is a due date and returns answer.   
   public boolean onLoan()
   {
      if( !dueDate.equals( ""))
      {
         return true;
      }
      else
      {
         return false;
      }               
   } 
   // To check are they equal or not. 
   public boolean equals( LibraryBook book)
   {
      if ( book.getTitle() == title && book.getAuthor() == author)
      {   
         return true; 
      }
      else
      {
         return false;
      }   
   }
   // To check their title
   public boolean hasSameTitle( LibraryBook book)
   {
      if ( book.getTitle() == title )
      {   
         return true; 
      }
      else
      {
         return false;
      }   
   }
   public boolean hasSameAuthor( LibraryBook book)
   {
      if ( book.getAuthor() == author)
      {   
         return true; 
      }
      else
      {
         return false;
      }    
   }   
}