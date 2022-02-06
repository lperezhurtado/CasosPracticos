package POO_Entregable;

public class Cine {

    private Proyeccion[] proyecciones;
    private int cuantos;
    
    //CONSTRUCTOR
    public Cine() {
        proyecciones = new Proyeccion[7];
        cuantos = 0;
    }

    //metodo para añadir proyeccion en el array
    public void anyadirProyeccion(Proyeccion p) {

        if (cuantos < 7) {

            proyecciones[cuantos] = p;
            System.out.println("Proyeccion añadida. \n");
            cuantos++;
            
        } else {
            System.out.println("Limite de proyecciones alcanzado. \n");
        }

    }

    //metodo que quita una proyeccion y recorrer las proyecciones a la posicion anterior
    public void quitarProyeccion(int posEliminar) {
        if(cuantos == 0){
            System.out.println("No hay proyecciones");
        }
        else{
            for (int i = posEliminar; i < (cuantos - 1); i++) {
                proyecciones[i] = proyecciones[i + 1];
            }
            cuantos--;
        }
    }

    public void modificarProyeccion(int posModificar, String titulo, String dia, String hora, double precio) {

        proyecciones[posModificar].setAll(titulo, dia, hora, precio);

    }

    public boolean venderEntradas(int proyeccion, int fila, int butaca) {
        
        if (proyecciones[proyeccion].venderEntrada(fila, butaca) == true) {

            return true;
        } else {
            return false;
        }

    }

    public void cancelarEntrada(int pos, int fila, int butaca) {
        proyecciones[pos].cancelarEntrada(fila, butaca);
    }

    public void modificarEntradas(int pos, int fila1, int col1, int fila2, int col2) {

        proyecciones[pos].modificarEntrada(fila1, col1, fila2, col2);
    }

    public void verProyecciones() {
        
        if(cuantos == 0){
            System.out.println("No hay proyecciones \t");
        }
        for (int i = 0; i < cuantos; i++) {
            System.out.println("Proyeccion: " + i);
            System.out.println("**************************************** \t");
            proyecciones[i].verDato();
            System.out.println("**************************************** \t");
            proyecciones[i].verSala();

        }

    }

    public void verDatos() {
        for (int i = 0; i < cuantos; i++) {
            System.out.println("Proyeccion: " + i);
            proyecciones[i].verDato();
            System.out.println("========================== \t");
        }
    }

    public void verSala(int pos) {
        proyecciones[pos].verSala();
    }

}
