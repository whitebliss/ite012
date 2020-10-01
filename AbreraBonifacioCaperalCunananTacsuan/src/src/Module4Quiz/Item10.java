package Module4Quiz;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Item10 extends Quiz {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item10 window = new Item10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Item10() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setTitle("Module 3 Quiz");
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 488, 165);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("<html><body><p style='width: 300px;'>The style that is characterized by exaggerated motion and clear detail.</p></body></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton = new JButton("Egyptian Art");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				quizDone();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_1 = new JButton("Roman Art");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				quizDone();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_2 = new JButton("Baroque Art");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addScore();
				frame.dispose();
				quizDone();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_3 = new JButton("Rococo Art");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				quizDone();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1 = new JLabel("QUESTION #10");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
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
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addContainerGap(146, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}