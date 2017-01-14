 package Game;

import java.awt.Graphics;
import java.awt.MouseInfo;
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

public class MainMenu extends JPanel implements KeyListener, MouseListener, MouseMotionListener {

	private BufferedImage imgBackground, imgHighlightOrthello, imgHighlightConnect_Four, imgHighlightExit;
	private int mouseX, mouseY;
	private int state = 1;

	MainMenu() throws IOException {
		URL fileURL = getClass().getResource("/img/menu no selection.png");
		imgBackground = ImageIO.read(fileURL);
		fileURL = getClass().getResource("/img/menu connect 4.png");
		imgHighlightConnect_Four = ImageIO.read(fileURL);
		fileURL = getClass().getResource("/img/menu tictactoe.png");
		imgHighlightOrthello = ImageIO.read(fileURL);
		fileURL = getClass().getResource("/img/menu exit.png");
		imgHighlightExit = ImageIO.read(fileURL);
	}
	
	public void paintComponent(Graphics g) {
		switch (state) {
			case 1: //Nothing Highlighted
				g.drawImage(imgBackground, 0, 0, this);
				break;
			case 2: //Orthello Highlighted
				g.drawImage(imgHighlightOrthello, 0, 0, this);
				break;
			case 3: //Connect Four Highhlighted
				g.drawImage(imgHighlightConnect_Four, 0, 0, this);
				break;
			case 4:
				g.drawImage(imgHighlightExit, 0, 0, this);
				break;
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.mouseX = e.getX();
		this.mouseY = e.getY();

		if (this.mouseX >= 37 && this.mouseX <= 468) {
			if(this.mouseY >= 240 && this.mouseY <= 653) {
				this.state = 2;
			} else  {
				this.state = 1;
			}

		}
		else if (this.mouseX >= 553 && this.mouseX <= 981) {
			if(this.mouseY >= 240 && this.mouseY <= 653) {
				this.state = 3;
			} else  {
				this.state = 1;
			}

		}
		else if (this.mouseX >= 405 && this.mouseX <= 622) {
			if(this.mouseY >= 678 && this.mouseY <= 768) {
				this.state = 4;
			} else  {
				this.state = 1;
			}
		}
		else if(true) {
            this.state = 1;
        }

	}

	@Override
	public void mouseClicked(MouseEvent e) {
        if (this.mouseX >= 37 && this.mouseX <= 468) {
            if(this.mouseY >= 240 && this.mouseY <= 653) {
                Main.startTicTacToe();
            }

        }
        else if (this.mouseX >= 553 && this.mouseX <= 981) {
            if(this.mouseY >= 240 && this.mouseY <= 653) {
                Main.startConnectFour();
            }

        }
        else if (this.mouseX >= 405 && this.mouseX <= 622) {
            if(this.mouseY >= 678 && this.mouseY <= 768) {
                System.exit(0);
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
