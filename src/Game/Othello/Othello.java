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

public class Othello extends Game implements KeyListener, MouseListener, MouseMotionListener {
	URL fileURL; 
	private Othello_Grid grid;
	//buffered images
	BufferedImage blackPiece;
	BufferedImage whitePiece;
	BufferedImage othelloBoard;
	
	boolean turn = false; 
	//false: black	true: white
	
	public void run() {
		
	}

	public void paintComponent(Graphics g) {
		//draw game board
		g.drawImage(othelloBoard, 0, 0, null);
	}

	public Othello() throws IOException  {
		//image files 
		fileURL = getClass().getResource("Othello board.png");
		othelloBoard = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("whitePiece.png");
		whitePiece = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("blackPiece.png");
		blackPiece = ImageIO.read(fileURL);
		
		grid = new Othello_Grid();
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
