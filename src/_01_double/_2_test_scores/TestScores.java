package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String score = JOptionPane.showInputDialog("What was your test score?");
		double scoredbl = Double.parseDouble(score);

		// System.out.println(scoredbl);

		if (scoredbl <= 59.9) {
			JOptionPane.showMessageDialog(null, "Try harder next time!");
		}

		else if (scoredbl <= 69.9) {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		}

		else if (scoredbl <= 79.99) {
			JOptionPane.showMessageDialog(null, "Almost there!");
		}

		else if (scoredbl <= 89.9) {
			JOptionPane.showMessageDialog(null, "Great job!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Perfect!");
		}

	}
}
