package Module4Quiz;


import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;


	/*
	 * This is the same interface for items 1-10.
	 */
public class Item1 {

	private JFrame frmModuleQuiz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item1 window = new Item1();
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
	public Item1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModuleQuiz = new JFrame();
		frmModuleQuiz.getContentPane().setBackground(new Color(245, 245, 245));
		frmModuleQuiz.setTitle("Module 4 Quiz");
		frmModuleQuiz.setBackground(Color.LIGHT_GRAY);
		frmModuleQuiz.setBounds(100, 100, 520, 167);
		frmModuleQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("<html><body><p style='width: 1000px;'>In what century the Rococo style became prevalent in interior design, painting, etc.?</p></body></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton = new JButton("18th century");
		
		JButton btnNewButton_1 = new JButton("19th century");
		
		JButton btnNewButton_2 = new JButton("20th century");
		
		JButton btnNewButton_3 = new JButton("21th century");
		
		JLabel lblNewLabel_1 = new JLabel("QUESTION #1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frmModuleQuiz.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_3))
								.addComponent(lblNewLabel_1))
							.addContainerGap(96, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		frmModuleQuiz.getContentPane().setLayout(groupLayout);
	}
}
