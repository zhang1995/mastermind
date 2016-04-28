package mastermind;

import java.util.ArrayList;
import java.util.Random;

public class Codes {

	String[] color = { "Blue", "Green", "Orange", "Purple", "Red", "Yellow" };
	protected ArrayList<String> codes = new ArrayList<String>();;

	public Codes() {
		Random rand = new Random();
		int index = 0;
		int a = 0;
		while (index < 4) {

			a = rand.nextInt(color.length);
			GenerateCodes(a);
			index += 1;
		}
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
