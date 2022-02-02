package casospracticos;

/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 */
import java.util.Scanner;

public class Tema3_starWars {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Variables que se usan a lo largo del codigo
        int respuesta;
        int suma = 0;
        int cont = 0;
        String pierde = "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                + "\n" + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                + "intentarlo!";
        String fin = "Gracias por jugar :D";

        //INICIO
        int S1 = (int) (1 + Math.random() * (10 - 1 + 1));
        int S2 = (int) (20 + Math.random() * (30 - 20 + 1));
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa\n"
                + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n"
                + "en una nave imperial robada en una misión secreta para infiltrarse\n"
                + "en otra estrella de la muerte que el imperio está construyendo\n"
                + "para destruirla. (Pulsa un tecla para continuar)");
        String intro;
        intro = lector.nextLine();

        //NIVEL 1
        System.out.println("Los problemas empiezan cuando deben realizar un salto\n"
                + "hiperespacial hasta el sistema estelar " + S1 + " en el sector " + S2 + ", pero el\n"
                + "control de navegación está estropeado y el computador tiene\n"
                + "problemas para calcular parte de las coordenadas de salto.\n"
                + "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n"
                + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                + "nº del sistema y el nº del sector (ambos inclusive).");
        System.out.println("¿Qué debe introducir?");
        respuesta = lector.nextInt();
        //sumatorio
        for (cont = S1; S1 <= S2; S1++) {
            suma = suma + S1;
        }
        if (respuesta != suma) {
            System.out.println(pierde + "\n" + fin);
        }   
        //NIVEL 2
        else {
            int P1 = (int) (1 + Math.random() * (7 - 1 + 1));
            int P2 = (int) (8 + Math.random() * (12 - 8 + 1));
            int prod = 1;
            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                    + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                    + "robada se aproximan lentamente con la intención de pasar\n"
                    + "desapercibidos. De repente suena el comunicador. 'Aquí agente\n"
                    + "de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + ". No están\n"
                    + "destinados en este sector. ¿Qué hacen aquí?'. Han Solo coge el\n"
                    + "comunicador e improvisa. 'Eh… tenemos un fallo en el… eh…\n"
                    + "condensador de flujo... Solicitamos permiso para atracar y\n"
                    + "reparar la nave'. El agente, que no se anda con tonterías,\n"
                    + "responde 'Proporcione código de acceso o abriremos fuego'. Han\n"
                    + "Solo ojea rápidamente el manual del piloto que estaba en la\n"
                    + "guantera y da con la página correcta. El código es el productorio\n"
                    + "entre el nº del agente y el nº de la nave (ambos inclusive).");
            //producto
            for (cont = P1; P1 <= P2; P1++) {
                prod = prod * P1;
            }
            System.out.println("¿Cuál es el código?");
            respuesta = lector.nextInt();

            if (respuesta != prod) {
                System.out.println(pierde + "\n" + fin);
            } 
            //NIVEL 3
            else {
                int N = (int) (50 + Math.random() * (100 - 50 + 1));
                System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                        + "la muerte, se equipan con trajes de soldados imperiales que\n"
                        + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                        + "deben averiguar en qué nivel de los " + N + " existentes se encuentra el\n"
                        + "reactor principal. Se dirigen al primer panel computerizado que\n"
                        + "encuentran y la Princesa Leia intenta acceder a los planos de la\n"
                        + "nave pero necesita introducir una clave de acceso. Entonces\n"
                        + "recuerda la información que le proporcionó Lando Calrissian 'La\n"
                        + "clave de acceso a los planos de la nave es el factorial de N/10\n"
                        + "(redondeando N hacia abajo), donde N es el nº de niveles'.\n");
                //factorial de N
                N = N / 10;
                int redond = (int) Math.floor(N);
                int fact = 1;
                for (cont = 1; cont <= redond; cont++) {

                    fact = fact * cont;
                }

                System.out.println("¿Cual es el nivel correcto?");
                respuesta = lector.nextInt();

                if (respuesta != fact) {
                    System.out.println(pierde + "\n" + fin);
                }
                //NIVEL 4
                else {
                    int P = (int) (10 + Math.random() * (100 - 10 + 1));
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n"
                            + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                            + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                            + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                            + "número " + P + " es primo o no.");
                    System.out.println("Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0.");
                    respuesta = lector.nextInt();
                    int a = 0;
                    //calculo numero primo
                    for (int i = 1; i <= P; i++) {
                        if (P % i == 0) {
                            a++;
                        }
                    }
                    //SI P ES PRIMO Y RESPUESTA FALLIDA
                    if (a == 2 && respuesta != 1) {
                        System.out.println(pierde + "\n" + fin);
                    } 
                    //SI P NO ES PRIMO Y RESPUESTA FALLIDA
                    else if (a != 2 && respuesta != 0) {
                        System.out.println(pierde + "\n" + fin);
                    } 
                    //SI P ES PRIMO O NO (SEGUN QUE NUMERO SALGA) Y RESPUESTA ACERTADA
                    //NIVEL 5
                    else if ((a == 2 && respuesta == 1) || (a != 2 && respuesta == 0)) {
                        int M = (int) (5 + Math.random() * (10 - 5 + 1));
                        int S = (int) (5 + Math.random() * (10 - 5 + 1));
                        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                                + "coloque la bomba, programe el temporizador y salir de allí\n"
                                + "corriendo. Necesita programarlo para que explote en exactamente\n"
                                + +M + " minutos y " + S + " segundos, el tiempo suficiente para escapar antes\n"
                                + "de que explote pero sin que el sistema de seguridad antiexplosivos\n"
                                + "detecte y desactive la bomba. Pero el temporizador\n"
                                + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                                + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                                + "factorial de " + M + " y el factorial de " + S + ".");
                        System.out.println("¿Qué valor debe introducir?");
                        respuesta = lector.nextInt();
                        //factorial de M y S
                        int factM = 1;
                        int factS = 1;
                        for (cont = 1; cont <= M; cont++) {
                            factM = factM * cont;
                        }
                        for (int i = 1; i <= S; i++) {
                            factS = factS * i;
                        }
                        int total = factM + factS;

                        if (respuesta != total) {
                            System.out.println(pierde + "\n" + fin);
                        } 
                        //FINAL
                        else {
                            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n"
                                    + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                                    + "corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                                    + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                                    + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                                    + "medida que se alejan observan por la ventana la imagen de la\n"
                                    + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                                    + "desapareciendo para siempre junto a los restos del malvado\n"
                                    + "imperio.\n"
                                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                                    + "Enhorabuena ;D");
                            System.out.println(fin);

                        }
                    }
                }
            }
        }
    }
}

