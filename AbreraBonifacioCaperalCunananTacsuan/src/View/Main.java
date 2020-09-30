package View;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Model.*;
import Controller.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField email_lf;
	private JPasswordField password_lf;
	private static Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					con = new ConnectionController().getConnection();
					Main frame = new Main();
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
	public Main() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setLocationRelativeTo(null);
			}
		});
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 286, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(10, 11, 246, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(30, 51, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		email_lf = new JTextField();
		email_lf.setBounds(113, 48, 115, 20);
		contentPane.add(email_lf);
		email_lf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(30, 76, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		password_lf = new JPasswordField();
		password_lf.setBounds(113, 73, 115, 20);
		contentPane.add(password_lf);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					String email = email_lf.getText();
					String password = password_lf.getText();
					AccountController ac = new AccountController(con);
					ResultSet session = ac.Login(email, password);
					if(session != null) 
					{
						// LOGIN SUCCESS CODE
						/*
						 * How to get the value of logged in account
						 * 
						 * To get a value as string use (session.getString("column_name"))
						 * 
						 */
						JOptionPane.showMessageDialog(null, "Welcome " + session.getString("firstname") + "!");
						JOptionPane.showMessageDialog(null, "The index is not yet available.");
						JOptionPane.showMessageDialog(null, "Program will be terminated");
						System.exit(0);
					}
					else
					{
						// INVALID CREDENTIAL OR SQL ERROR
						JOptionPane.showMessageDialog(null, "Login failed!");
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex + "\nSomething went wrong.");
				}
				
			}
		});
		btnNewButton.setBounds(90, 141, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Doesn't have an account yet?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				AccountType at_form = new AccountType();
				at_form.setVisible(true);
			}
		});
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(52, 116, 167, 14);
		contentPane.add(lblNewLabel_3);
	}
}
