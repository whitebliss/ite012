package Module4Quiz;

import java.io.*;
import javax.swing.*;

public class Quiz {

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
		File scoreHandler = new File("C:\\Users\\Reign\\Desktop\\scorehandler.txt");
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
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Reign\\Desktop\\scorehandler.txt");
			setScore(getScore() + 1);
			fos.write(Integer.toString(getScore()).getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void quizDone() {

		setAttempts(getAttempts() - 1);

		if (getAttempts() != 0) {
			int reply = JOptionPane.showConfirmDialog(null, "You got " + getScore() + " out of 10!\n\nYou have " + getAttempts()
							+ " more attempt(s) remaining. Your latest score will be saved. Would you like to try again?",
							"Module 4 Quiz", JOptionPane.YES_NO_OPTION);
			if (reply == 0)
				main(null);
			else
				JOptionPane.showMessageDialog(null, "Ok!");
				System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "You got " + getScore() + " out of 10!");
		}
	}

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Click on the button to start the quiz.",
				"Module 3 Quiz", JOptionPane.PLAIN_MESSAGE);
		
		if (getAttempts() != 0) {
			Item1.main(null);
		}
	}

}