package POO_Entregable;

public class Proyeccion {

    private String titulo;
    private String dia;
    private String hora;
    private int butacasVendidas = 0;
    private double precio;
    private char libre = 'O';
    private char ocupado = 'X';
    private boolean comprueba = true;
    
    private int x = 10, y = 10;

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
    public boolean venderEntrada(int fila, int col) {
        
        do {
        if (fila <= x && col <= y && butacas[fila - 1][col - 1] != ocupado) { //comprueba coord. dentro de rango
             //comprueba que las butacas no esten ya escogidas
                butacas[fila - 1][(col - 1)] = ocupado;
                System.out.println("Butaca(s) reservada(s) \n");
                butacasVendidas++;
                comprueba = false;
                return true;
            } else {
                System.out.println("Butaca ya ocupada. Escoge otra por favor o Posicion fuera de rango. Vuelve a seleccionar.");
                comprueba = false;
            }
  
        
        } while(comprueba != false);
                return false;
    }

    //METODO PARA CANCELAR ENTRADAS
    public void cancelarEntrada(int fila, int col) {
        
        
        do {
        if (fila <= x && col <= y ){
            if (butacas[fila - 1][col - 1] == ocupado) {
                butacas[fila-1][col-1] = libre;
                System.out.println("Butaca cancelada. \n");
                butacasVendidas--;
                comprueba = false;
           } else {
                System.out.println("No hay butacas reservadas en esa posicion.");
                comprueba = false;
            }
            
        }else{
           System.out.println("Posicion de butaca fuera del rango");
           comprueba = false;
        }
        }while(comprueba != false);
    }

    //METODO PARA VER MATRIZ DE LA SALA
    public void verSala() {

        for (int i = 0; i < x; i++) {  // bucle para mostrar nº de columnas
            System.out.print((i + 1) + "  ");
        }

        System.out.println("\n");
        for (int i = 0; i < x; i++) { //bucle doble para dibujar la matriz de butacas
            for (int j = 0; j < y; j++) {
                if (butacas[i][j] == ocupado) {
                    System.out.print("\033[41m" + butacas[i][j] + "\u001B[0m" + "  ");
                    
                } else if (butacas[i][j] == libre) {
                    System.out.print("\033[0;32m" + butacas[i][j] + "\u001B[0m" + "  ");
                }
            }
           
            System.out.print("  " + (i + 1)); // muestra el nº de filas
            System.out.println("\t");
        }
        System.out.println("\n");
    }

    //Metodo para cambiar posicion de butacas
    public void modificarEntrada(int fila1, int col1, int fila2, int col2) {
        
        do {
            if (fila1 <= x && col1 <= y && fila2 <= x && col2 <= y) { //comprueba coord. dentro de rango
                if (butacas[fila1 -1][col1 - 1] == ocupado && butacas[fila2 - 1][col2 - 1] == libre) { //comprueba que la nueva butaca no este ya ocupada
                    butacas[fila1 - 1][col1 - 1] = libre;
                    butacas[fila2 - 1][col2 - 1] = ocupado;
                    comprueba = false;
                }
                else {
                    System.out.println("Error: butaca ya reservada. Elige otra por favor");
                    comprueba = false;
                }
            }
            
            else {
                System.out.println("Fuera de rango");
                comprueba = false;
            } 
           
        }while (comprueba != false);
         
    }
    
//Metodo para ver los datos de la sala    
    public void verDato(){
        System.out.println("Dia " + getDia());                
        System.out.println("Pelicula: " + getTitulo());
        System.out.println("Hora: " + getHora() + "\t");
        System.out.println("Precio: " + getPrecio()+ " €");
        System.out.println("Total de entradas vendidas: " + butacasVendidas);
    }
    
    //Metodo que permite rellenar la matriz con 'O'
    public char[][] rellenarMatriz(char[][] matriz) {

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                matriz[i][j] = libre;
            }
        }
        return matriz;
    }
    
    // metodo que permite recoger todos los datos en un solo metodo
    public void setAll(String titulo, String dia, String hora, double precio){
        setTitulo(titulo);
        setDia(dia);
        setHora(hora);
        setPrecio(precio);
    }
}
