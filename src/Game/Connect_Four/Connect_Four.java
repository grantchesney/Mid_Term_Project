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
import javax.swing.*;

public class Connect_Four extends Game implements KeyListener, MouseListener, MouseMotionListener {

    private BufferedImage backgroundImage;
    private Connect_Four_Grid grid = new Connect_Four_Grid(6, 7);
    private boolean currentPlayer = true;

    public Connect_Four() throws IOException {
        URL fileURL = getClass().getResource("/img/connect 4 board.png");
        backgroundImage = ImageIO.read(fileURL);
        grid = new Connect_Four_Grid(6, 7);
    }

    public void run() {

    }

    public void paintComponent(Graphics g) {
        if (currentPlayer) {
            g.drawString("Player 1", 10, 20);
        } else {
            g.drawString("Player 2", 10, 20);
        }

        for (int i = 0; i < grid.getHeight(); i++) {
            for (int a = 0; a < grid.getWidth(); a++) {
                if (grid.getElement(i, a) != null) {
                    if (grid.getElement(i, a).equals("x")) {
                        g.setColor(Color.BLACK);
                        g.fillRect(192 + (91 * a), 144 + (80 * i), 91, 80);
                    } else {
                        g.setColor(Color.RED);
                        g.fillRect(192 + (91 * a), 144 + (80 * i), 91, 80);
                    }
                }
            }
        }

        g.drawImage(backgroundImage, 0, 0, this);
    }

    public void reset() {
        grid.resetDB();
        currentPlayer = true;
    }

    public void checkWin() {

        for (int w = 0; w < grid.getWidth(); w++) {
            int count = 0;
            String player = "";
            for (int h = grid.getHeight() - 1; h >= 0; h--) {
                if (h != 0) {
                    if (h == grid.getHeight() - 1 && grid.getElement(h, w) != null) {
                        count = 1;
                        player = grid.getElement(h, w);
                    }

                    if (grid.getElement(h - 1, w) != null) {
                        if (player.equals(grid.getElement(h - 1, w))) { // prob
                            count++;
                        } else {
                            player = grid.getElement(h - 1, w);
                            count = 1;
                        }
                    } else {
                        player = "";
                        count = 1;
                    }
                    if (count == 4) { // on win
                        //System.out.println("Win");
                        if(player.equals("x")) {
                            Main.popup("Game Over, player 1 wins!");
                        } else {
                            Main.popup("Game Over, player 2 wins!");
                        }
                        Main.quitGame();
                    }
                }
            }
        }

       for (int h = 0; h < grid.getHeight(); h++) {
        int count = 0;
        String player = "";
        for(int w = 0; w < grid.getWidth(); w++) {
            if (w != grid.getWidth() - 1) {
                if (w == 0 && grid.getElement(h, w) != null) {
                    count = 1;
                    player = grid.getElement(h, w);
                }
                if (grid.getElement(h , w + 1) != null) {
                    if (player.equals(grid.getElement(h , w + 1))) {
                        count++;
                    } else {
                        player = grid.getElement(h , w + 1);
                        count = 1;
                    }
                } else {
                    player = "";
                    count = 1;
                }
                if (count == 4) { // on win
                    //System.out.println("Win");
                    if(player.equals("x")) {
                        Main.popup("Game Over, player 1 wins!");
                    } else {
                        Main.popup("Game Over, player 2 wins!");
                    }
                    Main.quitGame();
                }
            }
        }
       }
       //Diagonal check

        //check down and right
        for(int h = 0; h < grid.getHeight(); h++) {
            if(h <= 2) {
                for (int w = 0; w < grid.getWidth(); w++) {
                    if (w + h < grid.getWidth() && w + h < grid.getHeight()) {
                        System.out.println(grid.getElement(w + h, w));
                    }
                }
                System.out.println("************************** H = " + h);
            }
        }

        //end check up and right

        //end Diagonal check

        int size = 0; // Full board win condition
        for (int i = 0; i < grid.getHeight(); i++) { // Check if the board is full
            for (int a = 0; a < grid.getWidth(); a++) {
                if (grid.getElement(i, a) == null) {
                    size++;
                }
            }
        }
        if (size == 0) {// on win
            Main.popup("Game Over, No one wins!");
            Main.quitGame();
        }
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
        if (e.getX() >= 190 && e.getX() <= 285) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(0)) {
                    if (currentPlayer) {
                        grid.addToColom(0, "x");
                    } else {
                        grid.addToColom(0, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }
        if (e.getX() >= 285 && e.getX() <= 370) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(1)) {
                    if (currentPlayer) {
                        grid.addToColom(1, "x");
                    } else {
                        grid.addToColom(1, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }
        if (e.getX() >= 370 && e.getX() <= 465) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(2)) {
                    if (currentPlayer) {
                        grid.addToColom(2, "x");
                    } else {
                        grid.addToColom(2, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }
        if (e.getX() >= 465 && e.getX() <= 555) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(3)) {
                    if (currentPlayer) {
                        grid.addToColom(3, "x");
                    } else {
                        grid.addToColom(3, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }
        if (e.getX() >= 555 && e.getX() <= 645) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(4)) {
                    if (currentPlayer) {
                        grid.addToColom(4, "x");
                    } else {
                        grid.addToColom(4, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }
        if (e.getX() >= 645 && e.getX() <= 735) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(5)) {
                    if (currentPlayer) {
                        grid.addToColom(5, "x");
                    } else {
                        grid.addToColom(5, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }
        if (e.getX() >= 735 && e.getX() <= 830) {
            if (e.getY() >= 145 && e.getY() <= 625) {
                if (!grid.isColomFull(6)) {
                    if (currentPlayer) {
                        grid.addToColom(6, "x");
                    } else {
                        grid.addToColom(6, "y");
                    }
                    currentPlayer = !currentPlayer;
                    checkWin();
                }
            }
        }

//		for(int i = 0; i < grid.getHeight(); i++) {
//			for(int a = 0; a < grid.getWidth(); a++) {
//				System.out.print(grid.getElement(i, a) + " ");
//			}
//			System.out.println("\n");
//		}
//		System.out.println("***********************************");
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
