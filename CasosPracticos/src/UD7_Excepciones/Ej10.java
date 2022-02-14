
package UD7_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        double[] numeros = new double[5];
        
        for (int i = 0; i < numeros.length; i++) {
        
            try{

                    System.out.println("Introduce un valor");
                    numeros[i] = lector.nextDouble();

                }

            catch(InputMismatchException error1){

                System.out.println("Tipo de dato no valido");
                lector.nextLine();
            }

            catch(IndexOutOfBoundsException error2){

                System.out.println("Numero fuera de rango");
                lector.nextLine();
            }
        
        }
        
    }

}
