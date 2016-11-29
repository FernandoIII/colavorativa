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
public class colaborativa {
    int n;
    int m;

    public colaborativa(int n, int m) {
        this.n = n;
        this.m = m;
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    public void mult(){
        int resultado=0;
        
        
        resultado=this.n*this.m;
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
    
}
