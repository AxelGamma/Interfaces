package Conversor;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.awt.*;

public class JTextFieldDouble extends JTextField {
    //Ahora cada vez que se cree una caja de texto de la clase JTextFieldDouble,
    //createDefultModel creara un modelos asociado con dicho objeto y sera de la clase PLainDocumentDouble
    protected Document createDefaultModel(){
        return new PlainDocumentDouble();

    }
    protected class PlainDocumentDouble extends PlainDocument{
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException
        {
                //fuente: almacena el contenido de la caja de texto
                char[] fuente= str.toCharArray();
                //resultado: almacena el contenido de la caja de texto validado
                char[] resultado= new char[fuente.length];
                int j=0;

                //Almacenar el resultado los caracteres validos de fuente
                for (int i=0;i< fuente.length;i++){
                    if(fuente[i] >='0' && fuente[i]<='9' || fuente[i]=='.'||fuente[i]=='-' || fuente[i]=='+'){
                        resultado[j++]= fuente[i];
                    }
                    else {
                        Toolkit.getDefaultToolkit().beep();
                    }
                }
                super.insertString(offs,new String(resultado,0,j),a);
        }
    }
}
