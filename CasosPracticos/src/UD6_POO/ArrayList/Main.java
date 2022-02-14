package UD6_POO.ArrayList;

import java.util.*;

public class Main {
    
    //clase menu
    public static void menu(){
        System.out.println("\t");
        System.out.println("MENU \n"
                + "1. Ver contactos \n"
                + "2. Agregar contactos \n"
                + "3. Eliminar contacto \n"
                + "4. Buscar por nombre \n"
                + "5. Buscar por telefono \n"
                + "6. Buscar por correo \n"
                + "7. Busqueda global \n"
                + "8. Salir \n"
                + "ELIGE UNA OPCION");
    }
    
    //MAIN
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        Agenda agendaContactos = new Agenda();
        
        //variables auxiliares
        int opcion, pos;
        String n, t, c, d;
        
        do {
            menu();
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1: // verContactos
                    
                    agendaContactos.verContactos();
                    break;
                case 2: //agregarContacto
                    
                    lector.nextLine();
                    System.out.println("Nombre?");
                    n = lector.nextLine();
                    
                    System.out.println("Telefono?");
                    t = lector.nextLine();
                    
                    System.out.println("Correo?");
                    c = lector.nextLine();
                    
                    agendaContactos.agregarContacto(n, t, c);
                    break;
                case 3: // eliminarContacto
                    
                    System.out.println("ID de contacto a eliminar?");
                    pos = lector.nextInt();
                    
                    agendaContactos.eliminarContacto(pos);
                    break;
                case 4: //buscar por NOMBRE
                    
                    lector.nextLine();
                    System.out.println("Nombre a buscar?");
                    n = lector.nextLine();
                    
                    agendaContactos.buscarNombre(n);
                    break;
                case 5: // busqueda por TELEFONO
                    
                    lector.nextLine();
                    System.out.println("Telefono a buscar?");
                    t = lector.nextLine();
                    
                    agendaContactos.buscarTelefono(t);
                    break;
                case 6: // busqueda por CORREO
                    
                    lector.nextLine();
                    System.out.println("Correo a buscar?");
                    c = lector.nextLine();
                    
                    agendaContactos.buscarCorreo(c);
                    break;    
                case 7: //busqueda GLOBAL
                    
                    lector.nextLine();
                    System.out.println("Dato a buscar?");
                    d = lector.nextLine();
                    
                    agendaContactos.busquedaGlobal(d);
                    break;
                case 8: //SALIR
                    
                    System.out.println("HASTA LUEGO");
                    break;
                    
                default:
                    throw new AssertionError();
            }
            
        } while (opcion != 8);
        
    }
}
