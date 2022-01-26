
package POO_AgendaContacto;

import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int opcion;
        String n, t, c;
        Agenda agenda = new Agenda();
        
        
        do {
            Agenda.menu();
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1: // Ver todos los contactos
                    agenda.imprimirTodos();
                    break;
                case 2: //Agregar contactos
                    System.out.println("Nombre? ");
                    n = agenda.pedirDatos();
                    
                    System.out.println("Telefono? ");
                    t = agenda.pedirDatos();
                    
                    System.out.println("Correo? ");
                    c = agenda.pedirDatos();
                    
                    agenda.agregarContacto(n, t, c);
                    break;
                case 3: //Borrar un contacto con su posicion
                    System.out.println("Posicion a borrar? ");
                    int pos = lector.nextInt();
                    
                    agenda.borrarContacto(pos);
                    break;
                case 4:
                    System.out.println("Nombre a buscar? ");
                    n = agenda.pedirDatos();
                    
                    agenda.buscarContacto(n);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
               
            }      
        } while (opcion != 5);
        
    }
}
