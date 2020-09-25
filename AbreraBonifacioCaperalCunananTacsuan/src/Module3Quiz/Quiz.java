package Module3Quiz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
	
	public void initQuiz() {
		InitItem1 q1 = new InitItem1();
		q1.main(null);
	}
	
}
