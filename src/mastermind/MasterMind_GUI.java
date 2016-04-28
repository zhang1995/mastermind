package mastermind;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MasterMind_GUI extends JFrame implements ActionListener{
	
	private String[] colors = {" ","Red", "Blue", "Green", "Purple", "Yellow", "Orange"};
	JComboBox code_1, code_2, code_3, code_4; 
	JButton check;
	public MasterMind_GUI() {
		super("MasterMind");
		setSize(365, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//creates 4 combobox contains all six color
		code_1 = new JComboBox(colors);
		code_2 = new JComboBox(colors);
		code_3 = new JComboBox(colors);
		code_4 = new JComboBox(colors);
		code_1.setBounds(3,441,65,26);
		code_2.setBounds(71,441,65,26);
		code_3.setBounds(139,441,65,26);
		code_4.setBounds(207,441,65,26);
		add(code_1);
		add(code_2);
		add(code_3);
		add(code_4);
		
		//add a button to submit guesses
		setLayout(new BorderLayout());
		JPanel bt = new JPanel();
		bt.setLayout(new FlowLayout(FlowLayout.RIGHT));
		check = new JButton("Check");
		//b.setSize(d);
		bt.add(check);
		add(bt, BorderLayout.SOUTH);
		
		//set a listener for ckeck
		check.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		code_1.getSelectedItem();
	
		
	}
	
	
	
}
