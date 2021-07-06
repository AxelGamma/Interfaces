package Modelo_De_Transporte;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface() {

        super("Modelo de transporte");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new Complementos());
    }
}
