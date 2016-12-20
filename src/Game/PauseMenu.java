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

public class PauseMenu extends JPanel implements KeyListener, MouseListener, MouseMotionListener {

    private BufferedImage imgBackground, imgReturnToGameSelected, imgPauseMenuQuitSelected;
    private int status = 1;

    PauseMenu() throws IOException {
        URL fileURL = getClass().getResource("/img/pause menu no selection.png");
        imgBackground = ImageIO.read(fileURL);
        fileURL = getClass().getResource("/img/pause menu back to game.png");
        imgReturnToGameSelected = ImageIO.read(fileURL);
        fileURL = getClass().getResource("/img/pause menu quit.png");
        imgPauseMenuQuitSelected = ImageIO.read(fileURL);
    }

    public void paintComponent(Graphics g) {
        switch (this.status) {
            case 1:
                g.drawImage(imgBackground, 0, 0, this);
                break;
            case 2:
                g.drawImage(imgReturnToGameSelected, 0, 0, this);
                break;
            case 3:
                g.drawImage(imgPauseMenuQuitSelected, 0, 0, this);
                break;
        }

    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(e.getY() >= 320 && e.getY() <= 408) {
            if(e.getX() >= 345 && e.getX() <= 690) {
                this.status = 2;
            } else  {
                this.status = 1;
            }
        }
        else if(e.getY() >= 460 && e.getY() <= 545) {
             if (e.getX() >= 348 && e.getX() <= 689) {
                 this.status = 3;
             } else {
                 this.status = 1;
             }
        }
        else if(true) {
            this.status = 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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