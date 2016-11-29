
package nuevo;

import javax.swing.JOptionPane;


public class generar {
    public int primo;

    public generar(int primo) {
        this.primo = primo;
    }

    public int getPrimo() {
        return primo;
    }

    public void setPrimo(int primo) {
        this.primo = primo;
    }
    public void primos(){
        int cont=0;
        int div=1;
        int num=1;
        int suma=1;
        int n=1;
        String aux="";
        while (cont<=primo){
            if(n%div==0){
                suma+=1;
                aux+=n;
                cont+=1;
            }
            div+=1;
            n+=1;

       
        }
        if(suma<=2){
            aux+=n;
            
        }
            
        JOptionPane.showMessageDialog(null,"La serie es igual a:"+aux);
        }
    
    
    
}
