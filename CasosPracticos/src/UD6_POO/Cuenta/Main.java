
package UD6_POO.Cuenta;

public class Main {
    
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta(1,100);
        c1.setSaldo(150);
        c1.ingresar(100);
        c1.retirar(200);
        
        Cuenta c2 = new Cuenta(2,-100);
        c2.setSaldo(-100);
        c2.ingresar(-100);
        c2.retirar(-100);
         
    }
}
