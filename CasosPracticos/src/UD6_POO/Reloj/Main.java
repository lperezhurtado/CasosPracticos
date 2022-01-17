
package UD6_POO.Reloj;

public class Main {
    
    public static void main(String[] args) {
        
        Reloj r1 = new Reloj(0,0,0);
        
        r1.imprimeHora();
        r1.tick();
        r1.imprimeHora();
        r1.imprimeHora12();
        
    }
}
