package Index;

import Model.*;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherIndexPage extends JFrame{

	private JFrame frame;
	private Teacher session;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherIndexPage window = new TeacherIndexPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeacherIndexPage() {
		initialize();
	}
	

	public TeacherIndexPage(ResultSet rs) throws Exception {
		this.session = new Teacher(rs.getInt("user_id"), rs.getString("email"), rs.getString("password"), rs.getString("firstname"), rs.getString("lastname"), rs.getLong("c_num"), rs.getString("subject"), rs.getString("specialization"));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Art Appreciation");
		setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 450, 210);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		JLabel lblNewLabel = new JLabel("Art Appreciation");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		/**** --- FIRSTNAME LASTNAME FROM DATABASE --- ****/
		JLabel lblNewLabel_1 = new JLabel("<html><body><p style='width: 300px;'>Hello " + session.getFirstName() + " " + session.getLastName() + "! Your students are tasked to take two quizzes today. Check their grades by clicking the button below.</p></body></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("View Grades\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewGrades.main(null);
			}
		});
		
		JButton btnNewButton_2 = new JButton("View Profile");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherProfile.main(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(161, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(63)
					.addComponent(btnNewButton_2)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(172, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(161))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_2)
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
