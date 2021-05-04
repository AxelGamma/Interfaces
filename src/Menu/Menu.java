package Menu;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Menu extends JFrame {
    private JMenuItem jmItemAbrir;
    private JMenuBar jmbarBarraDeMenu;
    private JMenu jmnuArchivo,jmnuGuardar;
    private JSeparator separador1;

    public Menu(){
        super("Menu");
        setLayout(null);
        setResizable(false);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponent();

    }

    public void initComponent(){
        jmbarBarraDeMenu= new JMenuBar();
        jmnuArchivo= new JMenu();
        jmnuArchivo.setMnemonic('A');
        jmnuArchivo.setText("Archivo");
        jmbarBarraDeMenu.add(jmnuArchivo);

        jmItemAbrir= new JMenuItem();
        jmItemAbrir.setText("Abrir...");
        jmnuArchivo.add(jmItemAbrir);

        jmnuGuardar= new JMenu();
        jmnuGuardar.setText("Guardar");
        jmnuArchivo.add(jmnuGuardar);

        separador1= new JSeparator();
        jmnuArchivo.add(separador1);


        setJMenuBar(jmbarBarraDeMenu);
    }
}
