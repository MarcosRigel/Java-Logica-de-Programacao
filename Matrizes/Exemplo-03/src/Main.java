/* Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz de M linhas e N colunas contendo números double.
 * Gerar um vetor de modo que cada elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
 * Mostrar o vetor gerado
 * 
 * Exemplo
 * =============================================================================
 * Entrada                               Saída
 * =============================================================================
 * 2 3 									 25.0
 * 7.0 8.0 10.0                          10.0
 * 2.0 3.0 5.0
 * 
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		double[][] numeros = new double[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				numeros[i][j] = sc.nextDouble();
			}
		}
		
		double[] vet = new double[M];
		
		for (int i=0; i<M; i++) {
			double soma = 0.0;
			for (int j=0; j<N; j++) {
				soma = soma + numeros[i][j];
			}
			vet[i] = soma;
		}
		
		for (int i=0; i<M; i++) {
			System.out.printf("%.1f%n", vet[i]);
		}
		
		sc.close();
	}

}
