package POO_Entregable;

public class Proyeccion {

    private String titulo;
    private String dia;
    private String hora;
    private int maxButacas;
    private int butacasVendidas;
    private double precio;
    
    
    private final static int x = 10, y = 10;

    private char[][] butacas;

    public Proyeccion(String titulo, String dia, String hora, double precio) {
        
        setTitulo(titulo);
        setDia(dia);
        setHora(hora);
        setPrecio(precio);
        
        butacas = new char[x][y];
    }
    
    //SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDia(String dia){
        this.dia = dia;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //GETTERS
    public String getHora() {
        return hora;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDia() {
        return dia;
    }
    

    
    public void venderEntrada() {
        
        
    }

    public void cancelarEntrada() {
    }

    public void verSala() {
    }

    public void modificarEntrada() {
    }

    public void rellenarMatriz() {
    }
}
