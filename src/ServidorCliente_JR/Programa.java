package ServidorCliente_JR;

import ClienteServidorDB.Cliente;
import ClienteServidorDB.Servidor;
import java.awt.*;

public class Programa{

    public static void main(String[]args){

        Frame frame= new Frame();

        frame.setSize(750, 300);
        frame.
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setBackground(new Color(99, 199, 74));
        frame.add(new Servidor());
        frame.add(new Cliente());

    }
}
