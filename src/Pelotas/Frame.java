package Pelotas;



import Dibujo.Componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Frame extends JFrame{
    JPanel panel= new JPanel();

    public Frame() throws InterruptedException {
        super("Pelotas");
        setSize(450,450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Componentes();
        add(panel);

        while (true) {
            this.repaint();
            Thread.sleep(10);
        }


    }

    public void Componentes(){

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.add(new Pelotas());

            }
        });
    }




}
