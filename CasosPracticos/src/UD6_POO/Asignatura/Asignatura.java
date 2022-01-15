
package UD6_POO.Asignatura;

public class Asignatura {
    
    private String nombre;
    private int codigo;
    private int curso;
    //Constructor
    public Asignatura(String nomb, int cod, int cur){
        nombre = nomb;
        codigo = cod;
        curso = cur;
    }
    //Set y Get de nombre
    public void setNombre(String nomb) {
        nombre = nomb;
    }
    public String getNombre() {
        return nombre;
    }
    //Sett y Get de codigo
    public void setCodigo(int cod){
        codigo = cod;
    }
    public int getCodigo(){
        return codigo;
    }
    //Set Y Get de curso
    public void setCurso(int cur){
        curso = cur;
    }
    public int getCurso(){
        return curso;
    }

    public void imprimir(){
        System.out.println(getNombre()+", codigo "+codigo+", curso "+curso);
    }
}

