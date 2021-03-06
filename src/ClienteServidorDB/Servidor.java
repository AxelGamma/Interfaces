package ClienteServidorDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class Servidor extends JPanel{

    private JButton alumno,profesor,materia,Salir;
    private final int PUERTO =5000;
    private Socket socket;

    private File ficheroAlumnos = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Alumnos.txt");
    private File ficheroProfesor = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Profesores.txt");
    private File ficheroMateria = new File("D:\\Users\\Axel\\Vainas Mias\\Archivos de texto\\Materias.txt");

    public Servidor(){
        setSize(400, 400);
        setBackground(new Color(99, 199, 74));
        componentes();

    }

    public void componentes(){

        alumno= new JButton("Alumno");
        alumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alumno();
            }
        });

        profesor= new JButton("Profesor");
        profesor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                profesor();
            }
        });

        materia= new JButton("Materia");
        materia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                materia();
            }
        });

        Salir= new JButton("Salir");
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Salir();
            }
        });


        add(alumno);
        add(profesor);
        add(materia);
        add(Salir);


    }

    private void alumno(){
        try {
            String s, nombre="";
            socket= new Socket("localhost",PUERTO);

            DataOutputStream salida= new DataOutputStream(socket.getOutputStream());
            BufferedReader archivo = new BufferedReader(new FileReader(ficheroAlumnos));

            while ((s = archivo.readLine()) != null) {
                nombre += s + "\n";
            }
            salida.writeUTF("Alumno: "+nombre);

            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private void profesor(){
        try {
            String s, nombre = "";
            socket= new Socket("localhost",PUERTO);

            DataOutputStream salida= new DataOutputStream(socket.getOutputStream());
            BufferedReader archivo = new BufferedReader(new FileReader(ficheroProfesor));

            while ((s = archivo.readLine()) != null) {
                nombre += s + "\n";
            }
            salida.writeUTF("Profesor: "+nombre);

            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private void materia(){
        try {
            String s, nombre = "";
            socket= new Socket("localhost",PUERTO);

            DataOutputStream salida= new DataOutputStream(socket.getOutputStream());
            BufferedReader archivo = new BufferedReader(new FileReader(ficheroMateria));

            while ((s = archivo.readLine()) != null) {
                nombre += s + "\n";
            }
            salida.writeUTF("Materia: "+nombre);

            salida.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void Salir(){
        System.exit(0);
    }



}
