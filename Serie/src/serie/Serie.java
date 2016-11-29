
package serie;

import javax.swing.JOptionPane;
import nuevo.generar;


public class Serie {

    
    public static void main(String[] args) {
        int numero;
        String a;
        
        a=JOptionPane.showInputDialog("Ingrese un numero");
        numero=Integer.parseInt(a);
        generar objeto=new generar(numero);
        objeto.primos();
    }
    
}
