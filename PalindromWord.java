import java.util.Scanner;

public class PalindromWord {
	 /*
		    Exercise 4 (Strings, Arrays)
		Create a Java program that checks if a given word is a palindrome (case sensitive). 
		Palindrome words are the words that can be read backwards. (example: madam)
	*/
	 
	
	
	//variables
	static Scanner scanner = new Scanner(System.in);
	
	//method for checking palindrome 
	static boolean isPalindrome(String word) {
		int n = word.length();
		for ( int i = 0; i < (n/2); i++ ) {
			if ( word.charAt(i) != word.charAt(n - i - 1) ) {
		    return false;
		    }
		}
		return true;
	}
	
	
	public static void main (String[] args) {
		
		// taking the word for checking
		System.out.print("Enter text you want to check if it is a palindrome:");
		String stringInput = scanner.nextLine();
			
		//calling the method and printing the result
		System.out.print("The text you entered is a palindrome:" + PalindromWord.isPalindrome(stringInput));
	}

}
