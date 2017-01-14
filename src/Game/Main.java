package Game;

import javax.swing.*;

import Game.Connect_Four.Connect_Four;
import Game.TickTackToe.*;

import java.io.IOException;

public class Main {

	public static JFrame frame = new JFrame("Game");
	private static int state = 4;
	private static Connect_Four connectFour;
	private static TicTacToe TicTacToe;
	private static MainMenu menu;
	private static PauseMenu pauseMenu;
	private static int runningGame;


	public static void main(String[] args) throws IOException {

		connectFour = new Connect_Four();
		TicTacToe = new TicTacToe();
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

//		TicTacToe.setSize(1024, 798);
//		TicTacToe.addKeyListener(TicTacToe);
//		TicTacToe.addMouseMotionListener(TicTacToe);
//		TicTacToe.addMouseListener(TicTacToe);

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
					TicTacToe.repaint();
					TicTacToe.run();
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

	public static void startTicTacToe() {
		runningGame = 1;
		TicTacToe.setSize(1024, 798);
		TicTacToe.addKeyListener(TicTacToe);
		TicTacToe.addMouseMotionListener(TicTacToe);
		TicTacToe.addMouseListener(TicTacToe);
		TicTacToe.requestFocus();
		frame.setContentPane(TicTacToe);
		frame.repaint();

		state = 2;
	}

	public static void startConnectFour() {
		runningGame = 2;
		frame.setContentPane(connectFour);
		connectFour.addKeyListener(connectFour);
		connectFour.requestFocus();
		frame.repaint();
		state = 3;
	}
	public static void openPauseMenu() {
		frame.setContentPane(pauseMenu);
		pauseMenu.addKeyListener(pauseMenu);
		pauseMenu.requestFocus();
		frame.repaint();
		state = 4;
	}
	public static void quitGame() {
		if (runningGame == 1) {
			TicTacToe.reset();
		}
		else if (runningGame == 2) {
			connectFour.reset();
		}

		frame.setContentPane(menu);
		menu.addKeyListener(menu);
		menu.requestFocus();
		frame.repaint();
		state = 1;
		runningGame = 0;
	}

	public static void returnToGame() {
		if (runningGame == 1) {
			startTicTacToe();
		}
		else if (runningGame == 2) {
			startConnectFour();
		}
	}

	public static void popup(String s) {
		JOptionPane.showMessageDialog(frame, s);
	}

}
