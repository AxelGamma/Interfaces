package EcuacionCuadratica;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.*;


public class EcuacionesCuadraticas extends JFrame {

    //Variables las etiquetas
    private JLabel a, b, c;
    //
    private JTextField at;
    private JTextField bt;
    private JTextField ct;
    private JTextField x1;
    private JTextField x2;
    private JLabel xOne, xTwo;
    private JButton aceptar;
    private Object Boton;

    //Constructor
    public EcuacionesCuadraticas() {
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(270, 200);//Size que definimos
        setLocationRelativeTo(null);//Aparece en el centro
        setResizable(false);//Se bloque los rangos de la ventana
        Componentes();
        Boton();
        respuestas();

    }

    //
    public void Componentes() {
        JPanel panelArriba = new JPanel();
        aceptar = new JButton();
        a = new JLabel();
        b = new JLabel();
        c = new JLabel();
        at = new JTextField(5);
        bt = new JTextField(5);
        ct = new JTextField(5);

        xOne = new JLabel();
        xTwo = new JLabel();

        x1 = new JTextField(6);
        x2 = new JTextField(6);

        //Etiquetas
        a.setText("a"); //Como se llama la etiqueta
        getContentPane().add(a);
        panelArriba.add(a);

        //Caja de texto
        at.setText("");
        getContentPane().add(at);
        panelArriba.add(at);
        //Etiquetas
        b.setText("b");
        getContentPane().add(b);
        panelArriba.add(b);

        //Caja de texto
        bt.setText("");
        getContentPane().add(bt);
        panelArriba.add(bt);

        //Etiquetas
        c.setText("c");
        getContentPane().add(c);
        panelArriba.add(c);

        //Caja de texto
        ct.setText("");
        getContentPane().add(ct);
        panelArriba.add(ct);
        getContentPane().add(panelArriba);
    }

    public void respuestas() {
        JPanel panelabajo = new JPanel();
        //Etiqueta
        xOne.setText("x1");
        getContentPane().add(xOne);
        panelabajo.add(xOne);
        //Caja de texto
        x1.setText("");
        getContentPane().add(x1);
        x1.setHorizontalAlignment(JTextField.CENTER);
        panelabajo.add(x1);

        //Etiqueta
        xTwo.setText("x2");
        getContentPane().add(xTwo);
        panelabajo.add(xTwo);
        //Caja de texto
        x2.setText("");
        getContentPane().add(x2);
        panelabajo.add(x2);
        getContentPane().add(panelabajo);

    }

    public void Boton() {

        JPanel panelCentro = new JPanel();

        aceptar.setText("Hacer Operacion");
        getContentPane().add(aceptar);
        panelCentro.add(aceptar);
        getContentPane().add(panelCentro);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aceptarActionPerformed(e);
            }

            private void aceptarActionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("####.###");
                if (e.getSource()==aceptar) {
                    try {


                        double a1, b1, c1, primerR, segundaR, denominador, Raiz, primeraX = 0, segundaX = 0;

                        a1 = Double.parseDouble(at.getText());
                        b1 = Double.parseDouble(bt.getText());
                        c1 = Double.parseDouble(ct.getText());

                        //Sacando la raiz de 4ac
                        primerR = (4 * a1 * c1);
                        //Sacando la b elevado al cuadrado
                        segundaR = ((b1 * b1) - (primerR));
                        //Denominador
                        denominador = ((2) * (a1));
                        //Sacando la raiz
                        Raiz = Math.sqrt(segundaR);
                        //Si es mayor hace la operacion
                        System.out.println(Raiz);
                        if (segundaR > 0) {

                            primeraX = ((-1 * b1) + Math.sqrt(segundaR)) / denominador;
                            String cadena1 = String.valueOf(df.format(primeraX));
                            x1.setText(cadena1);

                            segundaX = ((-1 * b1) - Math.sqrt(segundaR)) / denominador;
                            String cadena2 = String.valueOf(df.format(segundaX));
                            x2.setText(cadena2);

                        }
                        if (segundaR < 0) {
                            x1.setText((-1*b1)+"+"+"√"+segundaR+"i"+"/"+(2*a1)); // si es un numero imaginario
                            x2.setText((-1*b1)+"-"+"√"+segundaR+"i"+"/"+(2*a1));
                        }

                    } catch (NumberFormatException exception) {
                        x1.setText("Error");
                        x2.setText("Error");
                    }
                }
            }

        });


    }
}



