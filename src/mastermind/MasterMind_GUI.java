package mastermind;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MasterMind_GUI extends JFrame implements ActionListener {
	
	// " ",
	private String[] colors = { "Red", "Blue", "Green", "Purple", "Yellow", "Orange" };
	JComboBox<String> code_1, code_2, code_3, code_4;
	JButton check;
	JTextField g_num;
	JLabel g_str;
	Drawpegs circle;

	static int guess_left = 12;
	Codes code;
	int x_c;
	int y_c;
	
	public MasterMind_GUI() {
		super("MasterMind");
		setSize(365, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		code = new Codes();
		// creates 4 combobox contains all six color
		code_1 = new JComboBox(colors);
		code_2 = new JComboBox(colors);
		code_3 = new JComboBox(colors);
		code_4 = new JComboBox(colors);
		code_1.setBounds(3, 441, 65, 26);
		code_2.setBounds(71, 441, 65, 26);
		code_3.setBounds(139, 441, 65, 26);
		code_4.setBounds(207, 441, 65, 26);
		add(code_1);
		add(code_2);
		add(code_3);
		add(code_4);

		// add the guess left label
		g_str = new JLabel("Guess Left: ");
		g_str.setForeground(Color.RED);
		g_str.setFont(new Font("Time Roman", Font.BOLD, 12));
		g_str.setBounds(3, 3, 70, 30);
		add(g_str);

		// add the guess text field
		g_num = new JTextField();
		g_num.setBounds(76, 3, 30, 30);
		g_num.setEnabled(false);
		g_num.setText(Integer.toString(guess_left));
		add(g_num);

		// add a button to submit guesses
		setLayout(new BorderLayout());
		JPanel bt = new JPanel();
		bt.setLayout(new FlowLayout(FlowLayout.RIGHT));
		check = new JButton("Check");
		// b.setSize(d);
		bt.add(check);
		add(bt, BorderLayout.SOUTH);

		// set a listener for ckeck
		
		Draw object = new Draw();
		add(object);
		object.drawing();


		y_c = 400;
		
		check.addActionListener(this);
			

	}

	

	/*
	 * the method will get the guess from the comboboxes
	 * 
	 */
	public String Get_Guess() {

		String guess;
		guess = code_1.getSelectedItem().toString().substring(0, 1);
		guess += code_2.getSelectedItem().toString().substring(0, 1);
		guess += code_3.getSelectedItem().toString().substring(0, 1);
		guess += code_4.getSelectedItem().toString().substring(0, 1);

		return guess;

	}

	/*
	 * determine if the guess is valid
	 * 
	 */
	public static boolean ParseGuess(String guess) {

		if (guess.length() == 4) {
			boolean valid = guess.matches("[RBGPOY]*");
			if (valid) {
				return true;
			}
		}

		return false;

	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		String guess = Get_Guess();
		boolean valid = ParseGuess(guess);
		if (valid) {
			System.out.println(code.codes);
			//reduce the guess number by 1
			guess_left -= 1;
			g_num.setText(Integer.toString(guess_left));
			Pegs_Result res = new Pegs_Result();
			res.Set_Result(code, guess);
			circle = new Drawpegs(y_c, guess, res);
			add(circle);
			circle.drawing();
			setVisible(true);
			y_c -= 33;
			if(res.black == 4) {
				JOptionPane.showMessageDialog(null, "congratulations, you win!!");
				guess_left = -1;
			}
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Guess");
		}

	}
	
}
	


