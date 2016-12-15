package Game.Othello;

import Game.Grid;

public class Othello_Grid extends Grid{
	
	String playerTurn = "Black";
	//counters for game pieces
	int blackCounter = 2;
	int whiteCounter = 2;

	@Override
	public void addElement(int x, int y, String s) {
		boolean valid = false;
		if(valid){
			super.addElement(x, y, s);
			playerTurn = "White";
		}
	}
}
