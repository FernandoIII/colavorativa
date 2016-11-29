/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUC
 */
public class Persona {
     private int cedula;
    private int telefono;
    private int celular;
    private int edad;
    private String nombre;
    private String apellido;
    private String direccion;
    private String estadoC;
    private String  correo;

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
     private String  provincia;
      private String  ciudad;
    
     public Persona(int cedula, int telefono, int celular, String nombre, String apellido, String direccion, String estadoC) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.celular = celular;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estadoC = estadoC;
    }

    public Persona() {
    }

    public Persona(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     
    
    
   @Override
    public String toString(){
        return "Sr/Sra    " +  getNombre()+  getApellido() ;
    }
    public static boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        if (cedula.length() >= 10) {
            try {

                if (cedula.length() == 10) // ConstantesApp.LongitudCedula
                {
                    int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                    if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                        int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                        int verificador = Integer.parseInt(cedula.substring(9, 10));
                        int suma = 0;
                        int digito = 0;
                        for (int i = 0; i < (cedula.length() - 1); i++) {
                            digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                            suma += ((digito % 10) + (digito / 10));
                        }

                        if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                            cedulaCorrecta = true;
                        } else if ((10 - (suma % 10)) == verificador) {
                            cedulaCorrecta = true;
                        } else {
                            cedulaCorrecta = false;
                        }
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } catch (NumberFormatException nfe) {
                cedulaCorrecta = false;
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Surgio un error en el proceso de validadcion");
                cedulaCorrecta = false;
            }

            if (!cedulaCorrecta) {
                JOptionPane.showMessageDialog(null, "La Cédula ingresada es Incorrecta");

            } else {
                JOptionPane.showMessageDialog(null, "La Cédula correcta");

            }
        }
        return cedulaCorrecta;

    }
}
