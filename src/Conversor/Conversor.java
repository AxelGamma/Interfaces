package Conversor;



import javax.swing.*;
import java.awt.event.*;

public class Conversor extends JFrame {
    //Declaracion de las variables
    private javax.swing.JLabel jblGradosC;
    private javax.swing.JTextField jtfGradosC;
    private javax.swing.JLabel jblGradosF;
    private javax.swing.JTextField jtfGradosF;
    private javax.swing.JButton jbtAceptar;
    private Object objTextField;

    //Creamos un formulario
    public Conversor(){
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setSize(300,300); //Size del formulario
        setTitle("Conversor de temperaturas");//Titulo del formulario
        initcomponents();



    }
    //Metodo llamado por el formulario
    private void initcomponents(){

        //Componentes
        jblGradosC= new javax.swing.JLabel();
        jtfGradosC= new javax.swing.JTextField();
        jblGradosF= new javax.swing.JLabel();
        jtfGradosF= new javax.swing.JTextField();
        jbtAceptar= new javax.swing.JButton();

        //Administrador de diseño en nullo
        getContentPane().setLayout(null);

        //Etiqueta "Grados centigrados"
        jblGradosC.setText("Grados centrigrados");
        getContentPane().add(jblGradosC);
        jblGradosC.setBounds(12,28,116,24);

        //Cajas de texto para los grados centigrados
        jtfGradosC.setText("0.00");
        jtfGradosC.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfGradosC);
        jtfGradosC.setBounds(132,28,116,24);

        //Etiqueta farenheits
        jblGradosF.setText("Grados Farenheits");
        getContentPane().add(jblGradosF);
        jblGradosF.setBounds(12,68,104,24);

        //Caja de texto para farenheits
        jtfGradosF.setText("32.00");
        jtfGradosF.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfGradosF);
        jtfGradosF.setBounds(132,72,144,24);

        //Boton de aceptar
        jbtAceptar.setText("Aceptar");
        jbtAceptar.setMnemonic('A');
        getRootPane().setDefaultButton(jbtAceptar);

        jbtAceptar.setBounds(132,120,144,24);

        jbtAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtAceptarAction(e);

            }
        });

        java.awt.event.KeyListener kl= new java.awt.event.KeyAdapter(){
            public void keyTyped(java.awt.event.KeyEvent e){
                jtfGradosKeyTyped(e);

            }
        };
        jtfGradosC.addKeyListener(kl);
        jtfGradosF.addKeyListener(kl);




        addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent e){
                formWindow(e);
            }
            public void windowClosing(WindowEvent evt){
                salir(evt);
            }
        });
        //Metodo para seleccionar el texto de la caja en la que queramos meter texto
        FocusAdapter f1= new FocusAdapter() {
            public void focusGained(FocusEvent evt){
                jtfGradosFocusGained(evt);
            }
        };
        jtfGradosF.addFocusListener(f1);
        jtfGradosC.addFocusListener(f1);

        //Al pulsar el boton enter hace la operacion

        ActionListener al= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtfGradosActionPerformed(e);
            }
        };
        jtfGradosF.addActionListener(al);
        jtfGradosC.addActionListener(al);
    }
    //Metodo del evento de pulsar solo enter
    private void jtfGradosActionPerformed(ActionEvent event){

        try{
            double grados;
            String sgrados;

            Object objJTextField= event.getSource();

            //Si se escribio en la caja de texto grados centigrados
            if (objTextField==jtfGradosC){
                sgrados= jtfGradosC.getText();
                if (sgrados.length()==0)return;//caja vacia
                grados=Double.parseDouble(sgrados)*9.0/5.0+32.0;//
                jtfGradosF.setText(String.format("%.2f",grados));
            }
            //Si se escribio en la caja de texto grados gahrenheits
            if (objTextField==jtfGradosF){
                sgrados=jtfGradosF.getText();
                if (sgrados.length()==0) return;
                grados=(Double.parseDouble(sgrados)-32)*5.0/9.0;
                jtfGradosC.setText(String.format("%.2f",grados));

            }
        }catch (NumberFormatException e){
            jtfGradosC.setText("Error");
            jtfGradosF.setText("Error");
        }


    }

    //Manda el evento al este metodo y a objEnfocado
    private void jtfGradosFocusGained(FocusEvent evt){
        JTextField objEnfocado= (JTextField)evt.getSource();
        objEnfocado.selectAll();
    }

    //Metodo que guarda la caja al cual le puse un valor
    private void jtfGradosKeyTyped(KeyEvent evt){
        objTextField=evt.getSource();
    }
    private void formWindow(WindowEvent e){
        jtfGradosC.requestFocus();
    }



    //Metodo para salir de la aplicacion

    private void salir(WindowEvent evt){

        System.exit(JFrame.EXIT_ON_CLOSE);
    }

    private void jbtAceptarAction(ActionEvent e){

        try{
            double grados;
            //Si se escribio en la caja de texto grados centrigrados
            if(objTextField==jtfGradosC){
                grados=Double.parseDouble(jtfGradosC.getText())*9.0/5.0+32;
                jtfGradosF.setText(String.format("%.2f",grados));//Redondear a decimales

            }
            if (objTextField== jtfGradosF){
                grados=Double.parseDouble(jtfGradosF.getText())*9.0/5.0+32;
                jtfGradosC.setText(String.format("%.2f",grados));//Redondear a decimales
            }
        }catch (NumberFormatException exception){
            jtfGradosC.setText("Error");
            jtfGradosF.setText("Error");
        }
    }
}
