public class Asignatura {

    // ATRIBUTOS
    private String nombre;
    private int codigo;
    private int curso;

    // CONSTRUCTOR
    public Asignatura(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println("Nombre: " + nombre + "   Código: " + codigo + "   Curso: " + curso);
    }

}
