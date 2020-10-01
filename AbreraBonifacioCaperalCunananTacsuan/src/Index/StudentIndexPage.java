package Index;

import java.sql.ResultSet;
import Model.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import java.awt.*;
import java.awt.event.*;
import Module3PDF.OpenModule3Pdf;
import Module4Pdf.OpenModule4Pdf;

public class StudentIndexPage extends JFrame{

	private JFrame frmArtAppreciation;
	private Student session;

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
	public StudentIndexPage(ResultSet rs) throws Exception {
		this.session = new Student(rs.getInt("user_id"), rs.getString("email"), rs.getString("password"), rs.getString("firstname"), rs.getString("lastname"), rs.getLong("c_num"), rs.getLong("s_num"), rs.getString("program"));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Art Appreciation");
		setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 450, 218);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Art Appreciation");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		/**** --- FIRSTNAME LASTNAME FROM DATABASE --- ****/
		JLabel lblNewLabel_1 = new JLabel("<html><body><p style='width: 300px;'>Hello " + session.getFirstName() + " " + session.getLastName() + "! You have two quizzes to take today about Module 3 and Module 4. Click on the button to review your lessons.</p></body></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Module 3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OpenModule3Pdf.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Module 4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OpenModule4Pdf.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_2 = new JButton("View Profile");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentProfile.main(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
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
		getContentPane().setLayout(groupLayout);
	}
}
