
package interfazaddpelotas;

import javax.swing.*;

public class InterfazAddPelotas {


    public static void main(String[] args) throws InterruptedException {
        JFrame window = new JFrame("Circulo");

        JPanelCiruclo panel = new JPanelCiruclo();
        window.setContentPane(panel);
        window.addMouseListener(new CirculoPelotasListen(panel));
        window.setSize(450, 450);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        while (true) {
            window.repaint();
            Thread.sleep(15);
        }
    }

}
