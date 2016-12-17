package Game.Othello;

import Game.Grid;

public class Othello_Grid extends Grid{
	//initial player turns
	String playerTurn = "Black";
	String otherPlayerTurn = "White";
	//counters for game pieces
	int blackCount = 2;
	int whiteCount = 2;
	@Override
	public void addElement(int x, int y, String s) {
		boolean valid = false;
		boolean up = false;
		boolean down = false;
		boolean left = false;
		boolean right = false;
		int counterX = x;
		int counterY = y;

		if (x + 1 < 8){
			right = true;
			//to the right
			//keeps going until if finds a tile that is not black
			for (; counterX + 1 < 8 && super.getElement(counterX + 1, y).equals(otherPlayerTurn); counterX++);
			counterX++;
			//if you are still in bounds and the move can turn pieces
			if (super.getElement(counterX, y).equals(playerTurn)){
				//flip the tiles
				for(int i = x; i < counterX; i++){
					super.addElement(i, y, playerTurn);
				}
				//this move is valid
				valid = true;
			}
			
		}
		//resetX counter
		counterX = x;
		//now for going down
		if (y - 1 > -8){
			down = true;
			//keeps going until if finds a tile that is not opposite colour
			//going down
			for (; counterY - 1 > -8 && super.getElement(x, counterY - 1).equals(otherPlayerTurn); counterY--);
			counterY--;
			//if you are still in bounds and the move can turn pieces
			if (super.getElement(x, counterY).equals(playerTurn)){
				//flip the tiles
				for(int i = y; i > counterY; i--){
					super.addElement(x, i, playerTurn);
				}
				//this move is valid
				valid = true;
			}
			counterY = y;
			counterX = x;
			//going down-right only if there is space on the right
			if (right = true){
				for (; counterY - 1 > -8 && counterX + 1 < 8 
						&& super.getElement(counterX + 1, counterY - 1).equals(otherPlayerTurn);counterX++, counterY--);
				counterX++;
				counterY++;
				//if you are still in bounds and the move can turn pieces
				if (super.getElement(counterX, counterY).equals(playerTurn)){
					//flip the tiles
					for(int i = y, z = x; i > counterY && z < counterX;z++, i--){
						super.addElement(z, i, playerTurn);
					}
					//this move is valid
					valid = true;
				}
				counterX = x;
				counterY = y;
			}
			
			
		}
		
		if(valid){
			super.addElement(x, y, s);
			//reverse turns
			String turnHolder;
			turnHolder = otherPlayerTurn;
			otherPlayerTurn = playerTurn;
			playerTurn = turnHolder;
		}
	}
//	private void countPieces(){
//		
//		
//	}
}
