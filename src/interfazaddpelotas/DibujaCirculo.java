
package interfazaddpelotas;

import java.awt.*;


public class DibujaCirculo {
    int x, y, diametro, direc, vel = 8;
    Color color;


    public DibujaCirculo() {

    }


    public DibujaCirculo(int x, int y, int diametro, Color color) {
        super();
        this.x = x;
        this.y = y;
        this.diametro = diametro;
        this.color = color;
        direc = 2;

    }

    public Color getColor() {
        return color;
    }

    public Graphics dibuja(Graphics g) {

        g.setColor(color);
        g.fillOval(x, y, diametro, diametro);
        mover();
        rebotar();
        return g;
    }

    public void rebotar() {
        if (x > 450 && y>450) {
            direc = 3;
        }
        else if (x<=450 && y>=x){
            direc=1;
        }
        else if (x==0 && y>x){
            direc=4;
        }
        else if (x>y && y==0){
            direc=2;
        }




    }

    public void mover() {
        if (direc == 0) {
            y += vel;
        } else if (direc == 1) {
            x-= vel;
            y-=vel;
        } else if (direc == 2) {
            x+= vel;
            y+=vel;

        } else if (direc == 3) {
            x-= vel;
            y+=vel;
        }
        else if (direc==4){
            x+=vel;
            y-=vel;
        }
    }


}
