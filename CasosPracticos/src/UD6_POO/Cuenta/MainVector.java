
package UD6_POO.Cuenta;

import java.util.Scanner;

public class MainVector {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        
        Cuenta cuenta = new Cuenta();
        Cuenta[] cuentas = new Cuenta[5];
        
        cuentas[0] = new Cuenta(1, 100);
        cuentas[1] = new Cuenta(2,100);
        cuentas[2] = new Cuenta(3,100);
        cuentas[3] = new Cuenta(4,100);
        cuentas[4] = new Cuenta(5,100);
        
        int c, cant;
        do {
            cuenta.menu();
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    for (int i = 0; i < cuentas.length; i++) {
                        cuentas[i].imprimir();
                    }
                    break;
                case 2:  
                    System.out.println("Cuenta? ");
                    c = lector.nextInt();
                    System.out.println("Cantidad? ");
                    cant = lector.nextInt();
                    
                    cuentas[c-1].ingresar(cant);
                    
                    break;
                case 3:
                    System.out.println("Cuenta? ");
                    c = lector.nextInt();
                    System.out.println("Cantidad? ");
                    cant = lector.nextInt();
                    
                    cuentas[c-1].retirar(cant);
                    
                    break;
                case 4:
                    int o,d;
                    System.out.println("Cuenta origen? ");
                    o = lector.nextInt();
                    System.out.println("Cuenta destino? ");
                    d = lector.nextInt();
                    System.out.println("Cantidad? ");
                    cant = lector.nextInt();
                    
                    cuentas[o-1].retirar(cant);
                    cuentas[d-1].ingresar(cant);
                    
                    break;
                case 5:
                    System.out.println("SALIR");        
            }
            
        } while (opcion != 5);
           
    }
    
}
