package mastermind;

import java.util.Scanner;

import javax.management.relation.RoleUnresolved;
import javax.swing.*;

public class GameDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// begin the game?

		Ready_Play();

		// the computer will generate a random codes
		Codes code = new Codes();
		Scanner in = new Scanner(System.in);
		System.out.print("Do you wang to change the rule?(Y/N)");
		String res;
		res = in.nextLine();
		while (!res.equals("Y") && !res.equals("N")) {
			System.out.println("Wrong Input");
			int guess_left = 12;
			String guess_code;
			while (guess_left > 0) {
				guess_code = Input_Guess(guess_left);

				if (ParseGuess(guess_code)) {
					Pegs_Result peg = new Pegs_Result();
					peg.Set_Result(code, guess_code);
					System.out.printf("White peg: %d\nBlack peg: %d\n", peg.white, peg.black);
					guess_left -= 1;
				} else {
					System.out.println("INVALID GUESS");
				}

			}
		}
	}
	
	public static void Ready_Play(){
		Scanner in = new Scanner(System.in);
		String res;
		System.out.println("You have 12 guesses to figure out the secret code or you lose the game.  Are you ready to play? (Y/N):");
		res = in.nextLine();
		while(!res.equals("Y") && !res.equals("N")){
			System.out.println("Wrong input, again!");
			res=in.nextLine();
		}
		if(res.equals("N")){
			System.err.println("what the hack");
			System.exit(0);
		}
	}

	/*
	 * promt the user to enter a guess
	 * 
	 */
	public static String Input_Guess(int guess_left) {
		Scanner in = new Scanner(System.in);
		System.out.printf("You have %d guesses left.\n" + "What is your next guess?\n"
				+ "Type in the characters for your guess and press enter. \n" + "Enter guess: ", guess_left);

		return in.nextLine();

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

}
