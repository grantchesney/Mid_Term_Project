package Game;

import javax.swing.JFrame;

import Game.Connect_Four.Connect_Four;
import Game.Connect_Four.Connect_Four_Grid;
import Game.Othello.Othello;

import java.io.IOException;

public class Main {

	public static JFrame frame = new JFrame("Game");
	private static int state = 4;
	private static Connect_Four connectFour;
	private static Othello othello;
	private static MainMenu menu;
	private static PauseMenu pauseMenu;


	public static void main(String[] args) throws IOException {

		connectFour = new Connect_Four();
		//othello = new Othello();
		menu = new MainMenu();
		pauseMenu = new PauseMenu();

	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 798);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.repaint();

		connectFour.setSize(1024, 798);
		connectFour.addKeyListener(connectFour);
		connectFour.addMouseMotionListener(connectFour);
		connectFour.addMouseListener(connectFour);

		pauseMenu.setSize(1024, 798);
		pauseMenu.addKeyListener(pauseMenu);
		pauseMenu.addMouseMotionListener(pauseMenu);
		pauseMenu.addMouseListener(pauseMenu);

//		othello.setSize(1024, 798);
//		othello.addKeyListener(othello);
//		othello.addMouseMotionListener(othello);
//		othello.addMouseListener(othello);

		menu.setSize(1024, 798);
		menu.addKeyListener(menu);
		menu.addMouseMotionListener(menu);
		menu.addMouseListener(menu);

		menu.setSize(1024, 798);

		frame.setContentPane(menu);
		
		frame.repaint();
		
		while(true) {
			switch(state) {
				case 1:
					frame.repaint();
					menu.repaint();
					break;
				case 2:
					frame.repaint();
					othello.repaint();
					othello.run();
					break;
				case 3:
					frame.repaint();
					connectFour.repaint();
					connectFour.run();
					break;
				case 4:
					frame.repaint();
					pauseMenu.repaint();
			}

		}

	}

	public static void startOthello() {
		othello.setSize(1024, 798);
		othello.addKeyListener(othello);
		othello.addMouseMotionListener(othello);
		othello.addMouseListener(othello);
		othello.requestFocus();
		frame.setContentPane(othello);
		frame.repaint();

		state = 2;
	}

	public static void startConnectFour() {
		frame.setContentPane(connectFour);
		connectFour.setSize(1024, 768);
		connectFour.addKeyListener(connectFour);
		connectFour.requestFocus();
		frame.repaint();
		state = 3;
	}
	public static void openPauseMenu() {
		frame.setContentPane(pauseMenu);
		pauseMenu.setSize(1024, 768);
		pauseMenu.addKeyListener(pauseMenu);
		pauseMenu.requestFocus();
		frame.repaint();
		state = 4;
		System.out.println(state);
	}


}
