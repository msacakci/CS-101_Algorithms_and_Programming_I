/*
 * Big Numbers
 */
public class BigNum
{
   // properties
   int[] list;  
   String base2;
   final int SIZE = 10;
   final int BASE = 10;
   
   // constructors
   /*
    * Constructor 1: Set big number as 0.
    */
   public BigNum()
   {
      // variables
      int index;
          
      String base2;
      //program code
      // 1. Set all basic propert as zero and empty.      
      base2 = "0";
      // 2. Prepare a empthy list with SIZE value and set all of the memory location as zero.
      list = new int[ ( SIZE ) ];
      for( index = 0; index < list.length; index++ )
      {
         list[index] = 0;
      }
   }
   /*
    * Consturctor 2: Build new big number from new string which represent main number.
    */
   public BigNum( String baseNumber )
   {
      // variables
      String temp;             
      int index,
          antiIndex;
               
      // program code
      // 1. Get big number from converting baseNumber to the integer value.      
      temp = baseNumber;                       
      base2 = temp;      
      
      // 2. Prepare a empthy list with SIZE value and set all of the memory location as zero.
      list = new int[ ( SIZE ) ];      
      antiIndex = 0;
      // 3. Write every character of reversed temp to list.      
      for( index = temp.length() - 1; index >= 0; index--)
      { 
         //System.out.println( "REVERSED Controller" + reversedTemp.charAt( index));
         list[index] = temp.charAt( antiIndex) - 48;
         antiIndex = antiIndex + 1;
      }      
   }
   /*
    * Constructor 3: Copy constructor (Cloner).
    */
   public BigNum( BigNum other)
   {
      // variable
      BigNum newBigNum;                               
      int index,
          antiIndex;
      
      // program code
      // 1. Get every property of the other big number and equal it new big number's properties.           
      base2 = other.base2;     
      list = new int[ ( other.SIZE ) ];
      antiIndex = 0;
      // 2. Create new list from these properties.
      for( index = base2.length() - 1; index >= 0; index--)
      { 
         //System.out.println( "REVERSED Controller" + reversedTemp.charAt( index));
         list[index] = base2.charAt( antiIndex) - 48;
         antiIndex = antiIndex + 1;
      }       
   }   
   
   // methods
   /*
    * Method 1: to string method. Express every variable with String.
    */
   public String toString()
   {
      // variables
      String result;
      int    index;
      
      // program code
      // 1. Simply create a result String that consisted of required properties.
      result = "" + "Big Number is " + base2 + "\n" + base2 + "\n";
      for( index = 0; index < list.length; index++)
      {
         result = result + list[ index ] + ", ";
      }
      return result;
   }
   /*
    * Method 2: Compare big numbers about their equality.
    */
   public boolean equals( BigNum other)
   {             
      // 1. Check are the main properties of big numbers are equal or not.
      if ( base2 == other.base2)
      {
         return true;
      }   
      else
      {
         return false;
      }   
   }
   /*
    * Method 3: Is the big number equals zero or not?
    */
   public boolean isZero()
   {
      // variable
      int index;
      boolean result;
      // 1. Check main property of big numbers is equal zero or not.
      result = true;   
      for ( index = 0; index < list.length; index++)
      {   
         if( list[index] != 0)
         {
            result = false;
         }
      } 
      return result;
   }
   /*
    * Method 4: Shift list to the one right location.
    */ 
   public void shift( boolean left)
   {
      // variables
      String updatedTemp;
      int    index,
             antiIndex;
      // program code
      antiIndex = 0;       
      if ( left )
      {
         //updatedTemp = base2 + 0; 
         base2 = base2 + 0; 
         
         for( index = base2.length() - 1; index >= 0; index--)
         {              
            list[index] = base2.charAt( antiIndex) - 48;  
            antiIndex = antiIndex + 1;
         }        
      }
      else
      {
         base2 = 0 + base2;
         
         for( index = base2.length() - 2; index >= 0; index--)
         {              
            list[index] = base2.charAt( antiIndex) - 48; 
            antiIndex = antiIndex + 1;
         }                 
      }   
   }
   /*
    * Method 5: add method. Current big number is added with another big number.
    */
   public int add( BigNum other)
   {
      // variables
      long decimalNumber; 
      long decimalNumber2;
      long binaryNumber;
      long binaryNumber2;
      long divider;     
      long remainder;
      long totalBase10;
      String resultAsString;
      int result;
      int index;
      int potentialSize;
      
      // program code
      decimalNumber = 0;
      decimalNumber2 = 0;
      divider = 1;
      remainder = 0;     
      binaryNumber = Integer.valueOf( base2 );    
      binaryNumber2 = Integer.valueOf( other.base2 );          
      // First part
      // 1. First convert both big numbers to base 10 format in order to sum them.
      // 1.1. Converting of first main number.
      while ( binaryNumber != 0 ) 
      {
         for( index = 0; index < base2.length(); index++)
         {   
         remainder = binaryNumber % 10;
         //decimalNumber = decimalNumber + (long) Math.pow( BASE, index); 
         decimalNumber = decimalNumber + remainder * divider;
         divider = divider * BASE;
         binaryNumber = binaryNumber / 10;
         }
      }
      divider = 1;
      remainder = 0;
      // 1.2. Converting of second main number.
      while ( binaryNumber2 != 0 ) 
      {
         remainder = binaryNumber2 % 10;
         decimalNumber2 = decimalNumber2 + remainder * divider;
         divider = divider * BASE;
         binaryNumber2 = binaryNumber2 / 10;
      }
      // 2. Take sum of the both big numbers' base 10 version.
      totalBase10 = decimalNumber + decimalNumber2;
      
      //Second part            
      resultAsString = "";
      // 3. Convert the total value to the BASE version.
      while( totalBase10 > 0 )
      {
         resultAsString = totalBase10 % BASE + resultAsString;
         totalBase10 = totalBase10 / BASE;
      }
      //Third part
      // 4. Find the outsider.      
      potentialSize = 1;
      for( index = 0; index < SIZE; index++)
      {   
         potentialSize = potentialSize * 10;
      }     
      result = Integer.valueOf( resultAsString);
      result = result % potentialSize;      
      base2 = String.valueOf( result);
      return result;                                
   }
   /*
    * Method 6: Compare two big number and give true if current one is bigger than the other.
    */
   public boolean isLessThan( BigNum other)
   {
      // variables
      int index;
      double potantial1,
             potantial2;
      boolean result;
               
      // program code
      result = true;
      potantial1 = 0;
      potantial2 = 0;
      
      // 1. Compare the both bignumbers and return the result.
      for( index = 0; index < list.length; index++ )
      { 
         potantial1 = (double) potantial1 + (double) list[ index ] *  Math.pow ( BASE, index );
         potantial2 = (double) potantial2 + (double) other.list[ index ] * Math.pow ( BASE, index );         
      }
      if( potantial1 > potantial2 )
         {   
            result = false;
         }
      else
      {
         result = true;
      }   
      return result;
   }   
}   