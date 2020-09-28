package Module3PDF;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Art Subject and Content");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 105, 180));
		btnNewButton.setBackground(new Color(255,245,238));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Austin\\Desktop\\ArtSubject.pdf");
				}
				catch (Exception e1) {
					JoptionPane.showMessageDialog(null, "Check your file details");
					
				}
			}
		});
		btnNewButton.setBounds(41, 35, 356, 187);
		frame.getContentPane().add(btnNewButton);
	}

	protected void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}