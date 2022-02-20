/* Tem-se um conjunto de dados contendo a altura e o sexo (M,F) de N pessoas. Fazer um programa que calcule e escreva:
 * - a maior e a menor altura do grupo
 * - a média de altura das mulheres
 * - o número de homens
 * 
 * Exemplo
 * =============================================================================
 * Entrada									Saída
 * =============================================================================
 * 5										Menor altura = 1.54
 * 1.70 F									Maior altura = 1.83
 * 1.83 M									Media das alturas das mulheres = 1.69
 * 1.54 M									Numero de homens = 2
 * 1.61 F
 * 1.75 F
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetAltura = new double[N];
		char[] vetSexo = new char[N];
		double media = 0.0;
		int numeroMens = 0;
		double cont = 0.0;
		double soma = 0.0;
		
		for(int i = 0; i < N; i++) {
			vetAltura[i] = sc.nextDouble();
			vetSexo[i] = sc.next().charAt(0);
			
			if(vetSexo[i] == 'F') {
				cont = cont + 1;
				soma = soma + vetAltura[i] ; 
			}
			
			if(vetSexo[i] == 'M') {
				numeroMens = numeroMens + 1;
			}
		}
		
		media = soma / cont;
		
		double menor = vetAltura[0];
		double menorIndice = 0.0;
		for (int i =0;i<N;i++) {
			if(vetAltura[i] < menor) {
				menor = vetAltura[i];
				menorIndice = i;
			}
		}
		
		double maior = vetAltura[0];
		double maiorIndice = 0.0;
		for(int i = 0; i < N; i++) {
			if(vetAltura[i] > maior) {
				maior = vetAltura[i];
				maiorIndice = i;
			}
		}
		
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das altura das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + numeroMens);
		
		sc.close();
	}

}
