package ListaNumeros;

public class MiApli extends Lista{

    public MiApli ( int tam ) {
        super ( tam ); //Define un tamaño estatico para el arreglo
    }

    public int recorre ( ) {  //método para hacer un recorrido para localizar algún dato dentro de la estructura
        int q = L;
        for ( int i = 0; i < 2; i++ )
            q = lista[q].getNext ( );
        return q;
    }

    public void muestra ( ) { //método que muestra los elementos que están almacenados dentro de la misma
        int q = L;
        while ( q != -1 ) {
            System.out.println ( lista[q].getInfo ( ) );
            q = lista[q].getNext ( );
        }
    }

    public int getL(){
        return L;
    }


    public int suma(int q, int s){ //metodo recursivo para sumar
        if(q==-1)
            return s;
        else
            s+=(Integer)lista[q].getInfo(); //cast de object a int
        return suma(lista[q].getNext(),s );
    }

}
