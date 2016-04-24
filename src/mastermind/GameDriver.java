package mastermind;

import java.util.Scanner;

public class GameDriver {
	String[] hello = { "Hello", "world" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//begin the game?
		Ready_Play();
		
		// the computer will generate a random codes
		Codes code = new Codes();

		// ask the user to input guesses

	}

	public static void Ready_Play() {
		Scanner in = new Scanner(System.in);
		String res;
		System.out.println("You have 12 guesses to figure out the secret"
				+ " code or you lose the game. Are you ready to play? (Y/N):");
		
		res = in.nextLine();
		
		if(res != "Y") {
			
		}
		
		

	}

}
