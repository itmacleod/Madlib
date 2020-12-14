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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Madlib extends JFrame{
	private JTextField adjField;
	private JTextField color;
	private JTextField noun;
	private JTextField verb;
	private JTextField output;
	
	
	public void generate() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		//int randomPick = random.nextInt(3) + 1; //picks a random number between 1 and 3, inclusive
		
		int randomPick = random.nextInt(3) + 1;
		
		//if the first of three sentences is randomly selected
		if(randomPick == 1) {
			String sentenceOne = "The took the ball and it into the riverbank!";
			int[] spaces = {1,2,3,8};
			String[] arr = sentenceOne.split(" ");
			List<String> sentenceOneAsArr = new ArrayList<>(); //each work in the above sentence will be put into an arraylist. I use an arraylist so I can easily insert the madlib entries into the sentence
			for(int i = 0; i < arr.length; i++) {
				sentenceOneAsArr.add(arr[i]);
			}
			
			//get user inputted words
			String adj = adjField.getText();
			String colr = color.getText();
			String n = noun.getText();
			String ver = verb.getText();
			
			//adding input into sentence
			sentenceOneAsArr.add(1, adj);
			sentenceOneAsArr.add(2, colr);
			sentenceOneAsArr.add(3, n);
			sentenceOneAsArr.add(8, ver);
			
			for(int i = 0; i < sentenceOneAsArr.size(); i++) {
				sb.append(sentenceOneAsArr.get(i) + " ");
			}
			
			output.setText(sb.toString());
			
			
		}else if(randomPick == 2) {
			String sentenceTwo = "On Friday I the on the road and ate it.";
			int[] spaces = {3,5,6,7};
			String[] arr = sentenceTwo.split(" ");
			List<String> sentenceTwoAsArr = new ArrayList<>();
			for(int i = 0; i < arr.length; i++) {
				sentenceTwoAsArr.add(arr[i]);
			}
			
			String adj = adjField.getText();
			String colr = color.getText();
			String n = noun.getText();
			String ver = verb.getText();
			
			//adding input into sentence
			sentenceTwoAsArr.add(3, ver);
			sentenceTwoAsArr.add(5, adj);
			sentenceTwoAsArr.add(6, colr);
			sentenceTwoAsArr.add(7, n); 
			
			for(int i = 0; i < sentenceTwoAsArr.size(); i++) {
				sb.append(sentenceTwoAsArr.get(i) + " ");
			}
			
			output.setText(sb.toString());
			
			
		}else {
			String sentenceThree = "The until the old man called the police.";
			int[] spaces = {1,2,3,6};
			String[] arr = sentenceThree.split(" ");
			List<String> sentenceThreeAsArr = new ArrayList<>();
			for(int i = 0; i < arr.length; i++) {
				sentenceThreeAsArr.add(arr[i]);
			}
			
			String adj = adjField.getText();
			String colr = color.getText();
			String n = noun.getText();
			String ver = verb.getText();
			
			//adding input into sentence
			sentenceThreeAsArr.add(1, colr);
			sentenceThreeAsArr.add(2, n);
			sentenceThreeAsArr.add(3, ver);
			sentenceThreeAsArr.add(6, adj);
			
			for(int i = 0; i < sentenceThreeAsArr.size(); i++) {
				sb.append(sentenceThreeAsArr.get(i) + " ");
			}
			
			output.setText(sb.toString()); 
		}
		 
	}
	
	
	public Madlib() {
		getContentPane().setBackground(Color.PINK);
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ian MacLeod's GUI Madlibs");
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		this.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("IAN MACLEOD'S WHACKY MADLIBS APP\n");
		lblNewLabel.setFont(new Font("Yuanti TC", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 16, 332, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an adjective: ");
		lblNewLabel_1.setBounds(6, 63, 126, 20);
		getContentPane().add(lblNewLabel_1);
		
		adjField = new JTextField();
		adjField.setBounds(128, 60, 81, 26);
		getContentPane().add(adjField);
		adjField.setColumns(10);
		
		JLabel colorField = new JLabel("Enter a color:");
		colorField.setBounds(221, 64, 93, 18);
		getContentPane().add(colorField);
		
		color = new JTextField();
		color.setBounds(363, 60, 81, 26);
		getContentPane().add(color);
		color.setColumns(10);
		
		JLabel nounField = new JLabel("Enter a noun:");
		nounField.setBounds(6, 114, 112, 20);
		getContentPane().add(nounField);
		
		noun = new JTextField();
		noun.setBounds(128, 111, 81, 26);
		getContentPane().add(noun);
		noun.setColumns(10);
		
		JLabel verbField = new JLabel("Enter a verb (past-tense)");
		verbField.setBounds(221, 114, 169, 20);
		getContentPane().add(verbField);
		
		verb = new JTextField();
		verb.setBounds(383, 111, 61, 26);
		getContentPane().add(verb);
		verb.setColumns(10);
		
		JButton generateButton = new JButton("Click to genrate madlib!");
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate();
			}
		});
		generateButton.setBounds(151, 159, 195, 29);
		getContentPane().add(generateButton);
		
		output = new JTextField();
		output.setBounds(0, 200, 516, 72);
		getContentPane().add(output);
		output.setColumns(10);
	}

	public static void main(String[] args) {
		
		
		Madlib game = new Madlib();
		game.setSize(500,295);
		game.setVisible(true);
		

	}
}
