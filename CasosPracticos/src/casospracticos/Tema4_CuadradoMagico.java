package casospracticos;

import java.util.Scanner;

public class Tema4_CuadradoMagico {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		// variables principales
		int n;
		int[][] matriz;
		int numero;
		int result = 0;
		int diag1, diag2;
		
		//arrays para almacenar resultados de filas y columnas individuales
		int[] totalfila;
		int[] totalcol;
		
		System.out.println("numero de filas y columnas?: ");
		n = lector.nextInt();
		matriz = new int[n][n];
		totalfila = new int[n];
		totalcol = new int[n];
		
		
		// bucle anidado para introducir valores en la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print("Introduce un numero: ");
				numero = lector.nextInt();

				matriz[i][j] = numero;
			}
		}

		
		System.out.println("\t");
		System.out.println("MATRIZ");
		// bucle anidado para mostrar la matriz y resultado de suma de filas
		for (int i = 0; i < matriz.length; i++) {
			result = 0;

			for (int j = 0; j < n; j++) {
				result += matriz[i][j];
				System.out.print(matriz[i][j] + " ");
			}
			totalfila[i] = result;
			System.out.print("  " + result);
			System.out.println("\t");
		}

		System.out.println("\t");
		

		// bucle anidado para mostrar resultado suma de columnas
		for (int i = 0; i < matriz.length; i++) {
			result = 0;
			for (int j = 0; j < n; j++) {
				result += matriz[j][i];
			}
			totalcol[i] = result;
			System.out.print(result + " ");

		}

		System.out.println("\n");
		

		// bucle para saber resultado de diagonal 1
		result = 0;
		for (int i = 0; i < n; i++) {

			result += matriz[i][i];
		}
		diag1 = result;

		System.out.println("diagonal 1 = " + result);
		

		// bucle para saber resultado de diagonal 2
		result = 0;
		for (int i = 0; i < n; i++) {

			result += matriz[i][(n-1) - i];
		}
		diag2 = result;

		System.out.println("diagonal 2 = " + result + "\n");
		
		
		// condicional para saber si todos los resultados coinciden 
		if (totalfila[0] == result && totalcol[0] == result && diag1 == result && diag2 == result) {
			System.out.println("ES UN CUADRADO MAGICO!");

		} else {
			System.out.println("NO ES UN CUADRADO MAGICO");
		}

	}

}

