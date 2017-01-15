package Game.TickTackToe;

import Game.Game;
import Game.Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class TicTacToe extends Game implements KeyListener, MouseListener, MouseMotionListener {
	URL fileURL; 
	private TicTacToe_Grid grid;
	//buffered images
	BufferedImage oPiece;
	BufferedImage xPiece;
	BufferedImage tictactoeBoard;
	String player = "X";	
	String winner = "";
	
	public TicTacToe() throws IOException  {
		//image files 
		fileURL = getClass().getResource("/img/tictactoe board.png");
		tictactoeBoard = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("/img/o piece.png");
		oPiece = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("/img/x piece.png");
		xPiece = ImageIO.read(fileURL);
		
		grid = new TicTacToe_Grid(3, 3);
	}
	
	public void run() {
	}

	public void paintComponent(Graphics g) {
		//draw game board
		g.drawImage(tictactoeBoard, 0, 0, null);
		if (grid.turn) {
	     	g.drawString("X's turn", 10, 20);
		 } 
		 else {
			 g.drawString("O's turn", 10, 20);
		 }
		 for (int x = 0; x <= 2; x++){
			 for (int y = 0; y <= 2; y++){
				 if (grid.grid[y][x] != null && grid.grid[y][x].equals("X")){
					 g.drawImage(xPiece, x*177 + 257, y*+177 + 118, null);
				 }
				 else if (grid.grid[y][x] != null && grid.grid[y][x].equals("O")){
					 g.drawImage(oPiece, x*177 + 257, y*177 + 118, null);
				 }
			 }
		 }
		
	}



	public void checkWin(){
		//check rows
		for (int i = 0; i < 3; i++){
			if (grid.grid[i][0].equals(grid.grid[i][1]) && grid.grid[i][1].equals(grid.grid[i][2]) ) {
				winner = grid.grid[i][0];
				Main.popup("Player " + winner + " Wins!" );
				 Main.quitGame();
			}
			//check columns 
			else if (grid.grid[0][i].equals(grid.grid[1][i]) && grid.grid[1][i].equals(grid.grid[2][i]) ) {
				winner = grid.grid[0][i];
				Main.popup("Player " + winner + " Wins!" );
				 Main.quitGame();
			}
		}
		//diagonals
		if (grid.grid[0][0].equals(grid.grid[1][1]) && grid.grid[1][1].equals(grid.grid[2][2]) ) {
			winner = grid.grid[0][0];
			Main.popup("Player " + winner + " Wins!" );
			 Main.quitGame();
		}
		else if (grid.grid[0][2].equals(grid.grid[1][1]) && grid.grid[1][1].equals(grid.grid[2][0]) ) {
			winner = grid.grid[0][2];
			Main.popup("Player " + winner + " Wins!" );
			 Main.quitGame();
		}
		
	}
	public void reset() {
		grid.resetDB();
		player = "X";
		grid.turn = true;
	}
	
	//----------Auto Generated--------------

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int clickX = MouseInfo.getPointerInfo().getLocation().x;
		int clickY = MouseInfo.getPointerInfo().getLocation().y;
		int gridX, gridY;
		//find out where they clicked
		//if the click is inside the board
		if (clickX < 752 && clickX > 257 && clickY > 118 && clickY < 614){
			//find out the x coord
			if (clickX < 257 + 166){
				gridX = 1;
			}
			else if (clickX < 257 + 2 * 166){
				gridX = 2;
			}
			else{
				gridX = 3;
			}
			//find y coord
			if (clickY < 118 + 166){
				gridY = 1;
			}
			else if (clickY < 118 + 2 * 166){
				gridY = 2;
			}
			else{
				gridY = 3;
			}
			//who's turn?
			if (grid.turn){
				player = "X";
			}
			else{
				player = "O";
			}
			//add a piece
			grid.addElement(gridX, gridY, player);
			checkWin();
			
		}
		
		
		
		}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		 if (e.getKeyCode() == 27) {
	            Main.openPauseMenu();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
