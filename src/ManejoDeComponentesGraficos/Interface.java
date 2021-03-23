package ManejoDeComponentesGraficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interface extends JFrame {
    //•	Problema 1: Calcular el área y perímetro de un Triángulo.
    //•	Problema 2: Leer 2 números y permitir al usuario las opciones de mostrar la suma, diferencia, producto o cociente de ellos.
    //•	Problema 3: Leer los coeficientes de un polinomio de segundo grado y mostrar sus resultados (raíces).

    //Etiquetas

    private JLabel area,perimetro,base,altura, lado;
    private JTextField areatf,perimetrotf,basetf,alturatf,ladotf;
    private JButton hacerOperacion, problema1,problema2,problema3;
    JPanel panel= new JPanel();
    JPanel operacion1= new JPanel();
    JButton botonatras;

    public Interface(){

        super("Calculadora ");
        setLayout(new FlowLayout(1,15,15));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,300);
        setResizable(false);
        setLocationRelativeTo(null);
        Menu();

    }

    public void Menu(){
        panel.setLayout(new FlowLayout());
        problema1 = new JButton("Sacar el area y perimetro de un triangulo");
        add(panel.add(problema1));

        problema2= new JButton("Sacar la suma, diferencia, producto, o cociente");
        add(panel.add(problema2));

        problema3= new JButton("Leer los coeficientes de un polinomio");
        add(panel.add(problema3));


        problema1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionAceptarp1(e);
            }

        });


    }

    public void actionAceptarp1(ActionEvent event){
        setSize(400,300);
        problema1.setVisible(false);
        problema2.setVisible(false);
        problema3.setVisible(false);

        area= new JLabel("Area:");
        perimetro= new JLabel("Perimetro");
        perimetrotf= new JTextField("",10);
        areatf= new JTextField("",10);
        altura= new JLabel("Introduce la altura");
        base= new JLabel("Introduce la base");
        alturatf= new JTextField(5);
        basetf= new JTextField(5);
        botonatras= new JButton("Atras");
        hacerOperacion= new JButton("Hacer la operacion");

        JLabel tituloArea= new JLabel(" Area");
        JPanel titulo= new JPanel(new FlowLayout());

        tituloArea.setFont(new Font(" ",Font.PLAIN,13));

        titulo.add(tituloArea);

        add(operacion1.add(tituloArea));

        add(operacion1.add(altura));
        add(operacion1.add(alturatf));

        add(operacion1.add(base));
        add(operacion1.add(basetf));

        add(operacion1.add(area));
        add(operacion1.add(areatf));
        add(operacion1.add(perimetro));
        add(operacion1.add(perimetrotf));





        add(operacion1.add(hacerOperacion));

        hacerOperacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (alturatf!=null && basetf!=null) {
                        double alturad = Double.parseDouble(alturatf.getText());
                        double base = Double.parseDouble(basetf.getText());

                        double resultado = alturad * base / 2;

                        areatf.setText(String.valueOf(resultado));
                    }else {

                    }

                }catch (NumberFormatException exception){
                    areatf.setText("Introduce un numero");
                    perimetrotf.setText("Introduce un numero");
                }
            }
        });


        add(operacion1.add(botonatras));

        botonatras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volveratras(e);
            }
        });

    }

    public void volveratras(ActionEvent e){
        area.setVisible(false);
        altura.setVisible(false);
        alturatf.setVisible(false);
        perimetro.setVisible(false);
        perimetrotf.setVisible(false);
        base.setVisible(false);
        basetf.setVisible(false);
        areatf.setVisible(false);
        botonatras.setVisible(false);
        hacerOperacion.setVisible(false);

        problema1.setVisible(true);
        problema2.setVisible(true);
        problema3.setVisible(true);





    }


}