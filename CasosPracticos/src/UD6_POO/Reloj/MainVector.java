
package UD6_POO.Reloj;

public class MainVector {
    
    public static void main(String[] args) {
        
        Reloj[] relojes = new Reloj[5];
        
        relojes[0] = new Reloj(0,0,0);
        relojes[1] = new Reloj(1,2,3);
        relojes[2] = new Reloj(12,12,12);
        relojes[3] = new Reloj(6,23,43);
        relojes[4] = new Reloj(10,16,32);
        
        //bucle para ver los relojes
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].imprimeHora();
        }
        //bucle para hacer tick en cada reloj
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].tick();
            relojes[i].imprimeHora();
        }
        //bucle para adelantar un minuto
        for (int i = 0; i < relojes.length; i++) {
            
            for (int j = 0; j < 59; j++) {
                relojes[i].tick();
            }
            relojes[i].imprimeHora();
        }
        //bucle para adelantar una hora
       for (int i = 0; i < relojes.length; i++) {
            for (int j = 0; j < 3600; j++) {
                relojes[i].tick();
            }
            relojes[i].imprimeHora();
        }
        
        for (int i = 0; i < relojes.length; i++) {
           
            relojes[i].tick(300);
        }
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].imprimeHora();
        }  
    }
}
