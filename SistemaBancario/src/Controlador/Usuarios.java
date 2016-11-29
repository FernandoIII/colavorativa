/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUC
 */
public class Usuarios extends Persona {
    private String usuario,cotrasena,tipo_usuario;
    /**
     * COSTRUCTOR PARA LAS FUNCIONES DE LA CLASE
     */
    public Usuarios() {
    }
    /**
     * COSTRUCTOR PARA LA CREACION DE USUARIOS
     * @param usuario
     * @param cotrasena
     * @param tipo_usuario
     * @param cedula
     * @param nombre
     * @param apellido 
     */
    public Usuarios(String usuario, String cotrasena, String tipo_usuario, int cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.usuario = usuario;
        this.cotrasena = cotrasena;
        this.tipo_usuario = tipo_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
        this.cotrasena = cotrasena;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    

    
     public void validar_correo(String correo){
          Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
       Matcher mat = pat.matcher(correo);
       if(mat.find()){
           JOptionPane.showMessageDialog(null,"CORREO VALIDO");
       }else{
          JOptionPane.showMessageDialog(null,"CORREO NO VALIDO");
     }
    }
            
    
}
