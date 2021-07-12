package Cliente_Servidor;


import java.awt.Color;
import java.awt.TextArea;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cliente extends JFrame {

    private JLabel dat;
    public TextArea dat1 = new TextArea();
    private final int PUERTO = 5000;
    private final String IP = "localhost";
    private DataInputStream entrada;
    private Socket so;
    private String[] alum;

    public Cliente() {
        super("Cliente");
        setSize(455, 235);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        dat = new JLabel("Los datos solicitados son:");
        dat.setBounds(20, 70, 150, 50);

        dat1.setBounds(180, 20, 240, 150);
        dat1.setEditable(false);
            crearConexion();

        add(dat);
        add(dat1);
        setVisible(true);
    }

    public void crearConexion() {
        try {

            so = new Socket(IP, PUERTO);

            try {
                entrada = new DataInputStream(so.getInputStream());


                String aviso = entrada.readUTF();

                String[] alumnos = aviso.split("-");
                alum = alumnos;

                for (int i = 0; i < alumnos.length; i++) {

                    dat1.append(alumnos[i] + "\n");
                }


            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
            so.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }


    public static void main(String[] args) {
            new Cliente();
    }
}


// Conexión entre el socket del servidor y el socket del cliente.
