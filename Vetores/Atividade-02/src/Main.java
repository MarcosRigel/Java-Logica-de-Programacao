/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
 * - todos os números pares
 * - a quantidade de números pares
 * 
 * Exemplo:
 * -------------------------------------------------------
 * Entrada:									Saida:
 * -------------------------------------------------------
 * 6										8 2 14 20
 * 8 2 11 14 13 20							4
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		int qtdPares = 0;
		
		for(int i=0;i<N;i++) {
			vet[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i]);
				System.out.print(" ");
				qtdPares = qtdPares + 1;
			}
		}
		
		System.out.println();
		System.out.println(qtdPares);
		
		sc.close();
	}

}
