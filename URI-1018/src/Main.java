/* Células
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
 * A seguir mostre o valor lido e a relação de notas necessárias.
 * 
 * Entrada:
 * O arquivo de entrada contém um valor inteiro N (0 < N < 100000).
 * 
 * Saida:
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
 * Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 * 
 * Exemplo:
 * ----------------------------------------------------------------
 * Entrada									Saida
 * ----------------------------------------------------------------
 * 576										576
 * 											5 nota(s) de R$ 100,00
 * 											1 nota(s) de R$ 50,00
 * 											1 nota(s) de R$ 20,00
 * 											0 nota(s) de R$ 10,00
 * 											1 nota(s) de R$ 5,00
 * 											0 nota(s) de R$ 2,00
 * 											1 nota(s) de R$ 1,00
 * ----------------------------------------------------------------
 * 11257									11257
 * 											112 nota(s) de R$ 100,00
 * 											1 nota(s) de R$ 50,00
 * 											0 nota(s) de R$ 20,00
 * 											0 nota(s) de R$ 10,00
 * 											1 nota(s) de R$ 5,00
 * 											1 nota(s) de R$ 2,00
 * 											0 nota(s) de R$ 1,00
 * -----------------------------------------------------------------
 * 503 										503
 * 											5 nota(s) de R$ 100,00
 * 											0 nota(s) de R$ 50,00
 * 											0 nota(s) de R$ 20,00
 * 											0 nota(s) de R$ 10,00
 * 											0 nota(s) de R$ 5,00
 * 											1 nota(s) de R$ 2,00
 * 											1 nota(s) de R$ 1,00
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println(x);
		System.out.println(x / 100 + " nota(s) de R$ 100,00");
		x = x % 100;
		System.out.println(x / 50 + " nota(s) de R$ 50,00");
		x = x % 50;
		System.out.println(x / 20 + " nota(s) de R$ 20,00");
		x = x % 20;
		System.out.println(x / 10 + " nota(s) de R$ 10,00");
		x = x % 10;
		System.out.println(x / 5 + " nota(s) de R$ 5,00");
		x = x % 5;
		System.out.println(x / 2 + " nota(s) de R$ 2,00");
		x = x % 2;
		System.out.println(x / 1 + " nota(s) de R$ 1,00");
		
		sc.close();
	}

}
