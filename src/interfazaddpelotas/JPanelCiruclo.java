
package interfazaddpelotas;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;


public class JPanelCiruclo extends JPanel {

    ArrayList<DibujaCirculo> circulos = new ArrayList<DibujaCirculo>();

    public boolean addCirculo(DibujaCirculo c) {
        return circulos.add(c);

    }

    public void paint(Graphics g) {
        for (DibujaCirculo c : circulos) {
            c.dibuja(g);
        }

    }


}
