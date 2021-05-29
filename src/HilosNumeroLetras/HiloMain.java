package HilosNumeroLetras;

public class HiloMain {
    public static void main(String[]args){
        NumerosLetras h1= new NumerosLetras(1);
        NumerosLetras h2= new NumerosLetras(2);

        Thread th1= new Thread(h1);
        Thread th2= new Thread(h2);

        th1.start();
        th2.start();

    }
}


