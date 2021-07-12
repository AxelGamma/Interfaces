package TOP;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Luis Ponce
 */
public class Pasto extends JPanel {
    
    public void dibujarPasto(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D
        g2d.setPaint(new GradientPaint(0, 180, Color.GREEN, 5, 400, Color.YELLOW, true));  // draw 2D ellipse filled with a blue-yellow gradient 5,5
        g2d.fill(new Rectangle2D.Double(0, 180, 600, 200));        
    }
    
    
}
