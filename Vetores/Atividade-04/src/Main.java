/* Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos
 * elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.
 * 
 * Exemplo
 * =============================================================================
 * Entrada									Saída
 * =============================================================================
 * 4										12.125
 * 10.0 15.5 13.2 9.8						10.0
 * 											9.8
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[(int) N];
		double soma = 0.0;
		
		for(int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		
		double media = soma / N;
		System.out.println(media);
		
		for(int i = 0; i<N;i++) {
			if(vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
