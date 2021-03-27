package ManejoDeComponentesGraficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;


public class Menu extends JFrame {
    //•	Problema 1: Calcular el área y perímetro de un Triángulo.
    //•	Problema 2: Leer 2 números y permitir al usuario las opciones de mostrar la suma, diferencia, producto o cociente de ellos.
    //•	Problema 3: Leer los coeficientes de un polinomio de segundo grado y mostrar sus resultados (raíces).

    BotonesMenu Menu= new BotonesMenu();


    //Contructor
    public Menu() {
        super("Calculadora ");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}