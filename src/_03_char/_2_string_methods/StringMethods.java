package _03_char._2_string_methods;

import java.util.Random;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to contain a minimum of 3
		// characters
		String var = "set";
		// 2. Print the 3rd char of your String to the console.
		// HINT: .charAt
		JOptionPane.showMessageDialog(null, var.charAt(1));

		// 3. Print the length of your String to the console.
		// HINT: .length()
		JOptionPane.showMessageDialog(null, var.length());

		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int i = 0; i < var.length(); i++) {
			JOptionPane.showMessageDialog(null, var.charAt(i));
		}

		// 5. Pick a char inside your String, and use a loop to determine			
		Random rand = new Random();
		int rand0 = rand.nextInt(4 - 1)+1;		
		
		JOptionPane.showMessageDialog(null, var.charAt(rand0));
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"

	}
}
