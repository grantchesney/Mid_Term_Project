package Game.Othello;

import Game.Game;

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
import javax.swing.JPanel;

public class TicTacToe extends Game implements KeyListener, MouseListener, MouseMotionListener {
	URL fileURL; 
	private TicTacToe_Grid grid;
	//buffered images
	BufferedImage oPiece;
	BufferedImage xPiece;
	BufferedImage tictactoeBoard;
	public boolean gameOn;
	String player = "x";
	public void run() {
		while (gameOn){
			
		}
	}

	public void draw(Graphics g) {
		
		
	}
	public void paintComponent(Graphics g) {
		//draw game board
		g.drawImage(tictactoeBoard, 0, 0, null);
	}

	public void TicTacToe() throws IOException  {
		//image files 
		fileURL = getClass().getResource("tictactoe board.png");
		tictactoeBoard = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("o piece.png");
		oPiece = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("x piece.png");
		xPiece = ImageIO.read(fileURL);
		
		grid = new TicTacToe_Grid(3, 3);
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
		if (clickX < 752 && clickX > 257 && clickY < -118 && clickY > -614){
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
			if (clickY > -118 - 166){
				gridY = 1;
			}
			else if (clickY > -118 - 2 * 166){
				gridY = 2;
			}
			else{
				gridY = 3;
			}
			//who's turn?
			if (grid.turn){
				player = "x";
			}
			else{
				player = "o";
			}
			//add a piece
			grid.addElement(gridX, gridY, player);
			
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
		// TODO Auto-generated method stub
		
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
