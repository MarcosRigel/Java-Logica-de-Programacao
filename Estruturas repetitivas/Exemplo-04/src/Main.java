/* Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros. Ao final, mostrar a soma
 * dos N n�meros lidos
 * 
 * Exemplo
 * =====================================
 * Entrada					Sa�da
 * =====================================
 * 3						11
 * 5
 * 2
 * 4
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
