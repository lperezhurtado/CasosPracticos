
package UD6_POO.ArrayList;

import java.util.ArrayList;

public class Agenda {
    
    ArrayList<Contacto> agenda = new ArrayList();
    
    // Objeto contacto que se añadira en el arrayList
    Contacto contacto;
    
    //variables auxuliares
    int cont;
    boolean existe = false; //para comprobar si hay nombres repetidos
    
    //metodo para ver todos los contactos
    public void verContactos(){
        cont = 0;
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i).imprime());
            cont++;
        }
        if(cont == 0){
            System.out.println("No hay contactos");
        }
    }
    
    // metodo para añadir un nuevo contacto, comprobando si ya existe 
    public void agregarContacto(String n, String t, String c){
        
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getNombre().equals(n)){
                existe = true;
                break;
            }
          
        }
        
        if(existe == true){
            System.out.println("Contacto ya existente");
        }
        
        else if(existe == false){
            contacto = new Contacto(n, t, c);
            agenda.add(contacto);
        }
    }
    
    //metodo para elimnar contacto por posicion
    public void eliminarContacto(int pos){
        
        if(pos > agenda.size()){
            System.out.println("Posicion fuera de rango o no hay contactos");
        }
        else{
            agenda.remove(pos);
        }
    }
    
    // busca contacto pasandole un string que contenga el nombre o parte de el
    public void buscarNombre(String n){
        
        cont = 0;
        System.out.println("Resultados \t");
        for (int i = 0; i < agenda.size(); i++) {
            
            if(agenda.get(i).getNombre().toUpperCase().contains(n.toUpperCase())){
                System.out.println(agenda.get(i).imprime());
                cont++;
            }
                   
        }
        if(cont == 0){
                System.out.println("No se han encontrado contactos \n");
            }
        
        System.out.println("\n"); 
        
    }    
    
    //igual que el anterior pero con el String de telefono
    public void buscarTelefono(String t){
        
        cont = 0;
        System.out.println("Resultados \t");
        for (int i = 0; i < agenda.size(); i++) {
            
            if(agenda.get(i).getTelefono().contains(t)){
                System.out.println(agenda.get(i).imprime());
                cont++;
            }
             
        }
        if(cont == 0){
                System.out.println("No se han encontrado contactos \n");
        }
        
        System.out.println("\n");  
    }
    
    // igual que el anterior pero el String de correo
    public void buscarCorreo(String c){
        
        cont = 0;
        System.out.println("Resultados \t");
        for (int i = 0; i < agenda.size(); i++) {
            
            if(agenda.get(i).getCorreo().toUpperCase().contains(c.toUpperCase())){
                System.out.println(agenda.get(i).imprime());
                cont++;
            }
             
        }
        if(cont == 0){
            System.out.println("No se han encontrado contactos \n");
        }
        
        System.out.println("\n");  
    }
    
   // busca el String que se le pasa en los tres parametros que tiene el objeto
    public void busquedaGlobal(String s){
        
        cont = 0;
        System.out.println("Resultados \t");
        
        for (int i = 0; i < agenda.size(); i++) {
        
            if(agenda.get(i).getNombre().toUpperCase().contains(s.toUpperCase()) || 
               agenda.get(i).getTelefono().contains(s.toUpperCase()) ||
               agenda.get(i).getCorreo().toUpperCase().contains(s.toUpperCase())){
                
                System.out.println(agenda.get(i).imprime());
                cont++;
            }  
           
        }
        if(cont == 0){
                System.out.println("No se han encontrado contactos \n");
            }
        
    }
    
}
