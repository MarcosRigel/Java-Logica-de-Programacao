/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
 * do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
 * 
 * Exemplo:
 * -----------------------------------------------------------
 * Entrada:										Saida:
 * -----------------------------------------------------------
 * 6											14.0
 * 8.0 4.0 10.0 14.0 13.0 7.0					3
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0;i<n;i++) {
			vet[i] = sc.nextDouble();
		}
		
		double maior = vet[0];
		double maiorIndice = 0.0;
		for(int i = 1; i < n; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				maiorIndice = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(maiorIndice);
		
		sc.close();
	}

}
