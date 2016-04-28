package mastermind;

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// begin the game?

		Ready_Play();
		int guess_left = 12;

		// the computer will generate a random codes
		Codes code = new Codes();
		Scanner in = new Scanner(System.in);
		System.out.print("Do you wang to change the rule?(Y/N)");
		String res;
		res = in.nextLine();
		while (!res.equals("Y") && !res.equals("N")) {
			System.out.println("Wrong Input");
		}
		if (res.equals("Y")){
			System.out.print("enter the guess chance:");
			res=in.nextLine();
			while(!res.matches("[0123456789]*")){
				System.out.println("Wrong input, again! Please enter the guess chance:");
				res=in.nextLine();
			}
			guess_left = Integer.parseInt(res);
			System.out.println("12 change to: "+ guess_left);
		}
		
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
	
	public static void Ready_Play(){
		System.out.println("Welcome to Mastermind.  Here are the rules.\n");
		System.out.println("This is a text version of the classic board game Mastermind.\n"
				+ "The computer will think of a secret code. The code consists of 4 colored pegs. The pegs may be\n"
				+ "one of six colors: blue, green, orange, purple, red, or yellow. \n"
				+ "A color may appear more than once in the code. You try to guess what colored pegs are in the code and\n"
				+ "what order they are in.   After you make a valid guess the result (feedback) will be displayed.\n"
				+ "The result consists of a black peg for each peg you have guessed exactly correct (color and position)\n"
				+ "in your guess.  For each peg in the guess that is the correct color, but is out of position, you get a\n"
				+ "white peg. For each peg, which is fully incorrect, you get no feedback.\n\n"
				+ "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.\n"
				+ "When entering guesses you only need to enter the first character of each color as a capital letter.\n");
		Scanner in = new Scanner(System.in);
		String res;
		System.out.print("You have 12 guesses to figure out the secret code or you lose the game.  Are you ready to play? (Y/N):");
		res = in.nextLine();
		while(!res.equals("Y") && !res.equals("N")){
			System.out.println("Wrong input, again!");
			res=in.nextLine();
		}
		if(res.equals("N")){
			System.err.println("what the hack");
			System.exit(0);
		}
		else{
					}
	}
	
	public static boolean YorNcheck(String ans){
		
		return false;
		
	}
	
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
