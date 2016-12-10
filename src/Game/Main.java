package Game;

import javax.swing.JFrame;

import Game.Connect_Four.Connect_Four;
import Game.Connect_Four.Connect_Four_Grid;

public class Main {

	public static JFrame frame = new JFrame("Game");
	
	public static void main(String[] args) {
		
		Connect_Four x = new Connect_Four();
		MainMenu menu = new MainMenu();
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.repaint();
		
		menu.setSize(1024, 768);
		menu.addKeyListener(menu);
		menu.addMouseMotionListener(menu);
		menu.addMouseListener(menu);
		
		frame.setContentPane(menu);
		
		frame.repaint();
		
		while(true) {
			frame.repaint();
			menu.repaint();
		}
	}

}
