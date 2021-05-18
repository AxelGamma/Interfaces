package ClienteSuper;

public class AplicacionCliente {
    public static void main(String []args){
        Cliente h1= new Cliente("Perejiloo");
        Cliente h2= new Cliente("David");
        Cliente h3= new Cliente("El bicho");

        h1.start();
        h2.start();
        h3.start();

    }
}
