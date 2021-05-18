package ClienteSuper;

public class Cliente extends Thread{
    private int nArticulos;
    private int Articulos[];

    //Constructor
    public Cliente(){}
    public Cliente(String nombre){
        super(nombre);
    }

    //Crear el size del array
    public void generarNumeroArt(){
        nArticulos= (int) (Math.random()*10+1);
        Articulos= new int[nArticulos];
    }

    public void comprar(){
        for (int i=0;i<nArticulos;i++){
            Articulos[i]=(int)(Math.random()*10+1);
        }
    }

    public String Lista(){
        String s= "Articulos comprados por "+getName()+":";
        for (int i=0;i<nArticulos;i++){
            s=s+String.valueOf(Articulos[i]+" ");
        }
        return s;

    }

    public void run(){
        System.out.println("El cliente "+getName()+" a empezado a comprar");
        //Invocar a los metodos que estan fuera del metodo run
        generarNumeroArt();
        comprar();
        System.out.println(Lista());
        System.out.println("El cliente a terminado");

    }
}
