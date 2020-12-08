package madlibGUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Madlib extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public Madlib() {
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ian MacLeod's GUI Madlibs");
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IAN MACLEOD'S WHACKY MADLIBS APP\n");
		lblNewLabel.setFont(new Font("Yuanti TC", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 16, 332, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an adjective: ");
		lblNewLabel_1.setBounds(6, 63, 126, 20);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(128, 60, 81, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter a color:");
		lblNewLabel_2.setBounds(242, 64, 93, 18);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(332, 60, 81, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter a noun:");
		lblNewLabel_3.setBounds(6, 114, 112, 20);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 111, 81, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter a verb");
		lblNewLabel_4.setBounds(242, 114, 93, 20);
		getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(332, 111, 81, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton generateButton = new JButton("Click to genrate madlib!");
		generateButton.setBounds(128, 159, 195, 29);
		getContentPane().add(generateButton);
		
		textField_4 = new JTextField();
		textField_4.setBounds(43, 200, 355, 72);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}

	public static void main(String[] args) {
		
		/**
		Madlib game = new Madlib();
		game.setSize(400,350);
		game.setVisible(true);
		*/

	}
}
