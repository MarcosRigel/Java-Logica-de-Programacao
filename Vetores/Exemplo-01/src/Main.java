/* Fazer um programa para ler um número inteiro positivo N, depois ler N números quaisquer e armazená-los em um vetor.
 * Em seguida, mostrar na tela todos elementos do vetor.
 * 
 * Exemplo
 * =========================================================
 * Entrada								Saída
 * =========================================================
 * 4									10.5
 * 10.5									4.2
 * 4.2									-7.1
 * -7.1									15.0
 * 15.0
 * 
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		for (int i=0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
 		
		for (int i=0; i< N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		
		sc.close();
		
	}

}