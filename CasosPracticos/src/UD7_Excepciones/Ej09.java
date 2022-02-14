
package UD7_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej09 {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int a,b, resultado;
        
        try{
            System.out.println("Dime a");
            a = lector.nextInt();
            
            System.out.println("Dime b");
            b = lector.nextInt();
            
            resultado = a/b;
            System.out.println(resultado);
            
        }
        catch(InputMismatchException error1){
            System.out.println("Tipo de dato no valido");
            
        }
        catch(ArithmeticException error2){
            System.out.println("Division por cero");
        }
        
        
        
        
    }

}
