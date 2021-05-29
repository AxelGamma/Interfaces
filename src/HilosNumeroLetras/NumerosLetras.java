package HilosNumeroLetras;

public class NumerosLetras implements Runnable{
    private int Tipo;

    public NumerosLetras(int numero) {
        this.Tipo = numero;
    }



    @Override
    public void run() {

            switch (Tipo){
                case 1:
                    for(int i=0;i<=30;i++){
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (char c= 'a'; c<'z';c++){
                        System.out.println(c);
                    }

                    break;



            }
    }
}
