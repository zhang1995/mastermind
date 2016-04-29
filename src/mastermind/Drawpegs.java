package mastermind;

import java.awt.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

public class Drawpegs extends Draw {
	
	//x, y will be the position of the circle
	int y;
	
	//this will be the circles
	String guess;
	Pegs_Result res;
	public Drawpegs(int y, String guess, Pegs_Result res) {
		this.y = y;
		this.guess = guess;
		this.res = res;
		
	}
	
	public Drawpegs() {
		// TODO Auto-generated constructor stub
	}

	public void drawing() {
		repaint();
	}
	
	/*
	 * paint circle
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//x_1 is alway 17, x_2 is 265
		int x = 17;
		//convert guess in to string array
		ArrayList<String> g_list = new ArrayList<String>(Arrays.asList(guess.split("")));
		for(String c : g_list) {
			
			switch(c) {
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
		
	}
	
	
	

}
