package POO_Entregable;

public class Proyeccion {

    private String titulo;
    private String dia;
    private String hora;
    private int maxButacas = y * y;
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
        rellenarMatriz(butacas);
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
    
    public void venderEntrada(int cantidad, int fila, int col) {
        for (int i = 0; i < cantidad; i++) {
                
                butacas[fila-1][(col-1)+i] = 'X'; 
            }
        
        
        verSala();
        
    }

    public void cancelarEntrada() {
    }

    public void verSala() {
        
        for (int i = 0; i < x; i++) {  // bucle para mostrar nº de columnas
            System.out.print((i+1) + "  ");
        }
        
        System.out.println("\n");
        for (int i = 0; i < x; i++) { //bucle doble para dibujar la matriz de butacas
            for (int j = 0; j < y; j++) {
                
                System.out.print(butacas[i][j] + "  ");
            }
            System.out.print("  " + (i+1)); // muestra el nº de filas
            System.out.println("\t");
        }
        
    }

    public void modificarEntrada() {
    }
    
    //Metodo que permite rellenar la matriz con 'O'
    public char[][] rellenarMatriz(char[][] matriz) {
        
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < y; j++) {
                
                matriz[i][j] = 'O';
            }
        }
        return matriz;
    }
}

