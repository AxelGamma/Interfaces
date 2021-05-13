package DibujoBucle;

import javax.swing.*;
import java.awt.*;

public class Componentes extends JPanel {
    public void paintComponent(Graphics g){
        setBackground(new Color(95, 14, 125));
        super.paintComponent(g);
        int a=400,i;
        g.setColor(new Color(141, 96, 29));

        //Techo
        for ( i=0;i<=150;i++){
            g.drawLine(75,150,i,300);
        }

        //Casa
        g.setColor(new Color(226, 32, 32));
        for (i=0;i<=150;i++){
            g.drawLine(0,300,i,a);
            if (i==150){
                while(0<a){
                    a--;
                    g.drawLine(0,300,i,a);
                    if (a==300) break;
                }
            }

        }

        //Pasto
        g.setColor(Color.GREEN);
        int y=500;
        for (i=0;i<=600;i++){
            g.drawLine(0,400,i,y);
            if (i==600){
                while (y>400){
                y--;
                g.drawLine(0,400,i,y);
                if (y==400)break;}
            }
        }


        //Sol con fondo amarillo

        g.setColor(new Color(246,255,51));
        g.fillOval(500,100,30,30);

        //Puerta
        int x,y1=400;
        g.setColor(new Color(123, 80, 42));
        for (x=60;x<=90;x++){
            g.drawLine(60,340,x,y1);
            if (x == 90) {
                while (y1>=340){
                y1--;
                g.drawLine(60,340,x,y1);
                if (y1==340)break;
                }
            }
        }

        //Nubes
        g.setColor(new Color(51, 248, 255));
        g.fillOval(300,100,30,30);
        g.fillOval(320,100,30,30);
        g.fillOval(310,110,30,30);
        g.fillOval(330,110,30,30);

        g.setColor(new Color(51, 248, 255));
        g.fillOval(200,100,30,30);
        g.fillOval(220,100,30,30);
        g.fillOval(215,110,30,30);
        g.fillOval(235,110,30,30);

        /*//Arbol
        g.setColor(new Color(25, 186, 19));

        int izq=400;
        int cont=0;
        for (i=300;i>250;i-=10){
            g.fillOval(izq,i,30,30);
            izq-=10;
            if (i==290){
                i+=10;
                cont++;
                g.fillOval(izq,i,30,30);
                if(cont==4){
                    break;
                }
            }
        }*/
    }

}
