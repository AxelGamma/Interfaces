package ServidorCliente_JR;
/* @Julia Ramos Lopez
 * No.Control:19071789*/

import javax.swing.*;
import java.awt.*;

public class Aplicacion extends JFrame {

    public Aplicacion() {
        setSize(650, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(204, 112, 250));
        setResizable(false);

        add(new Cliente());
        add(new Servidor());

    }

}
