package day5;

import java.util.Scanner;

public class Palindromecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input the string to check
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert the string to lower case and remove any spaces
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Palindrome check using loop and condition
        boolean isPalindrome = true;  // Assume it is a palindrome initially

        // Loop through the string to compare characters
        for (int i = 0; i < cleanedInput.length() / 2; i++) {
            // Conditional check
            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - i - 1)) {
                isPalindrome = false; // If characters don't match, set flag to false
                break; // Exit loop if mismatch is found
            }
        }

        // Output result using conditional statement
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

	}

}
