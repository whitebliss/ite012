package Module4Pdf;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;


import javax.swing.LayoutStyle.ComponentPlacement;

import Module4Quiz.Quiz;
import Index.StudentIndexPage;

@SuppressWarnings("serial")
public class OpenModule4Pdf extends JFrame {

	protected static final String JOptionand = null;
	protected static final OpenModule4Pdf JoptionPane = null;
	private JFrame frmModule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenModule4Pdf window = new OpenModule4Pdf();
					window.frmModule.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OpenModule4Pdf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModule = new JFrame();
		frmModule.setTitle("Module 4");
		frmModule.getContentPane().setBackground(new Color(255, 192, 203));
		frmModule.setBounds(100, 100, 478, 310);
		frmModule.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//pdf module 4
				JButton btnNewButton = new JButton("EUROPEAN ART HISTORY");
				btnNewButton.setForeground(new Color(0, 0, 0));
				btnNewButton.setBackground(new Color(255, 245, 238));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
							Desktop.getDesktop().open(new java.io.File("PDF/NOTES. EUROPEAN ART HISTORY.pdf"));
						}
						catch (Exception e1) { e1.printStackTrace();
							JoptionPane.showMessageDialog(null, "Check your file details");
							
						}
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
				
				//pdf module 4
				JButton btnNewButton_1 = new JButton("ART HISTORY. EGYPT AND ROME");
				btnNewButton_1.setForeground(new Color(0, 0, 0));
				btnNewButton_1.setBackground(new Color(255, 245, 238));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
							Desktop.getDesktop().open(new java.io.File("PDF/NOTES.ART HISTORY. EGYPT AND ROME.pdf"));
						}
						catch (Exception e1) { e1.printStackTrace();
							JoptionPane.showMessageDialog(null, "Check your file details");
							
						}
					}
				});
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
				//button for taking the quiz
		JButton btnNewButton_2 = new JButton("Take the quiz!");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(255, 245, 238));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmModule.dispose();
				Quiz.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_3 = new JButton("Return");
		btnNewButton_3.setBackground(new Color(255, 245, 238));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmModule.dispose();
				StudentIndexPage.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		GroupLayout groupLayout = new GroupLayout(frmModule.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
							.addGap(106))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2))
								.addComponent(btnNewButton_1))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(19))
		);
		frmModule.getContentPane().setLayout(groupLayout);
	}

	protected void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}
