/* Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor.
 * Em seguida, mostrar na tela todos os n�meros negativos lidos.
 * 
 * Exemplo
 * ========================================================================
 * Entrada												Sa�da
 * ========================================================================
 * 6													-2
 * 8 -2 9 10 -3 -7										-3
 * 														-7
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
