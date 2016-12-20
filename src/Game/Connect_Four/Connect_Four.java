package Game.Connect_Four;

import Game.*;

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

public class Connect_Four extends Game implements KeyListener, MouseListener, MouseMotionListener {

	private BufferedImage backgroundImage;
	private Connect_Four_Grid grid = new Connect_Four_Grid(6,7);
	private boolean currentPlayer = true;

	public void run() {

	}

	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, this);
	}

	public Connect_Four() throws IOException {
		URL fileURL = getClass().getResource("/img/connect 4 board.png");
		backgroundImage = ImageIO.read(fileURL);
		grid = new Connect_Four_Grid(6, 7);
	}

	public void reset() {

	}

	public void switchPlayer() {

	}

	public void checkWin() {

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
		if(e.getX() >= 190 && e.getX() <= 285){
			if(e.getY() >= 145 && e.getY() <= 625) {
				if(!grid.isColomFull(0)) {
					if(currentPlayer) {
						grid.addToColom(0, "x");
					} else {
						grid.addToColom(0, "y");
					}
					currentPlayer = !currentPlayer;
					checkWin();
				}
			}
		}
		if (e.getY() >= 285 && e.getX() <= 370){
			if(e.getY() >= 145 && e.getY() <= 625) {

			}
		}
		if (e.getY() >= 370 && e.getX() <= 465){
			if(e.getY() >= 145 && e.getY() <= 625) {

			}
		}
		if (e.getY() >= 465 && e.getX() <= 555){
			if(e.getY() >= 145 && e.getY() <= 625) {

			}
		}
		if (e.getY() >= 555 && e.getX() <= 645){
			if(e.getY() >= 145 && e.getY() <= 625) {

			}
		}
		if (e.getY() >= 645 && e.getX() <= 735){
			if(e.getY() >= 145 && e.getY() <= 625) {

			}
		}
		if (e.getY() >= 735 && e.getX() <= 830){
			if(e.getY() >= 145 && e.getY() <= 625) {

			}
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
