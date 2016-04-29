package mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Codes {

	//String[] color = { "Blue", "Green", "Orange", "Purple", "Red", "Yellow" };
	static List<String> colorList = new ArrayList<>(Arrays.asList("Blue", "Green", "Orange", "Purple", "Red", "Yellow"));
	//protected ArrayList<String> colorlist = new ArrayList<String>();
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

			a = rand.nextInt(colorList.size());
			GenerateCodes(a);
			index += 1;
		}
	}
	
	public String getcolorlist(){
		String str = "";
		for (String s : colorList) {
			str +=  " " + s;
		}
		return str;
	}
	
	public void addcolor(String str){
		String newstr = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		colorList.add(newstr);
	}
	
	public boolean checkFirstLetter(String str){
		for(String s :colorList){
			if (Character.toUpperCase(str.charAt(0)) == Character.toUpperCase(s.charAt(0))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkguessvalid(String guess){
		String str = "";
		for (int i = 0; i < colorList.size(); i++) {
			str += colorList.get(i).charAt(0);
		}
		for (int i = 0; i < guess.length(); i++) {
			if (str.indexOf(guess.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}
	
	public void setpegnum(int newnum){
		this.peg_num = newnum;
	}

	public void GenerateCodes(int a) {
		String str = colorList.get(a);
		codes.add(str.substring(0, 1).toUpperCase());
	}

}
