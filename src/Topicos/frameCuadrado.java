package Topicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class frameCuadrado extends JFrame {
    //Declarar los componentes
    private JLabel lblnumero;
    private JTextField txtNumero, txtResultado;
    private JButton btCuadrado;

    //Constructor
    public frameCuadrado(){

        setSize(300,300);
        setTitle("Elevacion al cuadrado");
        Componentes();

    }
    public void Componentes(){

        lblnumero= new JLabel();
        txtNumero= new JTextField();
        txtResultado= new JTextField();
        btCuadrado= new JButton();

        setLayout(null);

        lblnumero.setText("Primer numero");
        add(lblnumero);
        lblnumero.setBounds(0,28,144,24);

        txtNumero.setText("");
        txtNumero.setHorizontalAlignment(JTextField.RIGHT);
        add(txtNumero);
        txtNumero.setBounds(122,28,144,24);

        txtResultado.setText("Resulado");
        add(txtResultado);
        txtResultado.setHorizontalAlignment(JTextField.CENTER);
        txtResultado.setBounds(70,70,130,24);

        btCuadrado.setText("Sacar el resultado");
        getRootPane().setDefaultButton(btCuadrado);
        add(btCuadrado);
        btCuadrado.setBounds(70,100,170,24);

            btCuadrado.addActionListener(new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent e) {
                    try {
                        if (e.getSource() == btCuadrado) {
                            int n = Integer.parseInt(txtNumero.getText());
                            double cuadrado = Math.pow(n, 2);
                            String resultado = String.valueOf(cuadrado);
                            txtResultado.setText(resultado);
                        }
                    }catch (NumberFormatException a){
                        txtResultado.setText("Introdusca un numero");
                    }
                }
            });


        }
}

