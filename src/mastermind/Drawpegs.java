package mastermind;

import java.awt.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

public class Drawpegs extends Draw {

	// x, y will be the position of the circle
	int y;

	// this will be the circles
	ArrayList<String> guess;
	ArrayList<Pegs_Result> res_h;

	public Drawpegs(int y, ArrayList<String> guess, ArrayList<Pegs_Result> res_h) {
		this.y = y;
		this.guess = guess;
		this.res_h = res_h;

	}

	public Drawpegs() {
		// TODO Auto-generated constructor stub
	}

	public void drawing() {
		repaint();
	}

	/*
	 * paint circle (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// x_1 is alway 17, x_2 is 265
		int x = 17;
		// convert guess in to string array
		for (String code : guess) {
			x = 17;
			ArrayList<String> g_list = new ArrayList<String>(Arrays.asList(code.split("")));
			for (String c : g_list) {

				switch (c) {
				case "R":
					g.setColor(Color.RED);
					break;

				case "B":
					g.setColor(Color.BLUE);
					break;

				case "Y":
					g.setColor(Color.YELLOW);
					break;

				case "O":
					g.setColor(Color.ORANGE);
					break;

				case "P":
					Color p = new Color(160, 32, 240);
					g.setColor(p);
					break;

				case "G":
					g.setColor(Color.GREEN);
					break;
				}
				g.fillOval(x, y, 30, 30);
				x += 34;
			}
			y -= 33;
		}
		int x_2 = 267;
		int y_2;
		// print all the black pegs
		int count = 1;
		int temp = 400;
		for (Pegs_Result res : res_h) {
			x_2 = 267;
			y_2 = temp;
			g.setColor(Color.BLACK);
			for (int i = 0; i < res.black; i++) {
				g.fillOval(x_2, y_2, 16, 16);

				if (count == 2) {
					y_2 += 18;
					x_2 = 267;
					count = 1;
				} else {
					x_2 += 18;
					count += 1;
				}
			}
			g.setColor(Color.WHITE);
			for (int i = 0; i < res.white; i++) {
				g.fillOval(x_2, y_2, 16, 16);

				if (count == 2) {
					y_2 += 18;
					x_2 = 267;
					count = 1;
				} else {
					x_2 += 18;
					count += 1;
				}
			}
			
			//update the y pos
			temp -= 33;
		}

	}

}
