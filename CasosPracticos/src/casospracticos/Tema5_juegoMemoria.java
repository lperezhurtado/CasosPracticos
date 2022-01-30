
package casospracticos;

import java.util.Scanner;

public class Tema5_juegoMemoria {

    //funcion que crear y devolver un numero aleatorio entre los valores que se quiera
    public static int aleatorio(int min, int max) {
        return (int) (min + Math.random() * (max - min + 1));
    }

    //funcion que pide nº jugadores y comprueba si esta dentro del rango permitido
    //si no, sigue pidiendo hasta que esté dentro de rango
    public static int totalJugadores() {
        Scanner lector = new Scanner(System.in);

        int a;
        do {
            System.out.print("Numero de jugadores? (Maximo 4) ");
            a = lector.nextInt();

            if (a > 4) {
                System.out.println("Lo sentimos! Sólo se pueden 4 jugadores máximo :(");
            }
            if (a <= 0) {
                System.out.println("Tiene que haber al menos un jugador! Animate! :)");
            }
        } while (a > 4 || a <= 0);
        System.out.println("Genial!");

        return a;
    }

    //funcion para devolver un scanner de lectura
    public static String pedirnombres() {
        Scanner lector = new Scanner(System.in);
        return lector.nextLine();

    }

    //Funcion para guardar los nombres de los jugadores en un array de String
    public static void guardarNombres(String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre del jugador " + (i + 1) + "?");
            nombres[i] = pedirnombres();
        }
        System.out.println("\n");
        System.out.println("Empezemos!");
    }

    //Funcion para guardar info que se quiera en un array del tamaño que sea
    public static void guardarDatos(int[] array, int dato) {
        for (int i = 0; i < array.length; i++) {
            array[i] = dato;
        }
    }

    // Funcion para crear matriz del tamaño que se quiera y devolver
    public static char[][] generarMatriz(char[][] matriz, int i, int j) {
        return matriz = new char[i][j];
    }

    //Funcion para guardar los simbolos de forma aleatoria en la matriz creada
    public static void generarMatriz(char[][] matriz, char[] array) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\t");
            for (int j = 0; j < matriz.length; j++) {
                char simb = sAleatorio(array, aleatorio(0, array.length - 1));
                matriz[i][j] = simb;

                System.out.print(matriz[i][j] + "  ");
            }
        }
    }

    //funcion para hacer una matriz de asteriscos para "ocultar" la matriz de simbolos
    public static void matrizoculta(char[][] matriz, int i, int j) {
        matriz = new char[i][j];
        int cont = 0;

        for (int k = 0; k < j; k++) { //muestra nº de columnas
            cont = k;
            System.out.print("  " + cont);
        }
        System.out.print("\t");
        for (int k = 0; k < i; k++) {
            System.out.println("");
            cont = k;
            System.out.print(cont + "  "); //muestra nº de filas
            
            for (int l = 0; l < j; l++) {
                matriz[k][l] = '*';
                System.out.print(matriz[k][l] + "  "); //dibuja la matriz de asteriscos
            }
        }
    }

    public static char sAleatorio(char[] array, int pos) {
        return array[pos];
    }
    
    //Pregunta por posicion de un simbolo aleatorio, comprueba respuesta y envia resultado de respuesta 
    public static boolean preguntarsimb(char[][] matriz) {
        Scanner lector = new Scanner(System.in);
        boolean acierta = true;
        char simb;
        int a = aleatorio(0, matriz.length - 1);
        int b = aleatorio(0, matriz.length - 1);
        simb = matriz[a][b];

        System.out.println("En que posicion estaba este simbolo " + matriz[a][b]);

        System.out.print("Dime las coordenadas separadas por espacio: ");
        int pos1 = lector.nextInt();
        int pos2 = lector.nextInt();

        if (a == pos1 && b == pos2) {
            System.out.println("Acertaste! ");
            return acierta;
        } else {
            System.out.println("Has fallado!");
            acierta = false;
            return acierta;
        }
    }

    //funcion que muestra el resultado final
    public static void resultado(String[] nomb, int[] ptos, int[] intento, int a) {
        System.out.println("FINAL DE PARTIDA!" + "\n");
        System.out.println("RESULTADOS");
        for (int i = 0; i < a; i++) {
            System.out.println(nomb[i] + " tiene " + ptos[i] + " puntos y le "
                    + "quedaron " + intento[i] + " intentos");
        }
    }

    //****MAIN PRINCIPAL****
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //array con todos los simbolos disponibles
        char[] simbolo = {'&', '%', '$', '@', '#', 'P', 'T', 'Ω', 'β', 'π',
            'ψ', 'Ж', '҈', '҂', '۞', '۝', '۩', 'ည', '⁂', '★',
            '×', '♨', '♥','⚡','⚑','✇','▇','▲','◯'};

        int numjugadores;
        boolean acierta;
        //arrays para los datos de cada jugador
        String[] nombres;
        int[] intentos;
        int[] puntos;

        //matriz que generará tablas de distintos tamaños, por eso es valor NULL
        char[][] tabla = null;

        //matriz que hará matrices de distintos tamaños con asteriscos
        char[][] matrizoculta = null;
        // arrays declarados con el tamaño del nº de jugadores
        numjugadores = totalJugadores();
        nombres = new String[numjugadores];
        intentos = new int[numjugadores];
        puntos = new int[numjugadores];
        //llamada de funciones para guardar datos en arrays
        guardarNombres(nombres);
        guardarDatos(intentos, 3);
        guardarDatos(puntos, 0);

        //***** NIVEL 1*****
        for (int i = 0; i < numjugadores; i++) {//bucle para turno de cada jugador

            System.out.println(nombres[i] + " te toca!");
            tabla = generarMatriz(tabla, 4, 4); //crea matriz de tamaño 4x4
            generarMatriz(tabla, simbolo);

            System.out.println("\n");

            System.out.println("Cuando estés listo/a, pulsa cualquier tecla para empezar");
            String resp = pedirnombres(); //variable para empezar el juego con intro
            System.out.println("\n");

            matrizoculta(matrizoculta, 4, 4); //crea matriz oculta de tamaño 4x4
            System.out.println("\n");
            
            acierta = preguntarsimb(tabla); 
            System.out.println("\n");

            //comprueba resultado de la funcion anterior
            if (acierta == false) {
                intentos[i]--;
                System.out.println("Te quedan " + intentos[i] + " intentos");
            }
            if (acierta == true) {
                puntos[i] += 1;
            }
        }
        //se realiza mismo proceso en nivel 2 y 3, cambiando tamaño de matrices

        //*****NIVEL 2*****
        System.out.println("\t");
        System.out.println("====NIVEL 2====");
        System.out.println("ADELANTE!");

        for (int i = 0; i < numjugadores; i++) {

            System.out.println(nombres[i] + " te toca!");
            tabla = generarMatriz(tabla, 5, 5);
            generarMatriz(tabla, simbolo);

            System.out.println("\n");

            System.out.println("Cuando estés listo/a, pulsa cualquier tecla para empezar");
            String resp = pedirnombres();
            System.out.println("\n");

            matrizoculta(matrizoculta, 5, 5);
            System.out.println("\n");

            acierta = preguntarsimb(tabla);
            System.out.println("\n");

            if (acierta == false) {
                intentos[i]--;

                System.out.println("Te quedan " + intentos[i] + " intentos");
            }
            if (intentos[i] == 0) {
                System.out.println("Se te acabaron los intentos! Has perdido! ");

            }

            if (acierta == true) {
                puntos[i] += 2;
            }
        }

        //*****NIVEL 3*****
        System.out.println("\t");
        System.out.println("====NIVEL 3====");
        System.out.println("ADELANTE!");

        for (int i = 0; i < numjugadores; i++) {

            System.out.println(nombres[i] + " te toca!");
            tabla = generarMatriz(tabla, 6, 6);
            generarMatriz(tabla, simbolo);

            System.out.println("\n");

            System.out.println("Cuando estés listo/a, pulsa cualquier tecla para empezar");
            String resp = pedirnombres();
            System.out.println("\n");

            matrizoculta(matrizoculta, 6, 6);
            System.out.println("\n");

            acierta = preguntarsimb(tabla);
            System.out.println("\n");
            if (acierta == false) {
                intentos[i]--;

                System.out.println("Te quedan " + intentos[i] + " intentos");
            }
            if (intentos[i] == 0) {
                System.out.println("Se te acabaron los intentos! Has perdido! ");
            }

            if (acierta == true) {
                puntos[i] += 3;
            }
        }
        resultado(nombres, puntos, intentos, numjugadores); 
    }
}

