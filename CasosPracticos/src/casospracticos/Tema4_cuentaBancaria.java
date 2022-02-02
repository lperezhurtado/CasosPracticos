package casospracticos;

import java.util.Scanner;

public class Tema4_cuentaBancaria {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		// variables principales
		int cont = 0;
		int max = 100;
		String[] nombres = new String[max];
		double[] saldo = new double[max];
		double movimiento;
		boolean salir = false;
		int opcion, selector;

		// bucle pricipal de opciones
		do {
			System.out.println("\n");
			System.out.println("Lista opciones:" + "\t");
			System.out.println("1. Ver cuentas" + "\t");
			System.out.println("2. Ingresar dinero" + "\t");
			System.out.println("3. Retirar dinero" + "\t");
			System.out.println("4. Agregar cuenta" + "\t");
			System.out.println("5. Eliminar cuenta" + "\t");
			System.out.println("6. Buscar cuenta" + "\t");
			System.out.println("7. Mostrar morosos" + "\t");
			System.out.println("8. Salir" + "\n");
			System.out.print("Elige: ");

			opcion = lector.nextInt();

			// segun la opcion elegida, el swith hará una cosaa u otra
			switch (opcion) {
			case 1: {
				System.out.println("Lista de cuentas" + "\t");

				if (nombres[0] == null) {
					System.out.println("No hay cuentas");
				} else {
					// recorrerá los arrays enseñando todos sus valores
					for (int i = 0; i < cont; i++) {
						System.out.println(i + ". " + nombres[i] + " Saldo: " + saldo[i] + " €");
					}
				}
			}
				break;

			case 2: {
				System.out.println("Ingreso: " + "\n");
				System.out.println("En que cuenta?: ");
				selector = lector.nextInt();

				System.out.println("Cantidad?: ");
				movimiento = lector.nextDouble();

				saldo[selector] += movimiento;
			}
				break;

			case 3: {
				System.out.println("Retiro: " + "\n");
				System.out.println("En que cuenta?: ");
				selector = lector.nextInt();

				System.out.println("Cantidad?: ");
				movimiento = lector.nextDouble();

				saldo[selector] -= movimiento;
			}
				break;

			case 4:
				/*
				 * se añadirá un nuevo nombre y saldo en la posición CONT y CONT sumará 1 para
				 * la siguiente posición de los arrays
				 */

				if (cont < max) {
					lector.nextLine();
					System.out.print("Nombre?: ");
					nombres[cont] = lector.nextLine();

					System.out.print("Saldo?: ");
					saldo[cont] = lector.nextInt();

					cont++;
					System.out.println("Cuenta agregada");
				} else {
					System.out.println("Lista de cuentas llena");
				}

				break;

			case 5: {
				System.out.println("Cuenta a borrar?: ");
				selector = lector.nextInt();
				/*
				 * recoorerá el array desde la posicion SELECTOR, cambiando nombres y saldo en
				 * esa posicion, por la siguiente posicion
				 */
				for (int i = selector; i < cont - 1; i++) {
					nombres[i] = nombres[i + 1];
					saldo[i] = saldo[i + 1];

				}
				cont--;
				System.out.println("Cuenta borrada");
			}
				break;

			case 6: {
				// variables que solo se utilizan en CASE 6
				String busc;
				int totalbusc = 0;
				lector.nextLine();

				System.out.print("Nombre de la cuenta a buscar?: ");
				busc = lector.nextLine();

				// recorrera el array buscando valores que contengan BUSC
				for (int i = 0; i < cont; i++) {
					int numero = nombres[i].indexOf(busc);

					if (numero != -1) {

						System.out.println(i + ". " + nombres[i] + " Saldo: " + saldo[i] + "\t");
						totalbusc++;
					}
				}
				if (totalbusc == 0) {
					System.out.println("No se han encontrado cuentas");
				}

			}
				break;

			case 7: {
				System.out.println("Lista de morosos" + "\n");

				// recorrera el array SALDO en busca de valores negativos
				for (int i = 0; i < cont; i++) {
					if (saldo[i] < 0) {
						System.out.println(i + ". " + nombres[i] + " Saldo: " + saldo[i] + "\t");
					}

				}

			}
				break;

			case 8: {
				/*
				 * si se elige 8, el boolean SALIR se convierte a true y termina el bucle
				 */
				salir = true;
				System.out.println("Has salido");
			}
				break;

			}
			System.out.println("\n");

		} while (opcion != 8); // bucle principal se repite mientras no se elija 8

	}

}
