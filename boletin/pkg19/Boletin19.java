/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;
import javax.swing.JOptionPane;
import libreriaprueba.Operaciones;
/**
 *
 * @author Adri
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mailbox b1 = new Mailbox();
        int  num1 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n 1. Crear correo nuevo\n 2. Numero de correos\n 3. Correos por leer\n 4. Mostrar correo\n 5. Elimina correo\n 6. Salir"));
        Operaciones.validarInt(num1);
        while (num1>0 && num1<6){
        switch (num1){
            case 1: 
                Mail m1 = new Mail();
                String contenido = JOptionPane.showInputDialog("Email: ");
                m1.setContenido(contenido);
                b1.add(m1);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Numero de correos: " + b1.mailboxSize());
            break;
            case 3:
                if (b1.toRead()){
                    JOptionPane.showMessageDialog(null, "Si: " + b1.showFirstNonRead());
                } else {
                    JOptionPane.showMessageDialog(null, "Todos los correos han sido leidos");
                }
            break;
            case 4:
                int num =Integer.parseInt(JOptionPane.showInputDialog("Elige el numero de correo que quieres visualizar: "));
                JOptionPane.showMessageDialog(null, b1.show(num - 1));
            break;
            case 5:
                int num3 =Integer.parseInt(JOptionPane.showInputDialog("Elige el numero de correo que quieres eliminar: "));
                b1.deleteMail(num3 - 1);
            break;
                
        }
        num1 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n 1. Crear correo nuevo\n 2. Numero de correos\n 3. Correos por leer\n 4. Mostrar correo\n 5. Elimina correo\n 6. Salir"));
        }
        
        
        
        
        

    }
    
}
