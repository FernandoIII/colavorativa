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
public class modelo_grados {
        int grados;

    public modelo_grados(int grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }
    public void verificar(){
        double resultado = 0;
        double c,f;
        
//        int sw=0;
       
        switch (grados){
            case 1:
//                Esta es la formula para transformar de grados centrigrados a farenheit
                c=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los valores a convertira Fahrenheit"));
                resultado=(c*9/5)+32;
                //
                break;
            case 2:
//                esta es la formula para transormar de farenheit a centigrados
                f=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados que desea transformar a centigrados: "));
                resultado=(f-32)*5/9;
                break;
                
                       
             
        }
        JOptionPane.showMessageDialog(null, "el resultado es "+resultado);
    }
    
}
