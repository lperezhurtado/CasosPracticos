
package UD7_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej11 {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int[] numeros;
        
        int n = (int) (Math.random() * (100 - 1 +1) + 1);
        int numero, pos = 0;
        numeros = new int[n];
        
        do {
            
            try{
                for (int i = 0; i < numeros.length; i++) {
                    
                    numero = (int)(Math.random() * (10 - 1 +1) + 1);
                    numeros[i] = numero;
                }
                
                System.out.println("Que posicion quieres ver");
                pos = lector.nextInt();
                
                System.out.println(numeros[pos]);
            }
            
            catch(InputMismatchException error1){
                System.out.println("Dato no valido");
            }
            
            catch(IndexOutOfBoundsException error2){
                System.out.println("Numero fuera de rango");
            }
            
            
            
        } while (pos > 0);
        
        
    }

}
