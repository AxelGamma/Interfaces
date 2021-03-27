package ManejoDeComponentesGraficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangulo extends JFrame {
    private JLabel area, perimetro, base, altura, lado;
    private JTextField areatf, perimetrotf, basetf, alturatf, ladotf;
    private JButton hacerOperacion;

    JPanel panel = new JPanel();
    JButton botonatras;
    JLabel tituloArea = new JLabel(" Area");



    public Triangulo(){
        setLayout(new FlowLayout(1, 15, 15));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setResizable(false);
        setLocationRelativeTo(null);


    }

    public void triangulo() {
        area = new JLabel("Area:");
        perimetro = new JLabel("Perimetro");
        perimetrotf = new JTextField("", 10);
        areatf = new JTextField("", 10);
        altura = new JLabel("Introduce la altura");
        base = new JLabel("Introduce la base");
        alturatf = new JTextField(5);
        basetf = new JTextField(5);
        botonatras = new JButton("Atras");
        hacerOperacion = new JButton("Hacer la operacion");

        getContentPane().add(panel.add(tituloArea));

        getContentPane().add(panel.add(altura));
        getContentPane().add(panel.add(alturatf));

        getContentPane().add(panel.add(base));
        getContentPane().add(panel.add(basetf));

        getContentPane().add(panel.add(area));
        getContentPane().add(panel.add(areatf));
        getContentPane().add(panel.add(perimetro));
        getContentPane().add(panel.add(perimetrotf));


        getContentPane().add(panel.add(hacerOperacion));

        hacerOperacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}

