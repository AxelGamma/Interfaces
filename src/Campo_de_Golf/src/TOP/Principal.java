package TOP;

import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author Luis Ponce
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException{
        Escenario frame = new Escenario();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Campo de Golf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(605, 410); // set frame size
        frame.setVisible(true); // display frame



        while (true){
            frame.repaint();
            Thread.sleep(10);
        }




    }

}
