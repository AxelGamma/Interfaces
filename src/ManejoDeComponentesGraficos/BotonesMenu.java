package ManejoDeComponentesGraficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesMenu extends JFrame {
    //Botones
    private JButton problema1, problema2, problema3;
    JPanel panel;

    public BotonesMenu(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(350,300);
        setResizable(false);
        setLocationRelativeTo(null);
        botones();
    }

    public void botones() {

        panel= new JPanel();

        problema1 = new JButton("Sacar el area y perimetro de un triangulo");
        panel.add(problema1);

        problema2 = new JButton("Sacar la suma, diferencia, producto, o cociente");
        panel.add(problema2);

        problema3 = new JButton("Leer los coeficientes de un polinomio");
        panel.add(problema3);
        add(panel);


    }
}
