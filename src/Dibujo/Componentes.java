package Dibujo;

import javax.swing.*;
import java.awt.*;

public class Componentes extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        int a=400;
        g.setColor(Color.BLUE);
        //Techo
        for (int i=0;i<150;i++){
            g.drawLine(75,150,i,300);
        }
        //Casa
        g.setColor(Color.MAGENTA);
        for (int i=0;i<=150;i++){
            g.drawLine(0,300,i,a);
            if (i==150){
                while(0<a){
                    a--;
                    g.drawLine(0,300,i,a);
                    if (a==300) break;
                }
            }

        }
    }
}
