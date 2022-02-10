
package UD6_POO.ArrayList;

import java.util.ArrayList;

public class Agenda {
    
    ArrayList<Contacto> agenda = new ArrayList();
    Contacto contacto;
    int cont;
    
    //REVISAR
    public void verContactos(){
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i));
        }
    }
    
    public void agregarContacto(String n, String t, String c){
        if(agenda.equals(n)){
            System.out.println("Nombre ya existente");
        }
        
        else{
            contacto = new Contacto(n, t, c);
            agenda.add(contacto);
        }
    }
    
    public void eliminarContacto(int pos){
        agenda.remove(pos);
    }
    
    public void buscarNombre(String n){
        
        cont = 0;
        System.out.println("Resultados \t");
        for (int i = 0; i < agenda.size(); i++) {
            
            if(agenda.get(i).getNombre().toUpperCase().contains(n)){
                System.out.println(agenda.get(i).getNombre());
                cont++;
            }
                   
        }
        if(cont == 0){
                System.out.println("No se han encontrado contactos \n");
            }
        
        System.out.println("\n"); 
        
    }    
        
    public void buscarTelefono(String t){
        
        cont = 0;
        System.out.println("Resultados \t");
        for (int i = 0; i < agenda.size(); i++) {
            
            if(agenda.get(i).getTelefono().contains(t)){
                System.out.println(agenda.get(i).getTelefono());
                cont++;
            }
             
        }
        if(cont == 0){
                System.out.println("No se han encontrado contactos \n");
        }
        
        System.out.println("\n");  
    }
    
    public void buscarCorreo(String c){
        
        cont = 0;
        System.out.println("Resultados \t");
        for (int i = 0; i < agenda.size(); i++) {
            
            if(agenda.get(i).getCorreo().toUpperCase().contains(c)){
                System.out.println(agenda.get(i).getCorreo());
                cont++;
            }
             
        }
        if(cont == 0){
                System.out.println("No se han encontrado contactos \n");
        }
        
        System.out.println("\n");  
    }
    
    public void busquedaGlobal(String s){
        
        
    }
    
}
