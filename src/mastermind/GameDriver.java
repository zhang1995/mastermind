package mastermind;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class GameDriver implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// begin the game?

		int start = Ready_Play();

		// the computer will generate a random codes
		//Codes code;
		while (start == JOptionPane.YES_OPTION) {
			// creates a GUI for the game using swing? or applet?
			new MasterMind_GUI().setVisible(true);;
			// get the secert code
			//code = new Codes();

			// draw the unknow pegs as ? in the gui

			// ask the user to input guesses
			int guess_left = 12;
			while (MasterMind_GUI.guess_left > 0) {
				

			}
			start = JOptionPane.showConfirmDialog(null, "Would you like to play again?", null,
					JOptionPane.YES_NO_OPTION);
		}
	}

	/*
	 * asked if the user is ready
	 * 
	 */
	public static int Ready_Play() {

		return JOptionPane
				.showConfirmDialog(null,
						"You have 12 guesses to figure out the secret"
								+ " code or you lose the game. Are you ready to play? (Y/N):",
						null, JOptionPane.YES_NO_OPTION);

	}
	
	


}
