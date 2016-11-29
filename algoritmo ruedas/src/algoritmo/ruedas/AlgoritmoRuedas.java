/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ruedas;

import javax.swing.JOptionPane;
import modelo.modelo_ruedas;

/**
 *
 * @author usuario
 */
public class AlgoritmoRuedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tipo,marca;
        double grosor,diametro;
        
        tipo=JOptionPane.showInputDialog("Ingrese el tipo de llanta");
        marca=JOptionPane.showInputDialog("Ingrese la marca de la llanta");
        grosor=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el grosor de la llanta"));
        diametro=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el diametro de la llanta"));
        
        
       modelo_ruedas objeto1= new modelo_ruedas(tipo,marca,grosor,diametro);
       objeto1.verificar_diam();
       
        
        
        
    }
    
}
