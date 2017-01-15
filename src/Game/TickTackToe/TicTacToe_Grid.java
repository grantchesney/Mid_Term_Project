package Game.TickTackToe;

import Game.Grid;

public class TicTacToe_Grid extends Grid{
	//true = x false = o
	public boolean turn = true;
	public int movesCounter = 0;
	String[][] grid = new String[3][3];
	public TicTacToe_Grid(int height, int width) {
		super(height, width);
	}
	@Override
	public void addElement(int x, int y, String s) {
		//only add if empty;
		if (grid[y][x] == null){
			grid[y][x] = s;
			movesCounter++;
			turn = !turn;
		}
	}
}
