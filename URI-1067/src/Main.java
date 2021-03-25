/* Números ímpares
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 * 
 * Entrada
 * O arquivo de entrada contém 1 valor inteiro qualquer.
 * 
 * Saida
 * Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 * 
 * Exemplo:
 * --------------------------------
 * Entrada					Saida
 * --------------------------------
 * 8						1
 * 							3
 * 							5
 * 							7
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i < x; i = i + 2) {
			System.out.println(i);	
		}
		
		if(x % 2 == 1) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
