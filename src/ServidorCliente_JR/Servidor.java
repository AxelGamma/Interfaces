package ServidorCliente_JR;

/* @Julia Ramos Lopez
 * No.Control:19071789*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class Servidor extends JPanel {

    private final int PUERTO = 5000;
    private Socket socket;
    private JTextField jtBusqueda;
    private File archivoAlumnos = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Alumnos.txt");
    private File archivoProfesores = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Profesores.txt");
    private File archivoMaterias = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Materias.txt");
    private JButton jtbBusqueda;

    public Servidor() {

        Objetos();
        setLayout(new FlowLayout());

    }

    public void Objetos() {

        jtBusqueda = new JTextField(12);
        setBackground(new Color(204, 112, 250));
        add(jtBusqueda);

        jtbBusqueda = new JButton("Busqueda");
        add(jtbBusqueda);

        jtbBusqueda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String leer = jtBusqueda.getText();

                switch (leer) {
                    case "Alumnos":
                        alumno();
                        break;
                    case "Profesores":
                        profesor();
                        break;
                    case "Materias":
                        materia();
                        break;
                }
            }
        });

    }

    private void alumno() {
        try {
            String s, nombre = "";
            socket = new Socket("localhost", PUERTO);

            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            BufferedReader archivo = new BufferedReader(new FileReader(archivoAlumnos));

            while ((s = archivo.readLine()) != null) {
                nombre += s + "\n";
            }
            salida.writeUTF("Alumno: " + nombre);

            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private void profesor() {
        try {
            String s, nombre = "";
            socket = new Socket("localhost", PUERTO);

            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            BufferedReader archivo = new BufferedReader(new FileReader(archivoProfesores));

            while ((s = archivo.readLine()) != null) {
                nombre += s + "\n";
            }
            salida.writeUTF("Profesor: " + nombre);

            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private void materia() {
        try {
            String s, nombre = "";
            socket = new Socket("localhost", PUERTO);

            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            BufferedReader archivo = new BufferedReader(new FileReader(archivoMaterias));

            while ((s = archivo.readLine()) != null) {
                nombre += s + "\n";
            }
            salida.writeUTF("Materia: " + nombre);

            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
