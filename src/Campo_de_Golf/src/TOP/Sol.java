package TOP;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Luis Ponce
 */
public class Sol extends JPanel {

    public void dibujarSol(Graphics g) {

        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D
        g2d.setPaint(new GradientPaint(530, -10, Color.YELLOW, 35, 100, Color.ORANGE, true));  // draw 2D ellipse filled with a blue-yellow gradient 5,5
        g2d.fill(new Ellipse2D.Double(530, -10, 120, 120));

        // draw 2D line using stroke
        float[] dashes = {10}; // specify dash pattern
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(600, 3, 480, 50));
        g2d.draw(new Line2D.Double(600, 3, 500, 95));
        g2d.draw(new Line2D.Double(600, 3, 530, 130));
        g2d.draw(new Line2D.Double(600, 3, 570, 130));

    }

}
