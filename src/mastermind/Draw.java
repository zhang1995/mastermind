package mastermind;

import java.awt.*;
import javax.swing.*;

public class Draw extends JPanel {

	public void drawing() {
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawRect(5, 36, 250, 396);
		g.drawRect(265, 36, 40, 396);

		// the position of the lines
		int x_1 = 5;
		int y_1 = 69;
		int x_2 = 265;

		// num of guesses
		String num;
		Font numfont = new Font("Time Roman", Font.PLAIN, 25);
		g.setFont(numfont);
		for (int line = 0; line < 12; line += 1) {
			g.drawLine(x_1, y_1, 255, y_1);
			g.drawLine(x_2, y_1, 305, y_1);
			num = Integer.toString(12 - line);
			g.drawString(num, 315, y_1 - 2);
			y_1 += 33;

		}

	}
}
