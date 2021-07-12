
package clienteescuela;
import java.io.*;
import java.net.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sergioxd
 */
public class Controlador {
    GUI_Cliente c;
    private String[] alum;
    private String[] mater;
    private String [] maest;
    public boolean band=false,band2=false,band3=false;
    
    public Controlador(GUI_Cliente cliente) {
        c=cliente;
    }
    
    public void goMaterias()
    {
        try
        {
            Socket s=new Socket("192.168.1.2",8080);
            DataInputStream dataIn=new DataInputStream(s.getInputStream());
            DataOutputStream dataOut=new DataOutputStream(s.getOutputStream());
            
            dataOut.writeUTF("Materias");
            String aviso=dataIn.readUTF();
            String[] materias=aviso.split("-");
            mater=materias;
            band2=true;
            DefaultListModel modelo=new DefaultListModel();
            for (int j = 0; j <materias.length; j++) {
                modelo.addElement(materias[j]);
                
            }
            c.Lista.setModel(modelo);
            dataIn.close();
            dataOut.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }
    public void goMaestros()
    {
        try
        {
            Socket s=new Socket("192.168.1.2",8080);
            DataInputStream dataIn=new DataInputStream(s.getInputStream());
            DataOutputStream dataOut=new DataOutputStream(s.getOutputStream());
            
            dataOut.writeUTF("Maestros");
            String aviso=dataIn.readUTF();
            String[] maestros=aviso.split("-");
            maest=maestros;
            band=true;
            DefaultListModel modelo=new DefaultListModel();
            for (int j = 0; j <maestros.length; j++) {
                modelo.addElement(maestros[j]);
                
            }
            c.Lista.setModel(modelo);
            dataIn.close();
            dataOut.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }
    
    public void goAlumnos()
    {
       try
        {
            Socket s=new Socket("192.168.1.2",8080);
            DataInputStream dataIn=new DataInputStream(s.getInputStream());
            DataOutputStream dataOut=new DataOutputStream(s.getOutputStream());
            
            
            dataOut.writeUTF("Alumnos");
            String aviso=dataIn.readUTF();
            String[] alumnos=aviso.split("-");
            alum=alumnos;
            band3=true;
            DefaultListModel modelo=new DefaultListModel();
            for (int j = 0; j <alumnos.length; j++) {
                modelo.addElement(alumnos[j]);
                
            }
            c.Lista.setModel(modelo);
            dataIn.close();
            dataOut.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        } 
    }
    public void getImpartida(int index)
    {
        c.TxtArea.setLineWrap(true);
        if(band && band2 && band3 && index !=-1)
        {
            c.TxtArea.setText("Materia que imparte: "+"\n"+mater[index]);
        }
       else
        {
            band=false;
        }
    }
}
