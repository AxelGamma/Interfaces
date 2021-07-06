package fecha;

import static java.lang.Math.abs;

public class Fecha {

    public int dia, mes, año;
    public Fecha(int dia, int mes, int año) {//constructor
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    Fecha() {
    }
    public int obtener_Dia(){ //Obtiene valor del dia
        return dia;
    }
    public int obtener_Mes(){ //Obtiene valor del mes
        return mes;
    }
    public int obtener_Año(){ //obtiene valor del año
        return año;
    }

    public void ver_Fecha(){ // Visualizar la fecha
        System.out.println(this.dia +" "+  this.mes +" "+  this.año);
    }
    public void modificar(int dia, int mes, int año){ //Acepta el día, mes y año de una fecha para modificarla (set).
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    public void diferenciaFecha(Fecha f2){
        Fecha diferencia= new Fecha();
        int dAb, mAb, aAb;
        dAb= abs(this.dia-f2.dia);
        mAb=abs(this.mes-f2.mes);
        aAb=abs(this.año-f2.año);
        System.out.println("La diferencia es: "+dAb+" dias, "+mAb+" meses y "+aAb+" años" );
    }
}
