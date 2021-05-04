package Menu;

import javax.swing.*;

public class MenuApp extends JFrame {
    public static void main(String[]args){
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch (Exception e){
            System.out.println("No se pudo poner el aspecto deseado"+ e);
        }
        new Menu().setVisible(true);
    }
}
