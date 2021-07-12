package ListaNumeros;

public class Lista {
    protected int L;
    protected int avail;
    protected Nodo [ ] lista;

    public Lista ( int tam ) {
        lista = new Nodo [tam]; // Se crea el arreglo
        L = -1;
        avail = 0;
        for (int i = 0; i < tam -1; i++) {
            lista[i] = new Nodo ( ); // Se crea el nodo dentro del arreglo
            lista[i].next = i + 1; // Se actualiza el campo next
        }
        lista[tam - 1] = new Nodo ( ); // Se crea el último nodo dentro del arreglo
        lista[tam - 1].next = -1; // Se actualiza el campo next apuntando a tierra
    }
    public int getNode ( ) {
        int aux = avail;
        if ( avail == -1 )
            System.out.println ( "Error de overflow" );
        else
            avail = lista[avail].getNext ( );
        return aux;
    }
    public void freeNode ( int dir ) {
        lista[dir].setNext ( avail );
        avail = dir;
    }
    public boolean isEmpty ( ) {
        return L == -1;
    }
    public void insInicio ( Object x ) {
        int dir = getNode ( );
        if ( dir != -1 ) {
            lista[dir].setInfo ( x );
            lista[dir].setNext ( L );
            L = dir;
        }
    }
    public void insAfter ( int p, Object x ) {
        if ( p == -1 )
            System.out.println ( "no existe el nodo" );
        else {
            int dir = getNode ( );
            if ( dir != -1 ) {
                lista[dir].setInfo ( x );
                lista[dir].setNext ( lista[p].getNext ( ) );
            }
            lista[p].setNext ( dir );
        }
    }
    public void insFinal ( Object x ) {
        if ( isEmpty ( ) )
            insInicio ( x );
        else {
            int q = L;
            while ( lista[q].getNext ( ) != -1 )
                q = lista[q].getNext ( );
            int dir = getNode ( );
            lista[dir].setInfo ( x );
            lista[dir].setNext ( -1 );
            lista[q].setNext ( dir );
        }
    }
    public Object delInicio ( ) {
        if ( isEmpty ( ) )
            return null;
        int dir = L;
        L = lista[dir].getNext ( );
        return lista[dir].getInfo ( );
    }
    public Object delAfter ( int p ) {
        if ( p != -1 && lista[p].getNext ( ) != -1 ) {
            Object x = lista[lista[p].getNext ( )].getInfo ( );
            lista[p].setNext ( lista[lista[p].getNext ( )].getNext ( ) );
            return x;
        }
        return null;
    }
    public Object delFinal ( ) {
        if ( isEmpty ( ) )
            return null;
        if ( lista[L].getNext ( ) == -1 )
            return delInicio ( );
        int q = L;
        while ( lista[lista[q].getNext ( )].next != -1 )
            q = lista[q].getNext ( );
        Object x = lista[lista[q].getNext ( )].getInfo ( );
        lista[q].setNext ( lista[lista[q].getNext ( )].getNext ( ) );
        return x;
    }
}
