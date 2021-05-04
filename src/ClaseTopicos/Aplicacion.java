package ClaseTopicos;

import javax.swing.*;
import java.awt.*;

public class Aplicacion {
    public static void main(String[]args){
        JFrame frame= new JFrame();

        frame.setSize(600,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Componentes());


    }
}
