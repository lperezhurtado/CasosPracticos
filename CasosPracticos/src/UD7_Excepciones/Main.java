package UD7_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Banco banco = new Banco();

        double s;
        int p;
        int opcion = 0;
        String n;

        do {
            try {
                do {
                    System.out.println("MENU  \n"
                            + "1. Ver cuentas \n"
                            + "2. Ingresar dinero \n"
                            + "3. Retirar dinero \n"
                            + "4. Transferencia \n"
                            + "5. Agregar cuenta \n"
                            + "6. Eliminar cuenta \n"
                            + "7. Buscar cuenta \n"
                            + "8. Mostrar morosos \n"
                            + "9. Salir \n");

                    opcion = lector.nextInt();

                    switch (opcion) {
                        case 1:
                            banco.imprimirTodo();

                            break;
                        case 2:
                    try {
                            System.out.println("Numero de cuenta?");
                            p = lector.nextInt();
                            System.out.println("Cantidad?");
                            s = lector.nextDouble();
                            banco.ingresar(p, s);
                        } catch (InputMismatchException i) {
                            System.err.println("Formato no valido");
                            lector.nextLine();
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                            lector.nextLine();
                        }

                        break;
                        case 3:
                    
                    try {
                            System.out.println("Numero de cuenta?");
                            p = lector.nextInt();
                            System.out.println("Cantidad?");
                            s = lector.nextDouble();
                            banco.retirar(p, s);
                        } catch (InputMismatchException i) {
                            System.err.println("Formato no valido");
                            lector.nextLine();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            lector.nextLine();
                        }

                        break;
                        case 4:
                    
                    try {
                            System.out.println("Cuenta de origen?");
                            int cO = lector.nextInt();
                            System.out.println("Cuenta de destino?");
                            int cD = lector.nextInt();
                            System.out.println("Cantidad?");
                            s = lector.nextDouble();

                            banco.transferencia(cO, cD, s);
                        } catch (InputMismatchException i) {
                            System.out.println("Formato no valido");
                            lector.nextLine();
                        }

                        break;
                        case 5:
                    
                    try {
                            lector.nextLine();
                            System.out.println("Nombre?");
                            n = lector.nextLine();
                            System.out.println("Saldo?");
                            s = lector.nextDouble();

                            banco.agregarCuenta(n, s);
                        } catch (InputMismatchException i) {
                            System.out.println("Formato no valido");
                            lector.nextLine();
                        }

                        break;
                        case 6:
                    try {
                            System.out.println("Numero de cuenta?");
                            p = lector.nextInt();

                            banco.eliminarCuenta(p);
                        } catch (InputMismatchException i) {
                            System.out.println("Formato no valido");
                        }
                        break;
                        case 7:
                            lector.nextLine();
                            System.out.println("Nombre a buscar?");
                            n = lector.nextLine();

                            banco.buscarCuenta(n);

                            break;
                        case 8:

                            banco.morosos();
                            break;

                        case 9:
                            System.out.println("HASTA LUEGO");

                            break;
                    }
                } while (opcion != 9);

            } catch (InputMismatchException i) {
                System.out.println("Formato no valido");
                lector.nextLine();
            }

        } while (opcion != 9);
    }
}
