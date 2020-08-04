package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String ni = JOptionPane.showInputDialog("How many nickels do you have?");
		
		// Convert their answer to an int. Hint: Integer.parseInt()
		int niint = Integer.parseInt(ni);
		
		// Ask the user how many dimes they have, and convert their answer
		String di = JOptionPane.showInputDialog("How many dimes do you have?");
		
		// Ask the user how many quarters they have, and convert their answer
		int diint = Integer.parseInt(di);
		
		// Calculate how much money the user has. Hint: Use a double variable
		double niva = niint * 0.05;
		double diva = diint * 0.1;
		double mon = niva + diva;
		
		// Tell the user how much money they have in dollars and cents format (e.g.
		// $6.75)
		JOptionPane.showMessageDialog(null, "You have $" + mon);
		
	}
}
