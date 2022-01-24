
package POO_AgendaContacto;

public class Agenda {
    
    private Contacto[] agenda = new Contacto[100];
    private int cuantos = 0;
    
    //Agregar contacto
    public void agregarContacto(String n, String t, String c){
        if(cuantos < 100){
            agenda[cuantos].setNombre(n);
            agenda[cuantos].setTelefono(t);
            agenda[cuantos].setCorreo(c);
            
            cuantos++;
        }
        else{
            System.out.println("Error: No se pueden añadir mas contactos");
        }
    }
    
    //Borrar contacto
    public void borrarContacto(int pos){
        for (int i = pos; i < (agenda.length-1); i++) {
            agenda[i] = agenda[i+1];
        }
        cuantos--;
    }
    
    public void buscarContacto(String nombre){
        int pos = 0;
        for (int i = 0; i < agenda.length; i++) { 
            if(agenda[i].getNombre().toUpperCase() == nombre.toUpperCase()){
                pos = i;
            }
        }
         agenda[pos].imprime();
    }
    
    //Imprimir todos los contactos
    public void imprimirTodos(){
        for (int i = 0; i < agenda.length; i++) {
            agenda[i].imprime();   
        }
    }
    
    

}
