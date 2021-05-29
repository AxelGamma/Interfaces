package ProyectoHilos;

public class Cliente implements Runnable {
    private String nombre;
    private int compras[];
    private int numeroArticulos;
    private int tiempo;

    public Cliente(String nombre){
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int nArandom() {
        return numeroArticulos = (int) (Math.random() * 10 + 1);
    }

    public void setNumeroArticulos() {
        this.numeroArticulos = nArandom();
    }

    public int getNumeroArticulos() {
        return numeroArticulos;
    }

    @Override
    public void run() {
        setNumeroArticulos();
        compras = new int[getNumeroArticulos()];
        for (int i = 0; i < compras.length; i++) {
            compras[i] = nArandom();
            tiempo += compras[i];
        }

        System.out.println("El cliente: " + getNombre());

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Producto " + i + ": " + compras[i]);
        }
        System.out.println("Tiempo total: " + tiempo);

        System.out.println("Nombre: "+ nombre);
        System.out.println("Numero de articulo: "+ getNumeroArticulos());
        System.out.println("Tiempo: "+tiempo);


    }
}
