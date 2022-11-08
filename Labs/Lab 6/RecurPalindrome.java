
/* Starter code */

import java.util.Scanner;

public class RecurPalindrome {

    public static void main(String[] args) {

	// Welcome message 
	System.out.println("\nWelcome to the Palindrome Test Program!");

	// Takes in one user input
	Scanner userInput = new Scanner(System.in);
	System.out.println("\nType in a word and press enter:");
	String word = userInput.nextLine();
	userInput.close();

	
	// Call the recursive function here!
	// ** Note: true is a space holder.   **
	// ** Remove it and insert your code! **
	
    //boolean isPalindrome = true; 
    boolean ans = rPalindrome(word);
	
	// Printing out the result
	if (ans)
	    System.out.println("Palindrome!");
	else
	    System.out.println("Not a palindrome!");
    }


    
    private static boolean rPalindrome(String str) {
	
        if(str.length() == 0 || str.length()==1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
        {
            return rPalindrome(str.substring(1,str.length()-1));
        }
        return true;
        
    }
    
}
	