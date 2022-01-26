
package POO_AgendaContacto;

import java.util.Scanner;

public class Agenda {
    
    private Contacto[] contactos;
    private int cuantos = 0;
    
    public Agenda(){
        contactos = new Contacto[100];
    }
    
    
    //menu
    public static void menu(){
        System.out.println("MENU \n"
                + "1. Ver contactos \n"
                + "2. Agregar contactos \n"
                + "3. Eliminar contacto \n"
                + "4. Buscar por nombre \n"
                + "5. Salir \n"
                + "ELIGE UNA OPCION");
    }
    //Agregar contacto
    public void agregarContacto(String n, String t, String c){
        if(cuantos < 100){
            contactos[cuantos] = new Contacto(n, t, c);
            
            cuantos++;
        }
        else{
            System.out.println("Error: No se pueden añadir mas contactos");
        }
    }
    
    //Borrar contacto
    public void borrarContacto(int pos){
        for (int i = pos; i < (contactos.length-1); i++) {
            contactos[i] = contactos[i+1];
        }
        cuantos--;
    }
    
    public void buscarContacto(String nombre){
        int pos = 0;
        for (int i = 0; i < contactos.length; i++) { 
            if(contactos[i].getNombre().toUpperCase() == nombre.toUpperCase()){
            contactos[pos].imprime();
            }
        }
         
    }
    
    //Imprimir todos los contactos
    public void imprimirTodos(){
        for (int i = 0; i < contactos.length; i++) {
            contactos[i].imprime();   
        }
    }
    
    public String pedirDatos(){
        Scanner lector = new Scanner(System.in);
        return lector.nextLine();
    }
    
    

}
