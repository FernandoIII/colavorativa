/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborativo.pkg2;

/**
 *
 * @author IvanTC
 */
public class MULTIPLICAR {
    public int a;
    public int b;

    public MULTIPLICAR(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void multiplicar(){
        System.out.println(a+b);
    }
}
