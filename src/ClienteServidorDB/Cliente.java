package ClienteServidorDB;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente extends JPanel implements Runnable{

    private final int PUERTO = 5000;

    private JLabel datosSolici;
    public TextArea textoConsola = new TextArea();

    public Cliente() {

        setSize(400, 400);
        setBackground(new Color(99, 199, 74));
        component();
        Thread mihilo= new Thread(this);
        mihilo.start();
    }

    public void component() {
        datosSolici = new JLabel("Los datos solicitados son:");

        textoConsola.setEditable(false);
        add(datosSolici);
        add(textoConsola);
    }

    @Override
    public void run() {
        try {
           ServerSocket serverSocket = new ServerSocket(PUERTO);
            while (true) {
                Socket miServidor = serverSocket.accept();
                DataInputStream entradaF = new DataInputStream(miServidor.getInputStream());

                String fichero = entradaF.readUTF();

                String[] alumnos = fichero.split("-");

                for (int i = 0; i < alumnos.length; i++) {

                    textoConsola.append(alumnos[i] + "\n");

                }
                miServidor.close();

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
