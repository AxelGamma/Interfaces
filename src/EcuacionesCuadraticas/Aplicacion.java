package EcuacionesCuadraticas;

import javax.swing.*;


public class Aplicacion extends JFrame {
    public static void main(String[]args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    

                }
            }

        new EcuacionesCuadraticas().setVisible(true);



    }
}
