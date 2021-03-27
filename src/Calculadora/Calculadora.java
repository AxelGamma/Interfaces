package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculadora extends JFrame {
    JButton jbtDigito0, jbtDigito1, jbtDigito2, jbtDigito3, jbtDigito4, jbtDigito5, jbtDigito6, jbtDigito7;
    JButton jbtDigito8, jbtDigito9, jbtMas, jbtMenos, jbtDividir, jbtPuntoDecimal, jbtPor, jbtIgual, jbtTantoPorCierto;
    JButton jbtIniciar, jbtBorrarEntrada;
    JTextField jtfPantalla;
    Entrada ultimaEntrada;
    private boolean puntodecimal;
    private char operador;
    private byte numOperando;
    private double operando1, operando2;


    private enum Entrada {
        NINGUNA, DIGITO, OPERADOR, CE;
    }


    //Creamos un formulario Calculadora nuevo

    public Calculadora() {
        setSize(222, 232); //Size del formulario
        setTitle("Calculadora");//Titulo del formulario
        setLocationRelativeTo(null);
        componentes();
        ultimaEntrada = Entrada.NINGUNA;
        puntodecimal = false;
        operador = 0;
        numOperando = 0;
        operando1 = 0;
        operando2 = 0;

    }

    //El siguiente metodo es llamado por el constructor Calcladora

    private void componentes() {
        //Crear los componentes del formulario
        jtfPantalla = new JTextField();
        jbtDigito0 = new JButton();
        jbtDigito1 = new JButton();
        jbtDigito2 = new JButton();
        jbtDigito3 = new JButton();
        jbtDigito4 = new JButton();
        jbtDigito5 = new JButton();
        jbtDigito6 = new JButton();
        jbtDigito7 = new JButton();
        jbtDigito8 = new JButton();
        jbtDigito9 = new JButton();
        jbtPuntoDecimal = new JButton();
        jbtMas = new JButton();
        jbtMenos = new JButton();
        jbtPor = new JButton();
        jbtDividir = new JButton();
        jbtIgual = new JButton();
        jbtTantoPorCierto = new JButton();
        jbtIniciar = new JButton();
        jbtBorrarEntrada = new JButton();

        //Asignar al formulario un administrador de diseño null
        getContentPane().setLayout(null);

        //No permitir cambiar el size del formulario
        setResizable(false);

        //Escuchador ActionListener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }

        });

        //Add los componentes al contenedor y establecer sus propiedades

        jtfPantalla.setEditable(false);
        jtfPantalla.setFont(new Font("SansSerif", 1, 14));//Toma tres parametros: nombre de la fuente
        //El estilo y el size
        jtfPantalla.setText("0.");
        jtfPantalla.setBackground(new Color(145, 168, 163));
        jtfPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jtfPantalla);
        jtfPantalla.setBounds(8, 8, 200, 24);

        //Botones
        jbtDigito0.setText("0");
        jbtDigito0.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito0);
        jbtDigito0.setBounds(8, 164, 68, 28);

        jbtDigito1.setText("1");
        jbtDigito1.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito1);
        jbtDigito1.setBounds(8, 124, 28, 28);

        jbtDigito2.setText("2");
        jbtDigito2.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito2);
        jbtDigito2.setBounds(48, 124, 28, 28);

        jbtDigito3.setText("3");
        jbtDigito3.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito3);
        jbtDigito3.setBounds(88, 124, 28, 28);

        jbtDigito4.setText("4");
        jbtDigito4.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito4);
        jbtDigito4.setBounds(8, 84, 28, 28);

        jbtDigito5.setText("5");
        jbtDigito5.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito5);
        jbtDigito5.setBounds(48, 84, 28, 28);

        jbtDigito6.setText("6");
        jbtDigito6.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito6);
        jbtDigito6.setBounds(88, 84, 28, 28);


        jbtDigito7.setText("7");
        jbtDigito7.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito7);
        jbtDigito7.setBounds(8, 44, 28, 28);

        jbtDigito8.setText("8");
        jbtDigito8.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito8);
        jbtDigito8.setBounds(48, 44, 28, 28);

        jbtDigito9.setText("9");
        jbtDigito9.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDigito9);
        jbtDigito9.setBounds(88, 44, 28, 28);

        jbtPuntoDecimal.setText(".");
        jbtPuntoDecimal.setMargin(new Insets(2, 2, 2, 2));
        add(jbtPuntoDecimal);
        jbtPuntoDecimal.setBounds(88, 164, 28, 28);

        jbtPuntoDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtPuntoDeActionPerformed(e);
            }
        });

        jbtPor.setText("x");
        jbtPor.setMargin(new Insets(2, 2, 2, 2));
        add(jbtPor);
        jbtPor.setBounds(130, 124, 28, 28);

        jbtDividir.setText("/");
        jbtDividir.setMargin(new Insets(2, 2, 2, 2));
        add(jbtDividir);
        jbtDividir.setBounds(130, 84, 28, 28);

        jbtBorrarEntrada.setText("C");
        jbtBorrarEntrada.setMargin(new Insets(2, 2, 2, 2));
        add(jbtBorrarEntrada);
        jbtBorrarEntrada.setBounds(130, 44, 28, 28);

        jbtBorrarEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtBorrarEntradaActionPerformed(e);
            }
        });

        jbtIniciar.setText("CE");
        jbtIniciar.setMargin(new Insets(2, 2, 2, 2));
        add(jbtIniciar);
        jbtIniciar.setBounds(170, 44, 28, 28);

        jbtMenos.setText("-");
        jbtMenos.setMargin(new Insets(2, 2, 2, 2));
        add(jbtMenos);
        jbtMenos.setBounds(170, 84, 28, 28);

        jbtIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtIniciarActionPerformed(e);
            }
        });

        jbtMas.setText("+");
        jbtMas.setMargin(new Insets(2, 2, 2, 2));
        add(jbtMas);
        jbtMas.setBounds(170, 124, 28, 28);

        jbtIgual.setText("=");
        jbtIgual.setMargin(new Insets(2, 2, 2, 2));
        add(jbtIgual);
        jbtIgual.setBounds(130, 164, 28, 28);

        jbtTantoPorCierto.setText("%");
        jbtTantoPorCierto.setMargin(new Insets(2, 2, 2, 2));
        add(jbtTantoPorCierto);
        jbtTantoPorCierto.setBounds(170, 164, 28, 28);

        jbtTantoPorCierto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JbtTantoPorCiertoActionPerformed(e);
            }
        });

        ActionListener alop = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtOperacionActionPerformed(e);
            }
        };
        jbtMas.addActionListener(alop);
        jbtMenos.addActionListener(alop);
        jbtDividir.addActionListener(alop);
        jbtPor.addActionListener(alop);
        jbtIgual.addActionListener(alop);



        //Manejador de eventos

        ActionListener aldigi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtDigitoActionPerformed(e);
            }
        };
        jbtDigito0.addActionListener(aldigi);
        jbtDigito1.addActionListener(aldigi);
        jbtDigito2.addActionListener(aldigi);
        jbtDigito3.addActionListener(aldigi);
        jbtDigito4.addActionListener(aldigi);
        jbtDigito5.addActionListener(aldigi);
        jbtDigito6.addActionListener(aldigi);
        jbtDigito7.addActionListener(aldigi);
        jbtDigito8.addActionListener(aldigi);
        jbtDigito9.addActionListener(aldigi);

    }

    //Salir de la aplicacion

    private void exitForm(WindowEvent event) {
        System.exit(0);
    }

    private void jbtDigitoActionPerformed(ActionEvent e) {
        //Obtener el id del boton que genero el evento
        JButton objJBT = (JButton) e.getSource();
        //Escribir en la pantalla el texto del boton pulsado
        String textoBoton = objJBT.getText();
        if (ultimaEntrada != Entrada.DIGITO) {
            if (textoBoton.compareTo("0") == 0) return;
            jtfPantalla.setText(" ");
            ultimaEntrada = Entrada.DIGITO;
            puntodecimal = false;
        }
        //Escribir en la pantall el texto del boton pulsado
        jtfPantalla.setText(jtfPantalla.getText() + objJBT.getText());
    }

    private void jbtPuntoDeActionPerformed(ActionEvent evt) {

        if (ultimaEntrada != Entrada.DIGITO) {
            jtfPantalla.setText("0.");
            ultimaEntrada = Entrada.DIGITO;
        } else if (puntodecimal == false) {
            jtfPantalla.setText(jtfPantalla.getText() + ".");

        }
        puntodecimal = true;
    }

    private void jbtOperacionActionPerformed(ActionEvent event) {
        //Obtener el id del boton que genero el evento
        JButton objTBT = (JButton) event.getSource();
        //Obtener el texto del boton pulsado
        String textBoton = objTBT.getText();

        if ((numOperando==0) && (textBoton.compareTo("-")==0)) ultimaEntrada=Entrada.DIGITO;
        if (ultimaEntrada == Entrada.DIGITO) {
            numOperando++;
        }
        if (numOperando == 1) {
            operando1 = Double.parseDouble(jtfPantalla.getText());
        } else if (numOperando == 2) {
            operando2 = Double.parseDouble(jtfPantalla.getText());
            switch (operador) {
                case '+':
                    operando1 += operando2;
                    break;
                case '-':
                    operando1 -= operando2;
                    break;
                case 'x':
                    operando1 *= operando2;
                    break;
                case '/':
                    operando1 /= operando2;
                    break;
                case '=':
                    operando1 = operando2;
                    break;
            }
            //Visualizar el resultado
            jtfPantalla.setText(Double.toString(operando1));
            numOperando=1;
        }
        operador=textBoton.charAt(0);
        ultimaEntrada=Entrada.OPERADOR;
    }

    public void JbtTantoPorCiertoActionPerformed(ActionEvent evt){
        double resultado;
        if (ultimaEntrada== Entrada.DIGITO){
            resultado= operando1+Double.parseDouble(jtfPantalla.getText())/100;
            //Visualizar el resultado
            jtfPantalla.setText(Double.toString(resultado));
            //Simular que ha hecho clic en =
            jbtIgual.doClick();
            //Enfocar la tecla %
            jbtTantoPorCierto.requestFocus();
        }
    }

    private void jbtIniciarActionPerformed(ActionEvent evt){
        jtfPantalla.setText("0.");
        ultimaEntrada= Entrada.NINGUNA;
        puntodecimal=false;
        operador=0;
        numOperando=0;
        operando1=0;
        operando2=0;

    }

    private void jbtBorrarEntradaActionPerformed(ActionEvent e){
        jtfPantalla.setText("0.");
        ultimaEntrada= Entrada.CE;
        puntodecimal=false;
    }


}
