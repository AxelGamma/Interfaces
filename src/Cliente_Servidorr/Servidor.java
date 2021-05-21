package Cliente_Servidorr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends JFrame {

    private JButton alumno, carrera, materia;
    private final int PUERTO = 5000;
    private ServerSocket serverSocket;
    private DataOutputStream outAlumno, outCarrera, outMateria;
    private Socket socket;

    private File ficheroAlumnos = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Alumnos.txt");
    private File ficheroCarreras = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Carreras.txt");
    private File ficheroMaterias = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Materias.txt");

    public Servidor() {
        super("Servidor");
        setSize(520, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        this.getContentPane().setBackground(new Color(112, 16, 222));

        alumno = new JButton("Alumnos");
        alumno.setBounds(50, 50, 100, 50);

        carrera = new JButton("Carreras");
        carrera.setBounds(200, 50, 100, 50);

        materia = new JButton("Materias");
        materia.setBounds(350, 50, 100, 50);

        alumno.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                conecxionAlumno();
            }

        });

        carrera.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                conecxionCarrera();
            }

        });

        materia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                conecxionMateria();
            }

        });

        add(alumno);
        add(carrera);
        add(materia);


    }

    public void conecxionAlumno() {


        try {
            String s, nombre = "";
            serverSocket = new ServerSocket(PUERTO);
            System.out.println("Servidor Iniciado");

            while (true) {
                socket = serverSocket.accept();
                System.out.println("Cliente conectado");
                outAlumno = new DataOutputStream(socket.getOutputStream());
                BufferedReader archivo = new BufferedReader(new FileReader(ficheroAlumnos));

                while ((s = archivo.readLine()) != null) {
                    nombre += s + "\n";

                }
                outAlumno.writeUTF("Alumno:" + nombre);

                socket.close();
                serverSocket.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void conecxionCarrera() {


        try {
            String s, carrera = "";
            serverSocket = new ServerSocket(PUERTO);
            System.out.println("Servidor Iniciado");

            while (true) {
                socket = serverSocket.accept();
                System.out.println("Cliente conectado");
                outCarrera = new DataOutputStream(socket.getOutputStream());
                BufferedReader archivo = new BufferedReader(new FileReader(ficheroCarreras));

                while ((s = archivo.readLine()) != null) {
                    carrera += s + "\n";

                }
                outCarrera.writeUTF("Alumno:" + carrera);

                socket.close();
                serverSocket.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void conecxionMateria() {


        try {
            String s, Materia = "";
            serverSocket = new ServerSocket(PUERTO);
            System.out.println("Servidor Iniciado");

            while (true) {
                socket = serverSocket.accept();
                System.out.println("Cliente conectado");
                outMateria = new DataOutputStream(socket.getOutputStream());
                BufferedReader archivo = new BufferedReader(new FileReader(ficheroMaterias));

                while ((s = archivo.readLine()) != null) {
                    Materia += s + "\n";

                }
                outMateria.writeUTF("Alumno:" + Materia);
                socket.close();
                serverSocket.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static void main(String[] args) {
        new Servidor();
    }
}
