/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factor;

/**
 *
 * @author usuario
 */
public class modelo_factorial {


    public modelo_factorial() {
    }
    public void factor(){
        int fac = 1;
    
        for(int i=1;i<=10;i++){
    
            for(int j=1;j<=i;j++){
            fac=fac*j;
            
            
            }
            System.out.println(fac);
            fac=1;
        }
    }
}

