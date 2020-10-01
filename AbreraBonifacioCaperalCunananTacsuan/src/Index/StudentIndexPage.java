package Index;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import java.awt.*;
import java.awt.event.*;
import Module3PDF.Open_PDF;
import Module4Pdf.Open_PDF;

public class StudentIndexPage {

	private JFrame frmArtAppreciation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentIndexPage window = new StudentIndexPage();
					window.frmArtAppreciation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentIndexPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArtAppreciation = new JFrame();
		frmArtAppreciation.setTitle("Art Appreciation");
		frmArtAppreciation.setBounds(100, 100, 450, 218);
		frmArtAppreciation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Art Appreciation");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		/**** --- FIRSTNAME LASTNAME FROM DATABASE --- ****/
		JLabel lblNewLabel_1 = new JLabel("<html><body><p style='width: 300px;'>Hello FIRSTNAME LASTNAME! You have two quizzes to take today about Module 3 and Module 4. Click on the button to review your lessons.</p></body></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Module 3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmArtAppreciation.dispose();
				Module3PDF.Open_PDF.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Module 4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmArtAppreciation.dispose();
				Module4Pdf.Open_PDF.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_2 = new JButton("View Profile");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmArtAppreciation.dispose();
				StudentProfile.main(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmArtAppreciation.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(156)
							.addComponent(lblNewLabel))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(337, Short.MAX_VALUE)
							.addComponent(btnNewButton_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(119)
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(btnNewButton_1)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_2)))
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		frmArtAppreciation.getContentPane().setLayout(groupLayout);
	}
}
