/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborativo.pkg2;

/**
 *
 * @author usuario
 */
public class restar {
    public int n,m;

    public restar(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    
    public void resta(){
        System.out.println("Cambio realizado por Kathya desde Net Beans "+(n-m));
    }
}
