package ListaNumeros;

public class ListaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiApli listae = new MiApli ( 50 );
// int j;

        for ( int i = 1; i <= 50; i++ ) {
// j = (int)( Math.random ( ) * 100 );

// System.out.println ( "insertaInicio: " + i );
            listae.insInicio ( i );
        }
        int q=listae.getL();

        System.out.println("Suma de los valores en la lista: "+listae.suma(q,0));
        listae.muestra ( );

    }
}