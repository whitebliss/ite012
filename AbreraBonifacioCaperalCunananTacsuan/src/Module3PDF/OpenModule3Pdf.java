package Module3PDF;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Module3Quiz.Quiz;
import Index.StudentIndexPage;

public class OpenModule3Pdf {

	protected static final String JOptionand = null;
	protected static final OpenModule3Pdf JoptionPane = null;
	private JFrame frmModule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenModule3Pdf window = new OpenModule3Pdf();
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
	public OpenModule3Pdf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModule = new JFrame();
		frmModule.setTitle("Module 3");
		frmModule.getContentPane().setBackground(new Color(255, 192, 203));
		frmModule.setBounds(100, 100, 436, 245);
		frmModule.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//pdf module 4
				JButton btnNewButton = new JButton("ART SUBJECT AND CONTENT");
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setBackground(new Color(255, 245, 238));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
							Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "ArtSubject.pdf");
						}
						catch (Exception e1) { e1.printStackTrace();
							JoptionPane.showMessageDialog(null, "Check your file details");
							
						}
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
				
		
		
				//button for taking the quiz
		JButton btnNewButton_2 = new JButton("Take the quiz!");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(new Color(255, 245, 238));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmModule.dispose();
				Quiz.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmModule.dispose();
				StudentIndexPage.main(null);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 245, 238));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		GroupLayout groupLayout = new GroupLayout(frmModule.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(82)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		frmModule.getContentPane().setLayout(groupLayout);
	}

	protected void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}