/* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C
 * onde cada elemeto de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 * 
 * Exemplo:
 * =============================================================================
 * Entrada											Saída
 * =============================================================================
 * 6												13 12 14 15 23 27
 * 8 2 11 14 13 20
 * 5 10 3 1 10 7
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vetA = new int[N];
		int[] vetB = new int[N];
		int[] vetC = new int[N];
		
		for(int i = 0; i < N; i++) {
			vetA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			vetB[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(vetC[i]);
			System.out.print(" ");
		}
		
		sc.close();
	}

}
