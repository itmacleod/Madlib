package madlibGUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Madlib extends JFrame{
	public Madlib() {
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ian MacLeod's GUI Madlibs");
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IAN MACLEOD'S WHACKY MADLIBS APP\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 32, 332, 20);
		getContentPane().add(lblNewLabel);
	}

	public static void main(String[] args) {
		

	}
}
