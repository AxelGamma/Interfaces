package ManejoDeComponentesGraficos;

import javax.swing.*;

public class AplicacionMenu extends JFrame {
    public static void main(String[]args){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("No se pudo establecer el aspecto deseado"+ e);
        }

        new Interface().setVisible(true);
    }

}
