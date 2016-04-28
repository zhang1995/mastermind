package mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Codes {

	String[] color = { "Blue", "Green", "Orange", "Purple", "Red", "Yellow" };
	protected ArrayList<String> codes = new ArrayList<String>();
	int peg_num;
	
	public Codes() {
		peg_num = 4;
	}

	public void newCodes() {
		Random rand = new Random();
		int index = 0;
		int a = 0;
		while (index < peg_num) {

			a = rand.nextInt(color.length);
			GenerateCodes(a);
			index += 1;
		}
	}
	
	public String getcolorlist(){
		String str = "";
		for (int i = 0; i < color.length; i++) {
			str +=  " " + color[i];
		}
		return str;
	}
	
	
	public void setpegnum(int newnum){
		this.peg_num = newnum;
	}

	public void GenerateCodes(int a) {

		switch (color[a]) {

		case "Blue":
			codes.add("B");
			break;

		case "Green":
			codes.add("G");
			break;

		case "Orange":
			codes.add("O");
			break;

		case "Purple":
			codes.add("P");
			break;

		case "Red":
			codes.add("R");
			break;

		case "Yellow":
			codes.add("Y");
			break;

		}

	}

}
