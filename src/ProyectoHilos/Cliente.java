package ProyectoHilos;

public class Cliente implements Runnable {

    private String nombre = " ";
    private int compras[]=new int[0];
    private int numeroArticulos=0;
    private int tiempo = 0;
    private int nProductos=0;

    public Cliente(String nombre) {
        setNombre(nombre);
        setNumeroArticulos();
        compras = new int[getNumeroArticulos()];

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int nArandom() {
        return (int) (Math.random() * 10 + 1);
    }

    public void setNumeroArticulos() {
        this.numeroArticulos = nArandom();
    }


    public int getNumeroArticulos() {
        return numeroArticulos;
    }

    @Override
    public void run() {

        for (int i = 0; i < compras.length; i++) {
            compras[i] = nArandom();
            tiempo+= compras[i];
        }

        System.out.println("Entro a la tienda el cliente: " + getNombre());

        for (int i = 0; i < compras.length; i++) {
            nProductos+=1;
            System.out.println(getNombre() + ", Producto "+ nProductos + ": " + compras[i]);
        }

        System.out.println("~ Nombre: " + getNombre() + "\n Numero de articulos:" + nProductos + "\n tiempo total de: " + tiempo + " segundos. ~");


    }
}
