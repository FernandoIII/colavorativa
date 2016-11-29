/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBIntrospector;

/**
 *
 * @author MINEDUC
 */
public class conexion {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            
            JOptionPane.showMessageDialog(null, "SE ESTABLECIO CONECCION CON LA BASE DE DATOS");
        }catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR CON LA  CONECCION CON LA BASE DE DATOS");
        }
        return conectar;
        
    }
    
}
