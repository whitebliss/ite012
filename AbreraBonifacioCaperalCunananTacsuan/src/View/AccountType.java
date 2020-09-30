package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountType extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountType frame = new AccountType();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccountType() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setLocationRelativeTo(null);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton teacher_btn = new JButton("TEACHER");
		teacher_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registration r_form = new Registration(true);
				r_form.setTeacher(true);
				r_form.setVisible(true);
				dispose();
			}
		});
		teacher_btn.setBounds(5, 5, 217, 261);
		contentPane.add(teacher_btn);
		
		JButton student_btn = new JButton("STUDENT");
		student_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registration r_form = new Registration(false);
				r_form.setTeacher(false);
				r_form.setVisible(true);
				dispose();
			}
		});
		student_btn.setBounds(217, 5, 217, 261);
		contentPane.add(student_btn);
	}

}
