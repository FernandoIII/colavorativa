/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.primo;

import javax.swing.JOptionPane;
import primo.primo;

/**
 *
 * @author usuario
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        String numero;
        
        numero=JOptionPane.showInputDialog("Ingrese un nuero");
        n=Integer.parseInt(numero);
        primo objeto=new primo(n);
        objeto.n_primo();
    }
    
}
