
package UD7_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej08 {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        
        int a;
        boolean correcto = false;
        do{
        try{
           System.out.println("Introduce un valor");
        a = lector.nextInt();
        correcto = true;
        }
        catch(InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
            lector.nextLine();
        }
        }while(!correcto);
        
    }

}
