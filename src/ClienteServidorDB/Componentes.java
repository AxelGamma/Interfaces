package ClienteServidorDB;

import javax.swing.*;
import java.awt.*;


public class Componentes extends JFrame {

    public Componentes() {
        super("Cliente");
        setSize(750, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().setBackground(new Color(99, 199, 74));
            add(new Servidor());
            add(new Cliente());

    }


}
