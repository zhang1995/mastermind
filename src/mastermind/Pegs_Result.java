package mastermind;

import java.util.ArrayList;

public class Pegs_Result {
	
	//black = correct color correct position
	//white = correct color wrong position
	int black;
	int white;
	
	public Pegs_Result() {
		black = 0;
		white = 0;	
	}
	
	public void Set_Result(Codes code, String guess) {
		
		String c;
		ArrayList<String> used = new ArrayList<String>();
		
		for(int i = 0; i < guess.length(); i++) {
			c =  Character.toString(guess.charAt(i));
			String a = code.codes.get(i);
			if(code.codes.get(i).equals(c)) {
				this.black += 1;
			}else if(code.codes.contains(c) && ! used.contains(c)) {
				this.white +=1;
				used.add(c);
				
			}
			
		}
		
		
	}

}
