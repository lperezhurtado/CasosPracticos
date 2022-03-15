
package UD8_Ficheros;

import java.util.Scanner;

public class MiniTerminal {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String opcion;
        
        String raiz = "MiniTerminal.java";
        String ruta;
        boolean info = true;
        MiniFileManager fichero = new MiniFileManager(raiz);
        
        
        do {
            System.out.print(raiz+":");
            opcion = lector.nextLine();
            
            if(opcion.equals("pwd")){
                System.out.println(fichero.getPWD());
            }
            
            else if(opcion.startsWith("cd ")){
                ruta = opcion.substring(3);
                fichero.changeDir(ruta);
            }
            
            else if(opcion.equals("ls")){
                info = false;
                fichero.mostrarLista(info);
            }
        } while (!opcion.equals("exit"));
    }
    
}
