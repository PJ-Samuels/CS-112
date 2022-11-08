
/* 
 * Problem Set 2
 *
 * File: StringTest.java
 *
 * Author: Christine Papadakis-Kanaris
 * Coutse: CS112, Boston University
 *
 *
 * Purpose: This is a sample program performing basic input and
 * output in Java 
 */

import java.util.*;

public class PalindromeTest {

  public static void main(String[] args) {

    inputString();
    int[] arr = inputStringPalindrome();
    boolean ans = isPalindrome("tacocat");
    System.out.println(ans);
    System.out.println(Arrays.toString(arr));
  } 

  public static boolean isPalindrome( String str ) {
    boolean isPal = false;    
    String str2 = "";

    String str1 = "";
    str = str.toLowerCase();
    for(int i = 0; i < str.length();i++)
    {
        if(Character.isLetter(str.charAt(i))|| Character.isDigit(str.charAt(i)))
            str1 += str.charAt(i);
        else if( str.charAt(i)== ('\n'))
            str1 += " ";
        else
            str1 += "";
    }
    
    
    for( int i = str1.length()-1; i >= 0; i--)
        str2 += str1.charAt(i);

    if(str2.equals(str1))
        isPal = true;
 
    return( isPal );
 }
 public static int[] inputStringPalindrome(){

    Scanner scan = new Scanner(System.in);   
    //String input;
    int count = 0;
    int count2 = 0;
    String con = "yes";
    boolean ans;
    
    while(true){
        System.out.print("Enter a palindrome:");
        String input = scan.nextLine();
        ans = isPalindrome(input);
        count +=1;
        if(ans)
            count2+=1;   
        System.out.print("Continue, enter yes or no:");
        con = scan.nextLine();

        if(con.equals("no"))
            break;
        
        //scan.close();
    }

     int[] r = {count,count2};
     scan.close();
     return r;
 }
  public static void inputString() {

    // Print out welcome message

    System.out.println("\nWelcome to the String Test Program!");
    System.out.println("This demonstrates how to input strings from the console.");

    // Declare a scanner object for user input

    Scanner userInput = new Scanner(System.in);

    System.out.println("\nType in a line of text (a String) or \"quit\" to end:");

    // Continue to receive user input until some
    // sentinal (i.e. final) value is entered.
    // In this case, the user must enter the
    // word "quit".
    while (userInput.hasNextLine()) {
      String line = userInput.nextLine();
      if (line.equals("quit"))
	// User has specified input it over,
	// break out of the loop.
        break;
      else
        System.out.println("You input: " + line);
    } // while

    System.out.println("bye!");
    userInput.close();
  } // inputString()

} // class