package ListaNumeros;

public class Nodo {
    protected Object info;
    protected int next;

    public Nodo ( ) {
        next = -1;
        info = null;
    }
    public Nodo ( Object x, int dir ) {
        info = x;
        next = dir;
    }
    public void setNext ( int dir ) {
        next = dir;
    }
    public void setInfo ( Object x ) {
        info = x;
    }
    public int getNext ( ) {
        return next;
    }
    public Object getInfo ( ) {
        return info;
    }
    public String toString ( ) {
        return "" + info;
    }

}
