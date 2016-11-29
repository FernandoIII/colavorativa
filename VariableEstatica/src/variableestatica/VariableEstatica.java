/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableestatica;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class VariableEstatica {

       int n;
    public VariableEstatica (){
             JOptionPane.showMessageDialog(null,"numeros"+n++);
    }
    public static void main(String[] args) {
     VariableEstatica ob1= new VariableEstatica();
     VariableEstatica ob2= new VariableEstatica();
     VariableEstatica ob3= new VariableEstatica();
     VariableEstatica ob4= new VariableEstatica();
     VariableEstatica ob5= new VariableEstatica();
    }
    
}
