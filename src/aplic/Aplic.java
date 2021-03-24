
package aplic;

import javax.swing.SwingUtilities;

/**
 * @author Julia Ramos Lopez
 */
public class Aplic {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                EcuacionesCuadraticas ec = new EcuacionesCuadraticas();
                ec.setVisible(true);
                ec.setResizable(false);


            }

        });
    }

}
