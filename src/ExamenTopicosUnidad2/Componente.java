package ExamenTopicosUnidad2;

import javax.swing.*;
import java.awt.*;

public class Componente extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(new Color(255, 7, 7));
        g.drawLine(0,this.getHeight()/2,this.getWidth(),this.getHeight()/2);
        g.drawLine(this.getWidth()/2,0,this.getWidth()/2,this.getHeight());

    }
}
