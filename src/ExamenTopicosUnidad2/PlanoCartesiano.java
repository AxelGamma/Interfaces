package ExamenTopicosUnidad2;

import javax.swing.*;

public class PlanoCartesiano extends JFrame {

    public PlanoCartesiano(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new Componente());
    }


}
