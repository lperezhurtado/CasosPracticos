package Codigo_Cesar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Codigo_Cesar {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in); //Scanner general
        String texto;
        String ruta;
        String direccion;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        try {
            System.out.println("Archivo? ");
            ruta = lector.nextLine();
            
            File f = new File(ruta);
            Scanner lectorCarta = new Scanner(f); //Scanner para archivos
            texto = lectorCarta.nextLine();
            System.out.println(texto);
            lectorCarta.close();
    
            System.out.println("Clave? ");
            int clave = lector.nextInt();
            lector.nextLine();
            
            System.out.println("Hacia adelante o atras?");
            direccion = lector.nextLine();
            
            //condicional para mover letras hacia adelante
            if(direccion.equalsIgnoreCase("adelante")){
                //bucle que recorre la carta caracter a caracter
                for (int i = 0; i < texto.length(); i++) {
                    char letra = texto.charAt(i);
                    //bucle que recorre el String alfabeto y comprueba si letra 
                    //esta dentro del String, si no lo esta, imprime letra
                    for (int j = 0; j < alfabeto.length(); j++) {
                        if (texto.toUpperCase().charAt(i) == alfabeto.charAt(j)) {

                            if ((j + clave + 1) > alfabeto.length()) {
                                int pos = ((j + clave) - alfabeto.length());
                                System.out.print(alfabeto.charAt(pos));
                            } else {
                                System.out.print(alfabeto.charAt(j + clave));
                            }
                            
                        } else if (!alfabeto.contains(String.valueOf(letra))) {
                            System.out.print(texto.charAt(i));
                            break;
                        }
                    }
                }
                System.out.println("");
            }
            //condicional para mover las letras hacia atras segun indique clave
            else if(direccion.equalsIgnoreCase("atras")){
                
                for (int i = 0; i < texto.length(); i++) {
                    char letra = texto.charAt(i);
                    //bucle similar al del condicional "hacia adelante"
                    for (int j = 0; j < alfabeto.length(); j++) {
                        if (texto.toUpperCase().charAt(i) == alfabeto.charAt(j)) {

                            if ((j - clave) < 0) {
                                int pos = (alfabeto.length() - (clave-j));
                                System.out.print(alfabeto.charAt(pos));
                            } else {
                                System.out.print(alfabeto.charAt(j - clave));
                            }
                        } else if (!alfabeto.contains(String.valueOf(letra))) {
                            System.out.print(texto.charAt(i));
                            break;
                        }
                    }
                }
                System.out.println("");
            }
            else{
                System.out.println("Indica si es hacia adelante o hacia atras");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        catch (InputMismatchException er) {
            System.out.println("Indica una clave numerica");
        }
    }
}