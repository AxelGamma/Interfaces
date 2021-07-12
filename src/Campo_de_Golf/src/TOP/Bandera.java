package TOP;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Luis Ponce
 */
public class Bandera extends JPanel {

    public void dibujarBandera(Graphics g) {

        g.setColor(Color.RED);        // BANDERA
        g.fillRect(250, 120, 60, 25);
        g.setColor(Color.GRAY);       // PALO       
        g.fillRect(250, 145, 5, 105);
        g.setColor(Color.BLACK);      // HOYO
        g.fillOval(242, 250, 20, 10);

    }

}
