package Modelo_De_Transporte;

import javax.swing.*;
import java.awt.*;

public class Complementos extends JPanel {

    private int array[];

    private JTextField A0,A1,A2,A3,AOferta;
    private JTextField B0,B1,B2,B3,BOferta;
    private JTextField C0,C1,C2,C3,COferta;
    private JTextField D0,D1,D2,D3,DOferta;
    private JLabel jlE,jlF,jlG,jlH,jlOferta;
    private JLabel jlA,jlB,jlC,jlD,jlDemanda;
    private JTextField valorA0, valorA1,valorA2,valorA3;
    private JTextField valorB0, valorB1,valorB2,valorB3;
    private JTextField valorC0, valorC1,valorC2,valorC3;

    private int xcolumnas=80;
    private int yfilas=70;

    public Complementos() {
        setLayout(null);
        setBackground(new Color(78, 78, 78));
        columnaEncabezado();
        filaEncabezado();
        filaOne();
        filaTwo();
        filaThree();
        filaFour();
        filaDemanda();
    }
    public void filaEncabezado(){
        int filaxEncabezado=this.xcolumnas+30;
        jlE= new JLabel("E");
        jlE.setForeground(Color.WHITE);
        jlE.setBounds(filaxEncabezado,30,20,20);
        add(jlE);

        jlF= new JLabel("F");
        jlF.setForeground(Color.WHITE);
        jlF.setBounds(filaxEncabezado+=70,30,20,20);
        add(jlF);

        jlG= new JLabel("G");
        jlG.setForeground(Color.WHITE);
        jlG.setBounds(filaxEncabezado+=70,30,20,20);
        add(jlG);

        jlH= new JLabel("H");
        jlH.setForeground(Color.WHITE);
        jlH.setBounds(filaxEncabezado+=70,30,20,20);
        add(jlH);

        jlOferta= new JLabel("OFERTA");
        jlOferta.setForeground(Color.WHITE);
        jlOferta.setBounds(filaxEncabezado+=40,30,60,20);
        add(jlOferta);

    }

    public void columnaEncabezado(){
        int columanyEncabezado=this.yfilas+10;

        jlA= new JLabel("A");
        jlA.setForeground(Color.WHITE);
        jlA.setBounds(10,columanyEncabezado+10,60,20);
        add(jlA);

        jlB= new JLabel("B");
        jlB.setForeground(Color.WHITE);
        jlB.setBounds(10,columanyEncabezado+=70,60,20);
        add(jlB);

        jlC= new JLabel("C");
        jlC.setForeground(Color.WHITE);
        jlC.setBounds(10,columanyEncabezado+=60,60,20);
        add(jlC);

        jlD= new JLabel("D");
        jlD.setForeground(Color.WHITE);
        jlD.setBounds(10,columanyEncabezado+=60,60,20);
        add(jlD);

        jlDemanda= new JLabel("Demanda");
        jlDemanda.setForeground(Color.WHITE);
        jlDemanda.setBounds(10,columanyEncabezado+=40,60,20);
        add(jlDemanda);

    }




    private void filaOne(){
        int xfilaOne=this.xcolumnas;
        int yfilaOne=this.yfilas+20;
        int yinfoOne=this.yfilas;
        int xinfoOne=this.xcolumnas;

        //Fila A, Columna 0
        valorA0= new JTextField();
        valorA0.setBounds(xinfoOne+=30,yinfoOne,20,20);
        add(valorA0);

        A0=new JTextField();
        A0.setBounds(xfilaOne,yfilaOne,50,20);
        add(A0);

        //Fila A, columna 1
        valorA1= new JTextField();
        valorA1.setBounds(xinfoOne+=70,yinfoOne,20,20);
        add(valorA1);

        A1=new JTextField();
        A1.setBounds(xfilaOne+=70,yfilaOne,50,20);
        add(A1);

        //Fila A, columna 2
        valorA2= new JTextField();
        valorA2.setBounds(xinfoOne+=70,yinfoOne,20,20);
        add(valorA2);

        A2=new JTextField();
        A2.setBounds(xfilaOne+=70,yfilaOne,50,20);
        add(A2);

        //Fila A, columna 3
        valorA3= new JTextField();
        valorA3.setBounds(xinfoOne+=70,yinfoOne,20,20);
        add(valorA3);

        A3=new JTextField();
        A3.setBounds(xfilaOne+=70,yfilaOne,50,20);
        add(A3);

        //Fila A, columna 3
        AOferta=new JTextField();
        AOferta.setBounds(xfilaOne+=70,yfilaOne,50,20);
        add(AOferta);
    }

    private void filaTwo(){
        int xfilaTw0=this.xcolumnas;
        int yfilaTwo=this.yfilas+80;
        int yinfoTwo=this.yfilas+60;
        int xinfoTwo=this.xcolumnas;

        //Fila B, Columna 0
        valorB0= new JTextField();
        valorB0.setBounds(xinfoTwo+=30,yinfoTwo,20,20);
        add(valorB0);

        B0=new JTextField();
        B0.setBounds(xfilaTw0,yfilaTwo,50,20);
        add(B0);

        //Fila B, columna 1
        valorB1= new JTextField();
        valorB1.setBounds(xinfoTwo+=70,yinfoTwo,20,20);
        add(valorB1);

        B1=new JTextField();
        B1.setBounds(xfilaTw0+=70,yfilaTwo,50,20);
        add(B1);

        //Fila B, columna 2
        valorB2= new JTextField();
        valorB2.setBounds(xinfoTwo+=70,yinfoTwo,20,20);
        add(valorB2);

        B2=new JTextField();
        B2.setBounds(xfilaTw0+=70,yfilaTwo,50,20);
        add(B2);

        //Fila B, columna 3
        valorB3= new JTextField();
        valorB3.setBounds(xinfoTwo+=70,yinfoTwo,20,20);
        add(valorB3);

        B3=new JTextField();
        B3.setBounds(xfilaTw0+=70,yfilaTwo,50,20);
        add(B3);

        //Fila B, columna 3
        BOferta=new JTextField();
        BOferta.setBounds(xfilaTw0+=70,yfilaTwo,50,20);
        add(BOferta);
    }

    private void filaThree(){
        int xfilaThree=this.xcolumnas;
        int yfilaThree=this.yfilas+140;
        int yinfoThree=this.yfilas+120;
        int xinfoThree=this.xcolumnas;

        //Fila C, Columna 0
        valorC0= new JTextField();
        valorC0.setBounds(xinfoThree+=30,yinfoThree,20,20);
        add(valorC0);

        C0=new JTextField();
        C0.setBounds(xfilaThree,yfilaThree,50,20);
        add(C0);

        //Fila C, columna 1
        valorC1= new JTextField();
        valorC1.setBounds(xinfoThree+=70,yinfoThree,20,20);
        add(valorC1);

        C1=new JTextField();
        C1.setBounds(xfilaThree+=70,yfilaThree,50,20);
        add(C1);

        //Fila C, columna 2
        valorC2= new JTextField();
        valorC2.setBounds(xinfoThree+=70,yinfoThree,20,20);
        add(valorC2);

        C2=new JTextField();
        C2.setBounds(xfilaThree+=70,yfilaThree,50,20);
        add(C2);

        //Fila C, columna 3
        valorC3= new JTextField();
        valorC3.setBounds(xinfoThree+=70,yinfoThree,20,20);
        add(valorC3);

        C3=new JTextField();
        C3.setBounds(xfilaThree+=70,yfilaThree,50,20);
        add(C3);

        //Fila C, columna 3
        COferta=new JTextField();
        COferta.setBounds(xfilaThree+=70,yfilaThree,50,20);
        add(COferta);
    }

    private void filaFour(){
        int xfilaFour=this.xcolumnas;
        int yfilaFour=this.yfilas+200;
        int yinfoFour=this.yfilas+180;
        int xinfoFour=this.xcolumnas;

        //Fila D, Columna 0
        valorC0= new JTextField();
        valorC0.setBounds(xinfoFour+=30,yinfoFour,20,20);
        add(valorC0);

        C0=new JTextField();
        C0.setBounds(xfilaFour,yfilaFour,50,20);
        add(C0);

        //Fila D, columna 1
        valorC1= new JTextField();
        valorC1.setBounds(xinfoFour+=70,yinfoFour,20,20);
        add(valorC1);

        C1=new JTextField();
        C1.setBounds(xfilaFour+=70,yfilaFour,50,20);
        add(C1);

        //Fila D, columna 2
        valorC2= new JTextField();
        valorC2.setBounds(xinfoFour+=70,yinfoFour,20,20);
        add(valorC2);

        C2=new JTextField();
        C2.setBounds(xfilaFour+=70,yfilaFour,50,20);
        add(C2);

        //Fila D, columna 3
        valorC3= new JTextField();
        valorC3.setBounds(xinfoFour+=70,yinfoFour,20,20);
        add(valorC3);

        C3=new JTextField();
        C3.setBounds(xfilaFour+=70,yfilaFour,50,20);
        add(C3);

        //Fila D, columna 3
        COferta=new JTextField();
        COferta.setBounds(xfilaFour+=70,yfilaFour,50,20);
        add(COferta);
    }

    private void filaDemanda(){
        int xfilaDemanda=this.xcolumnas;
        int yfilaDemanda=this.yfilas+240;

        //Fila Demanda, Columna 0
        D0=new JTextField();
        D0.setBounds(xfilaDemanda,yfilaDemanda,50,20);
        add(D0);
        //Fila Demanda, columna 1

        D1=new JTextField();
        D1.setBounds(xfilaDemanda+=70,yfilaDemanda,50,20);
        add(D1);

        //Fila Demanda, columna 2

        D2=new JTextField();
        D2.setBounds(xfilaDemanda+=70,yfilaDemanda,50,20);
        add(D2);

        //Fila Demanda, columna 3
        D3=new JTextField();
        D3.setBounds(xfilaDemanda+=70,yfilaDemanda,50,20);
        add(D3);

        //Fila Demanda, columna 4
        DOferta=new JTextField();
        DOferta.setBounds(xfilaDemanda+=70,yfilaDemanda,50,20);
        add(DOferta);
    }
    private void llenadoArray(){

    }

    private void comparacionFilas(){

    }


}
