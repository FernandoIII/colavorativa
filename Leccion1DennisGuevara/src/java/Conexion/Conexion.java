/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author usuario
 */
public class Conexion {
    Connection miconexion=null;
    
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            miconexion=DriverManager.getConnection("jdbc:mysql://localhost/Clientes","root","");} 
        
        catch (Exception e) {
            System.out.printf(e.getMessage());}
        return miconexion;
    }   
    
    
}
