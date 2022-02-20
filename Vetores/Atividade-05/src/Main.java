/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente
 * dos números pares lidos.
 * 
 * Exemplo
 * ==============================================================================
 * Entrada										Saída
 * ==============================================================================
 * 6											11.0
 * 8 2 11 14 13 20
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
			soma = soma + vet[i];
		}
		
		double media = soma / N;
		System.out.println(media);
		
		sc.close();
	}

}
