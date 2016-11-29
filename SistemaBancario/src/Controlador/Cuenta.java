/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUC
 */
public class Cuenta extends Clientes{
 private  double saldo;
     private String tipo,fecha_transaccion;
     private double cantidad;
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(String fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
     public static int Transaccion(double saldo,String tipo,double cantidad){
         if(tipo.equals("Retiro")){
          
           saldo=saldo-cantidad;
           JOptionPane.showMessageDialog(null, "SU SALDO ACTUAL ES : " + saldo);
       }
       if(tipo.equals("Deposito")){
           
           saldo=saldo+cantidad;
           JOptionPane.showMessageDialog(null, "SU SALDO ACTUAL ES : " + saldo);
       }
//       if(tipo!="Deposito" || tipo!="Retiro"){
//           JOptionPane.showMessageDialog(null, "LA OPCION INGRESADA NO ES CORRECTA : ");
//       }
       return (int) saldo;
     }
     
}
