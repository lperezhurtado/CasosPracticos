package POO_Entregable;

public class Proyeccion {

    private String titulo;
    private String dia;
    private String hora;
    private int maxButacas = y * y;
    private int butacasVendidas = 0;
    private double precio;

    private final static int x = 10, y = 10;

    private char[][] butacas;

    // CONSTRUCTOR
    public Proyeccion(String titulo, String dia, String hora, double precio) {

        setTitulo(titulo);
        setDia(dia);
        setHora(hora);
        setPrecio(precio);

        butacas = new char[x][y];
        rellenarMatriz(butacas);
    }

    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDia(String dia) {
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

    //METODO PARA RESERVAR BUTACAS    REVISAR
    public void venderEntrada(int fila, int col) {
        System.out.println("Disposicion de la sala \n");
        verSala();
        if (fila <= x && col <= y) { //comprueba coord. dentro de rango
            if (butacas[fila - 1][col - 1] != 'X') { //comprueba que las butacas no esten ya escogidas
                butacas[fila - 1][(col - 1)] = 'X';
                System.out.println("Butaca(s) reservada(s) \n");
                butacasVendidas++;
            } else {
                System.out.println("Butaca ya ocupada. Escoge otra por favor.");
            }
        } else {
            System.out.println("Posicion fuera de rango. Vuelve a seleccionar.");
        }

        verSala();
    }

    //METODO PARA CANCELAR ENTRADAS
    public void cancelarEntrada(int fila, int col) {

        if (butacas[fila][col] == 'X') {
            butacas[fila][col] = 'O';
            System.out.println("Butaca cancelada. \n");
            butacasVendidas--;
        } else {
            System.out.println("No hay butacas reservadas en esa posicion.");
        }

    }

    //METODO PARA VER MATRIZ DE LA SALA
    public void verSala() {

        for (int i = 0; i < x; i++) {  // bucle para mostrar nº de columnas
            System.out.print((i + 1) + "  ");
        }

        System.out.println("\n");
        for (int i = 0; i < x; i++) { //bucle doble para dibujar la matriz de butacas
            for (int j = 0; j < y; j++) {
                if (butacas[i][j] == 'X') {
                    System.out.print("\033[41m" + butacas[i][j] + "\u001B[0m" + "  ");
                    
                } else if (butacas[i][j] == 'O') {
                    System.out.print("\033[0;32m" + butacas[i][j] + "\u001B[0m" + "  ");
                }
            }
            
            System.out.print("  " + (i + 1)); // muestra el nº de filas
            System.out.println("\t");
        }
        System.out.println("\n");
    }

    public void modificarEntrada(int fila1, int col1, int fila2, int col2) {
        
        boolean comprueba = true;
        
        do {
           if (fila1 <= x && col1 <= y && fila2 <= x && col2 <= y) { //comprueba coord. dentro de rango
            if (butacas[fila1][col1] == 'X' && butacas[fila2][col2] == 'O') {
                butacas[fila1][col1] = 'O';
                butacas[fila2][col2] = 'X';
                
            } else {
                System.err.println("Error: butaca ya reservada");
                comprueba = false;
            }
            
        } else {
            System.out.println("Fuera de rango");
            comprueba = false;
            } 
           
        } while (comprueba == false);
         
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
