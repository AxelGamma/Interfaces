package ServidorCliente_JR;
/* @Julia Ramos Lopez
 * No.Control:19071789*/

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente extends JPanel implements Runnable {

    private final int PUERTO = 5000;

    private JLabel jlPidiendoDatos;
    public TextArea respuestaConsulta = new TextArea();

    public Cliente() {
        setBackground(new Color(204, 112, 250));
        component();

        Thread thread = new Thread(this);
        thread.start();
    }

    public void component() {
        jlPidiendoDatos = new JLabel("Los datos solicitados son:");
        jlPidiendoDatos.setBounds(20, 70, 0, 70);

        respuestaConsulta.setBounds(0, 60, 100, 150);
        respuestaConsulta.setEditable(false);
        add(jlPidiendoDatos);
        add(respuestaConsulta);
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(PUERTO);
            while (true) {
                Socket miServidor = serverSocket.accept();
                DataInputStream entradaF = new DataInputStream(miServidor.getInputStream());
                String fichero = entradaF.readUTF();

                String[] datosArchivo = fichero.split("-");

                for (int i = 0; i < datosArchivo.length; i++) {

                    respuestaConsulta.append(datosArchivo[i] + "\n");

                }
                miServidor.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
