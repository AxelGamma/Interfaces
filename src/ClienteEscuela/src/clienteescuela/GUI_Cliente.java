
package clienteescuela;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Sergioxd
 */
public class GUI_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Cliente
     */
    Controlador c;
    public GUI_Cliente() {
        initComponents();
        c=new Controlador(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        M_Materias = new javax.swing.JMenu();
        M_Maestros = new javax.swing.JMenu();
        M_Alumnos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        Lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        getContentPane().add(jScrollPane1);

        TxtArea.setEditable(false);
        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane3.setViewportView(TxtArea);

        getContentPane().add(jScrollPane3);

        M_Materias.setText("Materias");
        M_Materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_MateriasMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_Materias);

        M_Maestros.setText("Maestros");
        M_Maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_MaestrosMouseClicked(evt);
            }
        });
        jMenuBar1.add(M_Maestros);

        M_Alumnos.setText("Alumnos");
        M_Alumnos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                M_AlumnosMenuSelected(evt);
            }
        });
        M_Alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_AlumnosMouseClicked(evt);
            }
        });
        M_Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_AlumnosActionPerformed(evt);
            }
        });
        jMenuBar1.add(M_Alumnos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M_AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_AlumnosActionPerformed
        
       
    }//GEN-LAST:event_M_AlumnosActionPerformed

    private void M_AlumnosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_M_AlumnosMenuSelected
       
    }//GEN-LAST:event_M_AlumnosMenuSelected

    private void M_AlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_AlumnosMouseClicked
        c.goAlumnos();
        this.TxtArea.setText("");
    }//GEN-LAST:event_M_AlumnosMouseClicked

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged

        int i=this.Lista.getSelectedIndex();
        c.getImpartida(i);  
    }//GEN-LAST:event_ListaValueChanged

    private void M_MateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_MateriasMouseClicked
        c.goMaterias();
        this.TxtArea.setText("");
    }//GEN-LAST:event_M_MateriasMouseClicked

    private void M_MaestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_MaestrosMouseClicked
        c.goMaestros();
        this.TxtArea.setText("");
    }//GEN-LAST:event_M_MaestrosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList<String> Lista;
    private javax.swing.JMenu M_Alumnos;
    private javax.swing.JMenu M_Maestros;
    private javax.swing.JMenu M_Materias;
    public javax.swing.JTextArea TxtArea;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
