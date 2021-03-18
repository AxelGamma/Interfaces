package Conversor;
public class AplicacionConversor extends javax.swing.JFrame{
    public static void main(String[]args){
        //Establecer el estilo "limbos" para la interfaz grafica
        //Si nimbus no esta disponible
        //quedarse por el estilo por defecto
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
        new Conversor().setVisible(true);
    }
}
