package Module3Quiz;

import java.io.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Quiz extends JFrame {

	static int score = 0, attempts = 3;

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		Quiz.score = score;
	}

	public static int getAttempts() {
		return attempts;
	}

	public static void setAttempts(int attempts) {
		Quiz.attempts = attempts;
	}

	public void createNewFile() {
		File scoreHandler = new File("C:\\Users\\User\\Desktop\\scorehandler.txt");
		if (scoreHandler.exists() == false) {
			try {
				scoreHandler.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("resource")
	public void addScore() {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\scorehandler.txt");
			setScore(getScore() + 1);
			fos.write(Integer.toString(getScore()).getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void quizDone() {

		//subtract 1 from attempts
		setAttempts(getAttempts() - 1);

		//show score and query to try again
		if (getAttempts() != 0) {
			int reply = JOptionPane.showConfirmDialog(null, "You got " + getScore() + " out of 10!\n\nYou have " + getAttempts()
							+ " more attempt(s) remaining. Your latest score will be saved. Would you like to try again?",
							"Module 3 Quiz", JOptionPane.YES_NO_OPTION);
			if (reply == 0)
				main(null);
			else
				JOptionPane.showMessageDialog(null, "Ok!");
				System.exit(0); //end program
		}
		else {
			JOptionPane.showMessageDialog(null, "You got " + getScore() + " out of 10!");
		}
	}

	public static void main(String[] args) {

		//message before the quiz starts
		JOptionPane.showMessageDialog(null, "Click on the button to start the quiz.",
				"Module 3 Quiz", JOptionPane.PLAIN_MESSAGE);
		
		//start quiz
		if (getAttempts() != 0) {
			Item1.main(null);
		}
	}

}
