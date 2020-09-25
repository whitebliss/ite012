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
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Open_PDF {

	protected static final String JOptionand = null;
	protected static final Open_PDF JoptionPane = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Open_PDF window = new Open_PDF();
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
	public Open_PDF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 478, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//pdf module 4
				JButton btnNewButton = new JButton("EUROPEAN ART HISTORY");
				btnNewButton.setForeground(new Color(255, 105, 180));
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
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
				
				//pdf module 4
				JButton btnNewButton_1 = new JButton("ART HISTORY. EGYPT AND ROME");
				btnNewButton_1.setForeground(new Color(255, 105, 180));
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
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(245, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(221, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	protected void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}