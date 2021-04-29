import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;



/**
 * Webpage Designer
 * @author Metehan Saçakçý
 * @version 23.10.2019
 */ 
public class lab03c
{
   public static void main( String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner( System.in);
      PrintStream originalStdOut = System.out;
      
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
      final String P13 = "<img src=";
      final String P14 = ">";   
      final String P15 = "\n<h1>";
      
      // variables
      
      String name;
      int age;
      double grossSalary;
      String comments;
      String picture;
      double netSalaryOne;
      
      
      // program code
      netSalaryOne = 0;
      System.out.println( "Please enter the name:");
      
      name = scan.nextLine();
      
      System.out.println( "Please enter the comments:");
      
      comments = scan.nextLine();
      
      System.out.println( "Please enter emplolee's picture file name:");
      
      picture = scan.nextLine();
      
      if ( !Files.exists( Paths.get( picture ) ))
      {
         System.out.println( "Can't found that picture.");
      }
      System.out.println( "Please enter the age:");
      
      age = scan.nextInt();
      
      if ( age < 0 ) {
         
         //System.out.println( "Age value cannot be negative!");
         //System.out.println( "Please restart the program..");
         //System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
         //System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + " Age value cannot be negative!" + P10 + P9 + "Salary: " + " $" + netSalaryOne + " (Tax rate is 5%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
         //System.out.println ( P11 + P12 );
      }
      else
         
         System.out.println( "Please enter the salary:");
      
      grossSalary = scan.nextDouble();
      
      if ( grossSalary < 1000 )
      {
         double lowTax = ( grossSalary - 100 ) * (0.05) ;
         
         netSalaryOne = grossSalary - lowTax;
         System.setOut( new PrintStream( "magic.htm" ) );
         if ( age < 0 ) 
         {
            
            System.out.println( "Age value cannot be negative!");
            System.out.println( "Please restart the program..");
            System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
            System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + " Age value cannot be negative!" + P10 + P9 + "Salary: " + " $" + netSalaryOne + " (Tax rate is 5%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
            System.out.println ( P11 + P12 );
         }
         else
            System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
         System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + age + P10 + P9 + "Salary: " + " $" + netSalaryOne + " (Tax rate is 5%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
         System.out.println ( P11 + P12 );
      }
      
      else if ( grossSalary >= 1000 && grossSalary < 5000 )
      {
         
         double mediumTax = (grossSalary - 100) * (0.15) ;
         
         double netSalaryTwo = grossSalary - mediumTax;
         System.setOut( new PrintStream( "magic.htm" ) );
         if ( age < 0 ) 
         {
            
            System.out.println( "Age value cannot be negative!");
            System.out.println( "Please restart the program..");
            System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
            System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + " Age value cannot be negative!" + P10 + P9 + "Salary: " + " $" + netSalaryTwo + " (Tax rate is 5%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
            System.out.println ( P11 + P12 );
         }
         else
         {   
            System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
            System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + age + P10 + P9 + "Salary: " + " $" + netSalaryTwo + " (Tax rate is 15%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
            //System.out.println( P6 + P13 + picture + 
            System.out.println ( P11 + P12 );   
         }
      }
      
      else if ( grossSalary >= 5000 )
      {
         double highTax = ( grossSalary - 100 ) * (0.25);
         
         double netSalaryThree = grossSalary - highTax;
         System.setOut( new PrintStream( "magic.htm" ) );
         if ( age < 0 ) 
         {
            
            System.out.println( "Age value cannot be negative!");
            System.out.println( "Please restart the program..");
            System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
            System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + " Age value cannot be negative!" + P10 + P9 + "Salary: " + " $" + netSalaryThree + " (Tax rate is 5%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
            System.out.println ( P11 + P12 );
         }
         else
         {
            
            System.out.println( P1 + P2 + name + "'s Home Webpage" + P3 + P4 + P5 + P6 + P13 + picture + P14); 
            System.out.println( P15 + "Name: " + name + P8 + P9 + "Age: " + age + P10 + P9 + "Salary: " + " $" + netSalaryThree  + " (Tax rate is 25%)" + P10 + P9 + "Comments: " + comments + P10 + P6 );
            System.out.println ( P11 + P12 );
         }
         
      }
      else if ( grossSalary < 0 )
      {
         System.out.println( "Salary cannot be negative!");
      }   
      System.out.close();
      System.setOut( originalStdOut);
      System.out.println( "Webpage created.");
   }
   
} // end class