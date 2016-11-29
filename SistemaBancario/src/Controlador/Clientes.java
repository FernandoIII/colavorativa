/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUC
 */
public class Clientes extends Persona{
    
    private int numCliente;
    private int numCuenta;
    private String nacimiento;
    private String registro;
    public Clientes() {
    }
    
    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
   
    
      public Clientes(int numCliente, int numCuenta, int cedula, int telefono, int celular, String nombre, String apellido, String direccion, String estadoC) {
        super(cedula, telefono, celular, nombre, apellido, direccion, estadoC);
        this.numCliente = numCliente;
        this.numCuenta = numCuenta;
    }

    
     

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * @return the numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    public int getNumCliente() {
        return numCliente;
    }
    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public static int obtener(Date registro,Date nacimiento){
        int edad = registro.getYear() - nacimiento.getYear();
        if (null != nacimiento) {
            if (nacimiento.getYear() > registro.getYear()) {
                JOptionPane.showMessageDialog(null, "LA FECHA INGRESADA NO ES CORRECTA");
            }
            
            if (edad < 18) {
                JOptionPane.showMessageDialog(null, "USTED ES MENOR NO PUEDE REGISTRARSE EN ESTE BACO ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UNA FECHA DE NACIMIENTO VALIDA");
        }
        return edad;
    }
    @Override
    public String toString() {
        return super.toString()+"" + " SU NUMERO DE CUENTA ES : " + getNumCuenta();
    }
    
    
}
