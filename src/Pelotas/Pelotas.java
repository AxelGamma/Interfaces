package Pelotas;

import javax.swing.*;
import java.awt.*;

public class Pelotas extends JPanel {
    int x=getX(), y=getY(), diametro=40, direc, vel = 8;
    Color color;
    public void paintComponent(Graphics g) {
        setSize(450,450);
        g.setColor(color);
        g.fillOval(x, y, diametro, diametro);
        mover();
        rebotar();
    }

    public Color getColor() {
        return color;
    }



    public void rebotar() {
        if (x >= 450 && y>=450) {
            direc = 3;
        }else if(x <= 450 && y<=450){
            direc = 2;
        }

    }

    public void mover() {
        if (direc == 0) {
            y += vel;
        } else if (direc == 1) {
            x+= vel;
            y-=vel;
        } else if (direc == 2) {
            x+= vel;
            y+=vel;

        } else if (direc == 3) {
            x-= vel;
            y+=vel;

        }
    }

}
