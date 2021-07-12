package TOP;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Luis Ponce
 */
public class Pelota extends JPanel {
    boolean tr = true;
    private int x =400,y=230,x1=20,x2=20;
    public int vel =2;

    public void dibujarPelota(Graphics g) {
        g.setColor(Color.WHITE);      // PELOTA
        g.fillOval(x, y, x1, x2);


    }
    //Clase del movimiento de la pelota
    public void mover(){

            if (tr) {
                //Hace que se mueva
                if (x>245){
                    x -= vel;
                }
                else {// Sino se detiene
                    x=243;
                    y=240;
                    tr=false;
                    if (tr==false){//Y esta hace que desaparesca
                        x1=0;
                        x2=0;

                    }

                }

            }

    }
}
