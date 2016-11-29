/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class modelo_ruedas {
    // primero declaro mis atributos
    public String tipo;
    public String marca;
    public double grosor;
    public double diametro;
    // agrego el constructor click derecho insertar codigo y constructor

    public modelo_ruedas(String tipo, String marca, double grosor, double diametro) {
        this.tipo = tipo;
        this.marca = marca;
        this.grosor = grosor;
        this.diametro = diametro;
    }
    // agrego los set y get click derecho insertar codigo y escojo los settes y getters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
    /// defino el metodo con public void no retorna nada como salida
    public void verificar_diam(){
    
        if (this.diametro>1.4){
            JOptionPane.showMessageDialog(null," La rueda es para vehiculo pequeño :)");
        }
        else {
            if (this.diametro<=1.4 && this.diametro>0.8){
                
                JOptionPane.showMessageDialog(null, "La rueda es para un vehiculo mediano :)");
            } else{
                JOptionPane.showMessageDialog(null,"La rueda es para un vehiculo pequeño");
            }
        }
        if ((this.diametro>1.4 && this.grosor<0.4)||(this.diametro<=1.4 && this.grosor>0.8 && this.grosor<0.25)){
            JOptionPane.showMessageDialog(null,"El diametro de la rueda es menos al recomendado");
        
        }
    }
    
    
}

