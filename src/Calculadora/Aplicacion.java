package Calculadora;

import javax.swing.*;

public class Aplicacion {
    public static void main(String []args){
        try{
            //Aspecto y percepcion de la interfz grafica
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch (Exception e){
            System.out.println("No se pudo establecer el aspecto deseado: "+e);

        }
        new Calculadora().setVisible(true);
    }


}
