package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Grant on 2016-12-13.
 */
public abstract class Game extends JPanel {

    public abstract void run();
    public abstract void draw(Graphics g);

}
