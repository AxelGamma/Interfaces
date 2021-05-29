package ProyectoHilos;

public class AplicacionCliente {
    public static void main(String[] args) throws InterruptedException {

        Cliente hilo1= new Cliente("Pedro");
        Cliente hilo2= new Cliente("Juan");
        Thread h1= new Thread(hilo1);
        Thread h2= new Thread(hilo2);
        h1.start();
        h2.start();



    }

}
