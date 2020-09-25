package Module4Quiz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Quiz {

	static int score = 0;
	static JFrame frame;
	static JLabel label;
	static JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3;

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		Quiz.score = score;
	}
	
	public static void main(String[] args) {

		//message before the quiz starts
		JOptionPane.showMessageDialog(null, "Click on the button to start the quiz.",
				"Module 3 Quiz", JOptionPane.PLAIN_MESSAGE);
		
		//start quiz
		Item1 q1 = new Item1();
		q1.main(null);
		
	}
	
}
