package fecha;
public class FechaMain {

    public static void main(String[] args) {

        Fecha fecha = new Fecha();
        fecha.modificar(21,12,2021);
        System.out.println("FechaMain 1:");
        fecha.ver_Fecha();
        Fecha fecha2 = new Fecha(15, 03, 2032);
        System.out.println("FechaMain 2:");
        fecha2.ver_Fecha();
        fecha.diferenciaFecha(fecha2);
    }


}