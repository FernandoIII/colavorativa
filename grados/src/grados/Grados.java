/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grado;
        do{
            grado=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido; por favor escoja una de las siguientes opciones\n"+"1 grados Fahrenheit a centigrados\n2 grados centigrados a Fahrenheit"));
        }while(grado<=0 || grado>=3);
        modelo_grados objeto =new modelo_grados(grado);
        objeto.verificar();
        
        
    }
        
        
        
}
    

