package View;

import Controller.*;
import Model.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField email_tf;
	private JPasswordField password_tf;
	private JTextField fname_tf;
	private JTextField lname_tf;
	private JTextField cnum_tf;
	private JTextField dynamic1_tf;
	private JTextField dynamic2_tf;
	public boolean r_teacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	
	public void setTeacher(boolean r_teacher) 
	{
		this.r_teacher = r_teacher;
	}
	
	private void InitComponents()
	{

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				setLocationRelativeTo(null);
			}
		});
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 329, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 297, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(10, 67, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(10, 92, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("First name:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setBounds(10, 117, 95, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Last name:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setBounds(10, 142, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contact no.:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setBounds(10, 167, 95, 14);
		contentPane.add(lblNewLabel_5);

		email_tf = new JTextField();
		email_tf.setBounds(113, 64, 172, 20);
		contentPane.add(email_tf);
		email_tf.setColumns(10);
		
		password_tf = new JPasswordField();
		password_tf.setBounds(113, 89, 172, 20);
		contentPane.add(password_tf);
		
		fname_tf = new JTextField();
		fname_tf.setBounds(113, 114, 172, 20);
		contentPane.add(fname_tf);
		fname_tf.setColumns(10);
		
		lname_tf = new JTextField();
		lname_tf.setBounds(113, 139, 172, 20);
		contentPane.add(lname_tf);
		lname_tf.setColumns(10);
		
		cnum_tf = new JTextField();
		cnum_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String value = cnum_tf.getText();
		        int l = value.length();
		        if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || (int)e.getKeyChar() == 8) {
		        	cnum_tf.setEditable(true);
		        } else {
		        	cnum_tf.setEditable(false);
		        }
			}
		});
		cnum_tf.setBounds(113, 164, 172, 20);
		contentPane.add(cnum_tf);
		cnum_tf.setColumns(10);
		
		dynamic1_tf = new JTextField();
		dynamic1_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!r_teacher)
				{
					String value = dynamic1_tf.getText();
			        int l = value.length();
			        if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || (int)e.getKeyChar() == 8) {
			        	dynamic1_tf.setEditable(true);
			        } else {
			        	dynamic1_tf.setEditable(false);
			        }
				}
			}
		});
		dynamic1_tf.setBounds(113, 189, 172, 20);
		contentPane.add(dynamic1_tf);
		dynamic1_tf.setColumns(10);
		
		dynamic2_tf = new JTextField();
		dynamic2_tf.setBounds(113, 214, 172, 20);
		contentPane.add(dynamic2_tf);
		dynamic2_tf.setColumns(10);
		
		JButton register_btn = new JButton("Register");
		register_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConnectionController cc = new ConnectionController();
				AccountController ac = new AccountController(cc.getConnection());
				String email = email_tf.getText();
				String password = password_tf.getText();
				String firstname = fname_tf.getText();
				String lastname = lname_tf.getText();
				String s_c_num = cnum_tf.getText();
				String d1 = dynamic1_tf.getText();
				String d2 = dynamic2_tf.getText();
				
				if(!(email.isEmpty() || password.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || s_c_num.isEmpty() || d1.isEmpty() || d2.isEmpty()))
				{
					long c_num = Long.parseLong(s_c_num);
					if(r_teacher)
					{
						Teacher t = new Teacher(email, password, firstname, lastname, c_num, d1, d2);
						if(ac.Register(t))
						{
							// Registration Failed.
							JOptionPane.showMessageDialog(null, "Registration Failed!\nTry to change your email address.");
						}
						else
						{
							// Registration Success.
							JOptionPane.showMessageDialog(null, "Registration Success!\nProceeding to login.");
							Main m_form = new Main();
							m_form.setVisible(true);
							dispose();
						}
					}
					else
					{
						Student s = new Student(email, password, firstname, lastname, c_num, Long.parseLong(d1), d2);
						if(ac.Register(s))
						{
							// Registration Failed.
							JOptionPane.showMessageDialog(null, "Registration Failed!\nTry to change your email address.");
						}
						else
						{
							// Registration Success.
							JOptionPane.showMessageDialog(null, "Registration Success!\nProceeding to login.");
							Main m_form = new Main();
							m_form.setVisible(true);
							dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "All fields are required.");
				}
			}
		});
		register_btn.setBounds(10, 262, 297, 56);
		contentPane.add(register_btn);
	}
	
	
	public Registration() {
		InitComponents();
	}
	public Registration(boolean r_teacher)
	{
		this.r_teacher = r_teacher;
		InitComponents();
		if(r_teacher)
		{
			JLabel d1_lbl = new JLabel("Subject:");
			d1_lbl.setHorizontalAlignment(SwingConstants.TRAILING);
			d1_lbl.setBounds(10, 192, 95, 14);
			contentPane.add(d1_lbl);
			
			JLabel d2_lbl = new JLabel("Specialization:");
			d2_lbl.setHorizontalAlignment(SwingConstants.TRAILING);
			d2_lbl.setBounds(10, 217, 95, 14);
			contentPane.add(d2_lbl);
		}
		else
		{
			JLabel d1_lbl = new JLabel("Student no.:");
			d1_lbl.setHorizontalAlignment(SwingConstants.TRAILING);
			d1_lbl.setBounds(10, 192, 95, 14);
			contentPane.add(d1_lbl);
			
			JLabel d2_lbl = new JLabel("Program:");
			d2_lbl.setHorizontalAlignment(SwingConstants.TRAILING);
			d2_lbl.setBounds(10, 217, 95, 14);
			contentPane.add(d2_lbl);
		}
	}

}
