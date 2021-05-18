package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Menu extends JFrame {
    private JMenuItem jmItemAbrir,jmItemMismoNombre,jmItemOtroNombre,jmItemSalir;
    private JMenuBar jmbarBarraDeMenu;
    private JMenu jmnuArchivo,jmnuGuardar,jm;
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

        jmItemMismoNombre= new JMenuItem();
        jmItemMismoNombre.setText("Mismo Nombre");
        jmnuGuardar.add(jmItemMismoNombre);

        jmItemOtroNombre= new JMenuItem();
        jmItemOtroNombre.setText("Otro Nombre");
        jmnuGuardar.add(jmItemOtroNombre);

        jmItemSalir= new JMenuItem();
        jmItemSalir.setText("Salir");
        jmnuArchivo.add(jmItemSalir);


        setJMenuBar(jmbarBarraDeMenu);

        //Manejador de eventos asociados con al orden salir

        jmItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jmItemSalirActionPerformed(e);
            }
        });



    }
    //Metodo que recibe la accion
    public void jmItemSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    //Pagina 109
}
