import java.util.Scanner;

/**
 * Webpage Designer
 * @author Metehan Saçakçý
 * @version 16.10.2019
 */ 
public class lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
     
      final String P1 = "<!DOCTYPE html>\n\n" + "<html>\n\n" + "<head>\n";
      final String P2 = "<title>";
      final String P3 = "</title>\n";
      final String P4 = "</head>\n\n";
      final String P5 = "<body>\n\n";
      final String P6 = "<hr>";
      final String P7 = "<h1>";
      final String P8 = "</h1>\n";
      final String P9 = "<p>";
      final String P10 = "</p>\n";  
      final String P11 = "</body>\n\n";
      final String P12 =  "</html>";
      
      // variables
      
      String name;
      int age;
      int salary;
      String comments;
         

      // program code
      
      System.out.println( "Please enter the name:");
      
      name = scan.nextLine();
      
      System.out.println( "Please enter the comments:");
      
      comments = scan.nextLine();
      
      System.out.println( "Please enter the age:");
      
      age = scan.nextInt();
      
      System.out.println( "Please enter the salary:");
      
      salary = scan.nextInt();
      
      
      
      System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6); 
      System.out.println( P7 + "Name: " + name + P8 + P9 + "Age: " + age + P10 + P9 + "Salary: " + salary + P10 + P9 + "Comments: " + comments + P10 + P6 );
      System.out.println ( P11 + P12 );
      
      


   }

} // end class
