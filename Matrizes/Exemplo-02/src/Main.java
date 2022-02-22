/* Fazer um programa para ler um n�mero inteiro N e uma matriz quadrada de ordem N contendo
 * n�meros inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos
 * da matriz.
 * 
 * Exemplo
 * =============================================================================
 * Entrada							Sa�da
 * =============================================================================
 * 3								DIAGONAL PRINCIPAL:
 * 5 -3 10							5 8 -4
 * 15 8 2							QUANTIDADE DE NEGATIVOS = 2
 * 7 9 -4
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] mat = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i=0; i<N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] < 0) {
					cont = cont + 1;
				}
			}
		}
		
		System.out.print("QUANTIDADE DE NEGATIVOS = " + cont);
		
		sc.close();
	}

}