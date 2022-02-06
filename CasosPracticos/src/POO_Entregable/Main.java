package POO_Entregable;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("ELIJA UNA OPCIÓN:");
        System.out.println("*************************");
        System.out.println("1) Crear proyección:");
        System.out.println("2) Eliminar proyección:");
        System.out.println("3) Modificar proyección:");
        System.out.println("4) Vender entrada:");
        System.out.println("5) Cancelar entrada:");
        System.out.println("6) Modificar entrada:");
        System.out.println("7) Ver proyecciones:");
        System.out.println("8) Salir:");
        System.out.println("*************************");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cine miCine = new Cine();
        int opcion = 0, posEliminar, posModificar, nEntradas, fila, butaca;

        do {
            menu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    in.nextLine();
                    System.out.println("Dime título:");
                    String titulo = in.nextLine();
                    System.out.println("Dime día:");
                    String dia = in.nextLine();
                    System.out.println("Dime hora:");
                    String hora = in.nextLine();
                    System.out.println("Dime precio:");
                    double precio = in.nextDouble();

                    Proyeccion p = new Proyeccion(titulo, dia, hora, precio);

                    miCine.anyadirProyeccion(p);
                    break;

                case 2:
                    System.out.println("Indica la proyección que desea eliminar:");
                    miCine.verDatos();
                    posEliminar = in.nextInt();
                    miCine.quitarProyeccion(posEliminar);
                    
                    break;

                case 3:
                    System.out.println("Indica la proyección a modificar:");
                    miCine.verProyecciones();
                    posModificar = in.nextInt();

                    in.nextLine();
                    System.out.println("Dime título:");
                    String titulo1 = in.nextLine();
                    System.out.println("Dime día:");
                    String dia1 = in.nextLine();
                    System.out.println("Dime hora:");
                    String hora1 = in.nextLine();
                    System.out.println("Dime precio:");
                    double precio1 = in.nextDouble();
                    miCine.modificarProyeccion(posModificar, titulo1, dia1, hora1, precio1);
                    
                    break;

                case 4:
                    System.out.println("Sesiones disponibles: \n");
                    miCine.verDatos();

                    System.out.println("¿Para que proyeccion las quiere? \n");
                    int pos = in.nextInt();
                    System.out.println("Disposicion de la sala \n");
                    miCine.verSala(pos);

                    System.out.println("Dime cuantas entradas quieres:");
                    nEntradas = in.nextInt();
                    System.out.println("A continuación, me indicaras la localización de tus entradas");

                    for (int i = 0; i < nEntradas; i++) {
                        System.out.println("Dime la fila de la entrada " + (i + 1));
                        fila = in.nextInt();
                        System.out.println("Dime la butaca de la entrada " + (i + 1));
                        butaca = in.nextInt();

                        if (miCine.venderEntradas(pos, fila, butaca) == false) {
                            i--;
                            System.out.println("Butaca repetida, selecciona de nuevo \n");
                        }
                    }

                    break;

                case 5:

                    miCine.verDatos();
                    System.out.println("En que sesion las tenias? \n");
                    pos = in.nextInt();
                    System.out.println("Dime cuantas entradas quieres cancelar:");
                    nEntradas = in.nextInt();
                    System.out.println("A continuación, me indicaras la localización de tus entradas");
                    for (int i = 0; i < nEntradas; i++) {
                        System.out.println("Dime la fila de la entrada " + (i + 1));
                        fila = in.nextInt();
                        System.out.println("Dime la butaca de la entrada " + (i + 1));
                        butaca = in.nextInt();
                        miCine.cancelarEntrada(pos, fila, butaca);

                    }
                    break;

                case 6:

                    miCine.verDatos();
                    System.out.println("En que sesion las tenias? \n");
                    pos = in.nextInt();

                    System.out.println("Dime cuantas entradas quieres modificar:");
                    nEntradas = in.nextInt();
                    System.out.println("A continuación, me indicaras la localización de tus entradas");
                    for (int i = 0; i < nEntradas; i++) {
                        System.out.println("==========================================");
                        System.out.println("DATOS ACTUALES \t");
                        System.out.println("Dime la fila de la entrada " + (i + 1));
                        fila = in.nextInt();
                        System.out.println("Dime la butaca de la entrada " + (i + 1));
                        butaca = in.nextInt();
                        System.out.println("==========================================");
                        System.out.println("DATOS NUEVOS \t");
                        System.out.println("Dime la fila de la entrada " + (i + 1));
                        int fila2 = in.nextInt();
                        System.out.println("Dime la butaca de la entrada " + (i + 1));
                        int butaca2 = in.nextInt();

                        miCine.modificarEntradas(pos, fila, butaca, fila2, butaca2);

                    }
                    break;

                case 7:
                    miCine.verProyecciones();
                    break;

                case 8:
                    System.out.println("HASTA LUEGO");
                    break;

                default:
                    throw new AssertionError();
            }
                    
        } while (opcion != 8);
                            
    }
}
