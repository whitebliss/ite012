package Module3Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*
 * This is the same interface for Items
 */

public class InitItem1 extends Quiz {

	static int values[] = {0,1,0,0};
	private JFrame frmModuleQuiz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitItem1 window = new InitItem1();
					window.frmModuleQuiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InitItem1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModuleQuiz = new JFrame();
		frmModuleQuiz.setTitle("Module 3 Quiz");
		frmModuleQuiz.getContentPane().setBackground(Color.WHITE);
		frmModuleQuiz.setBackground(Color.WHITE);
		frmModuleQuiz.setBounds(100, 100, 450, 140);
		frmModuleQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmModuleQuiz.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_1 = new JLabel("QUESTION #1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmModuleQuiz.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("<html><body><p style='width: 400px;'>Strictly speaking, no work of art is realistic. Since no work of art is an accurate copy of what exists in the natural world.</p></body></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmModuleQuiz.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Distortion");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmModuleQuiz.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Realism");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmModuleQuiz.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Abstraction");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmModuleQuiz.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Surrealism");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmModuleQuiz.getContentPane().add(btnNewButton_3);
	}
}
