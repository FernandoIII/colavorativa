/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class primo {
    public int n;

    public primo(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void n_primo(){
        int cont=0;
        int div=1;
        while (div<=this.n){
            while (div<=this.n){
            if (this.n%div==0){
                cont+=1;
            
            }
            div+=1;
            
                
                
        }
        if (cont<=2){
            JOptionPane.showMessageDialog(null,"El numero es primo");
        }
        else{
           JOptionPane.showMessageDialog(null, "no es primo");
        } 
    }
}
