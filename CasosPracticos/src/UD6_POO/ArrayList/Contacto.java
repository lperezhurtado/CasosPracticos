
package UD6_POO.ArrayList;

public class Contacto {
    
    private String nombre;
    private String telefono;
    private String correo;
    
    public Contacto(String nombre, String telefono, String correo){
        setNombre(nombre);
        setTelefono(telefono);
        setCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void imprime(){
        System.out.println(nombre +" - "+ telefono +" - "+ correo);
    }
    
}
