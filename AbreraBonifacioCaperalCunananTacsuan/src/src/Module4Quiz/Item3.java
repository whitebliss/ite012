package Module4Quiz;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Item3 extends Quiz {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item3 window = new Item3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Item3() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setTitle("Module 4 Quiz");
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 416, 187);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("<html><body><p style='width: 300px;'>What are the dominant styles during the 18th century?</p></body></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton = new JButton("Baroque and Romanticism");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Item4.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_1 = new JButton("Neoclassicism and Realism");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Item4.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_2 = new JButton("Baroque and Rococo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addScore();
				frame.dispose();
				Item4.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_3 = new JButton("Romanticism and Neoclassicism");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Item4.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1 = new JLabel("QUESTION #3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1))
						.addComponent(lblNewLabel_1)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_3)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}