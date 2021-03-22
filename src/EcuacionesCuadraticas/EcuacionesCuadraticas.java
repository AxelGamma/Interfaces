package EcuacionesCuadraticas;
//Aqui estoy importando las librerias
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.*;

public class EcuacionesCuadraticas extends JFrame {

    //Variables las etiquetas, los cuadros de texto y el boton
    private JLabel a, b, c;
    private JTextField at,bt,ct,x1,x2;
    private JLabel xOne, xTwo;
    private JButton aceptar;



    //Constructor
    public EcuacionesCuadraticas() {
        setTitle("Ecuaciones Cuadraticas");//Titulo
        setLayout(new FlowLayout()); //FlowLayout esto fluye de forma horizontal de izquierda a derecha
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
        setSize(300, 200);//Tamaño que definimos
        setLocationRelativeTo(null);//Aparece en el centro
        setResizable(true);//Se bloque los rangos de la ventana
        //Invocando a los metodos
        Componentes();
        Boton();
        respuestas();

    }

    public void Componentes() {
        //Nuestro panel el cual va guardar los valores a,b,c
        JPanel panelArriba = new JPanel();

        //Creamos los objetos de tipo JLabel
        aceptar = new JButton();
        a = new JLabel();
        b = new JLabel();
        c = new JLabel();
        xOne = new JLabel();
        xTwo = new JLabel();

        //Creamos los objetos de tipo JTextField
        at = new JTextField(5);
        bt = new JTextField(5);
        ct = new JTextField(5);
        x1 = new JTextField(10);
        x2 = new JTextField(10);

        //Etiquetas
        a.setText("a"); //Como se llama la etiqueta
        panelArriba.add(a);

        //Caja de texto
        at.setText("");
        panelArriba.add(at);
        //Etiquetas
        b.setText("b");
        panelArriba.add(b);

        //Caja de texto
        bt.setText("");
        panelArriba.add(bt);

        //Etiquetas
        c.setText("c");
        panelArriba.add(c);

        //Caja de texto
        ct.setText("");
        panelArriba.add(ct);
        add(panelArriba);

    }
    //Metodo que contiene las etiquetas y cajas de texto de los resultados
    public void respuestas() {
        JPanel panelabajo = new JPanel();
        //Etiqueta
        xOne.setText("x1");
        panelabajo.add(xOne);
        //Caja de texto
        x1.setText("");
        panelabajo.add(x1);

        //Etiqueta
        xTwo.setText("x2");
        panelabajo.add(xTwo);
        //Caja de texto
        x2.setText("");
        panelabajo.add(x2);
        add(panelabajo);

    }
    //Metodo que contiene el boton
    public void Boton() {

        JPanel panelCentro = new JPanel();
        aceptar.setText("Hacer Operacion");
        panelCentro.add(aceptar);
        add(panelCentro);
        //El boton -> ActionOyente se crea un objeto de ActionListener
        //Agrega un ActionListener al botón
        //Utilizando el metodo addActionListener  del Componente.
        //Cuando ocurre el even de accion, se invoca el metodo actionPerformed de ese objeto
        //Clase anonima


        aceptar.addActionListener(new ActionListener() {
            @Override
            //Este metodo envia un evento
            public void actionPerformed(ActionEvent e) {

                //Estamos enviando el evento al metodo aceptarActionPerformed
                aceptarActionPerformed(e);
            }

            private void aceptarActionPerformed(ActionEvent e) {

                DecimalFormat formato = new DecimalFormat("####.###");

                try {

                    double a1, b1, c1, primerR, segundaR, denominador, primeraX = 0, segundaX = 0;

                    a1 = Double.parseDouble(at.getText());
                    b1 = Double.parseDouble(bt.getText());
                    c1 = Double.parseDouble(ct.getText());

                    //Sacando la raiz de 4ac
                    primerR = (4 * a1 * c1);
                    //Sacando la b elevado al cuadrado
                    segundaR = ((b1 * b1) - (primerR));
                    //Denominador
                    denominador = ((2) * (a1));

                    //Si es mayor a cero
                    if (segundaR > 0) {
                        //primeraX guarda el resulatado
                        primeraX = ((-1 * b1) + Math.sqrt(segundaR)) / denominador;
                        //A primeraX se le da el formato que queremos, luego valueOf lo convierte a String y lo guarda en la variable
                        //Cadena
                        String cadena1 = String.valueOf(formato.format(primeraX));
                        x1.setText(cadena1);

                        segundaX = ((-1 * b1) - Math.sqrt(segundaR)) / denominador;
                        String cadena2 = String.valueOf(formato.format(segundaX));
                        x2.setText(cadena2);

                    }
                    //Numero imaginario, no tiene raiz en los numeros reales
                    else{
                        x1.setText((-1*b1)+"+"+"√"+segundaR+"i"+"/"+(2*a1)); // si es un numero imaginario
                        x2.setText((-1*b1)+"-"+"√"+segundaR+"i"+"/"+(2*a1));
                    }

                } catch (NumberFormatException evento) {
                    x1.setText("Error");
                    x2.setText("Error");
                }
            }

        });


    }


}



