
package UD6_POO.ArrayList;

import java.util.ArrayList;

public class Agenda {
    
    ArrayList<Contacto> agenda = new ArrayList();
    
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
            Contacto contacto = new Contacto(n, t, c);
            agenda.add(contacto);
        }
    }
    
    public void eliminarContacto(int pos){
        agenda.remove(pos);
    }
    
    
    
}
