
package UD8_Ficheros;

import java.util.Scanner;

public class MiniTerminal {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String opcion;
        
        String ruta = "C:";
        String aux;
        boolean info = true;
        MiniFileManager fichero = new MiniFileManager(ruta);
        
        
        do {
            System.out.print(ruta + fichero.carpetaActual());
            opcion = lector.nextLine();
            
            if(opcion.equals("pwd")){
                System.out.println(fichero.carpetaActual());
            }
            
            else if(opcion.startsWith("cd")){
                aux = opcion.substring(3);
                fichero.changeDir(aux);
            }
            
            else if(opcion.equals("ls")){
                info = false;
                fichero.mostrarLista(info);
            }
        } while (!opcion.equals("exit"));
    }
    
}
