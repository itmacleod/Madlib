package madlibGUI;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Madlib extends JFrame{
	private JTextField adjField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	
	public void generate() {
		Random random = new Random();
		
		int randomPick = random.nextInt(3) + 1; //picks a random number between 1 and 3, inclusive
		
		if(randomPick == 1) {
			String sentenceOne = "The took the ball and into the riverbank!";
			String[] arr = sentenceOne.split(" ");
			List<String> sentenceOneAsArr = new ArrayList<>(); //each work in the above sentence will be put into an arraylist. I use an arraylist so I can easily insert the madlib entries into the sentence
			for(int i = 0; i < arr.length; i++) {
				sentenceOneAsArr.add(arr[i]);
			}
		}
		
	}
	
	
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
		
		adjField = new JTextField();
		adjField.setBounds(128, 60, 81, 26);
		getContentPane().add(adjField);
		adjField.setColumns(10);
		
		JLabel colorField = new JLabel("Enter a color:");
		colorField.setBounds(242, 64, 93, 18);
		getContentPane().add(colorField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(332, 60, 81, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel nounField = new JLabel("Enter a noun:");
		nounField.setBounds(6, 114, 112, 20);
		getContentPane().add(nounField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 111, 81, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel verbField = new JLabel("Enter a verb");
		verbField.setBounds(242, 114, 93, 20);
		getContentPane().add(verbField);
		
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
		
		
		Madlib game = new Madlib();
		game.setSize(450,375);
		game.setVisible(true);
		

	}
}
