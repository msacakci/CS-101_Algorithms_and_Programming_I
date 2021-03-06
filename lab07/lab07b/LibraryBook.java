/*
 * This is writen to create and manage library books.
 */ 
public class LibraryBook
{
   // properties
   String title,
          author,
          dueDate;
   int    timesLoaned;
   
   // constructors
   // It constructs created new library book.  
   public LibraryBook( String theTitle, String theAuthor)
   {
      title = theTitle;
      author = theAuthor;
      dueDate = "";
      timesLoaned = 0;
   }   
   
   // methods
   // Write each information as String.   
   public String toString()
   {
     
      String result;    
      result = ( "" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Due Date: " + dueDate + "\n" + "Times Loaned: " + timesLoaned + "\n" + "" );      
      return result;      
   }
   // Sets new due date.   
   public void loanTheBook( String newDueDate)
   {
      dueDate = newDueDate;
      timesLoaned = timesLoaned + 1;      
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
}