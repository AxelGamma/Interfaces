package TOP;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * @author Luis Ponce
 */
public class Escenario extends JFrame {
    esCenario escenario;
    private Cielo cielo1;
    private Pasto pasto1;
    private Pelota pelota1;
    private Sol sol1;
    private Bandera bandera1;

    public Escenario() {

        escenario = new esCenario();
        cielo1 = new Cielo();
        pasto1 = new Pasto();
        pelota1 = new Pelota();
        bandera1 = new Bandera();
        sol1 = new Sol();
        add(escenario);

    }

    class esCenario extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //Cielo
            cielo1.dibujarCielo(g);
            //Pasto
            pasto1.dibujarPasto(g);

            //Bandera
            bandera1.dibujarBandera(g);
            //Sol
            sol1.dibujarSol(g);
            //Pelota
            pelota1.dibujarPelota(g);
            //Movimiento de la pelota
            pelota1.mover();

        }
    }

}
