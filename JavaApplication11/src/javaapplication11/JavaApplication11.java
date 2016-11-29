/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import javax.swing.JOptionPane;
import serie.numero;

/**
 *
 * @author usuario
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        String numero;
        numero=JOptionPane.showInputDialog("Ingrese el limite");
        n=Integer.parseInt(numero);
        numero objeto= new numero(n);
        objeto.n_serie();
        
    }
    
}
