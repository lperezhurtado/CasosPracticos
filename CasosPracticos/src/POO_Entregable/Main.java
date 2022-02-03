package POO_Entregable;

public class Main {

    public static void main(String[] args) {
        
    String titulo = "Spiderman";
    String dia = "Lunes";
    String hora = "10:30";
    int maxButacas;
    int butacasVendidas;
    double precio = 10;
        Proyeccion p1 = new Proyeccion(titulo, dia, hora, precio);
        
        p1.verSala();
        
        p1.venderEntrada(3, 5);
         p1.venderEntrada(3, 5);
        
        p1.venderEntrada(6, 10);
        p1.venderEntrada(4, 4);
        p1.venderEntrada(7, 3);
        p1.venderEntrada(6,1);
    }
}
