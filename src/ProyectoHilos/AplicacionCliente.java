package ProyectoHilos;

public class AplicacionCliente {
    public static void main(String[] args) throws InterruptedException {

        Cliente hilo1= new Cliente("Pedro");
        Cliente hilo2= new Cliente("Juan");
        Cliente hilo3= new Cliente("Axel");
        Thread h1= new Thread(hilo1);
        Thread h2= new Thread(hilo2);
        Thread h3= new Thread(hilo3);
        h1.start();
        h2.start();
        h3.start();



    }

}
