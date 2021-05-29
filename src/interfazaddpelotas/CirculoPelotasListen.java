
package interfazaddpelotas;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class CirculoPelotasListen extends MouseAdapter{
  JPanelCiruclo panel;

  Random ale= new Random();
 
  
    public CirculoPelotasListen(JPanelCiruclo p) {
        this.panel = p;
    }
   
    @Override
    public void mouseClicked(MouseEvent e) {
    int a,b,c;
    a=ale.nextInt(256);
    b=ale.nextInt(256);
    c=ale.nextInt(256);
    
        panel.setSize(450,450);
       panel.addCirculo(new DibujaCirculo(e.getX(),e.getY(),40, new Color (a,b,c)));
        
    }

    
    
}
