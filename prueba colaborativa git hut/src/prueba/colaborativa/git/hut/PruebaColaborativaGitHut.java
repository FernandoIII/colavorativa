/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.colaborativa.git.hut;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PruebaColaborativaGitHut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int m;
        n=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer numero: "));
        m=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo numero: "));
        colaborativa objeto=new colaborativa(n,m);
        objeto.mult();
        
        
        
                
                
    }
    
}
