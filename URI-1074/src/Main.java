/* Par ou Ímpar
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). 
 * No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
 * 
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 * 
 * Saida
 * Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 * 
 * Exemplos:
 * ----------------------------------------------
 * Entrada						Saida
 * ----------------------------------------------
 * 4							ODD NEGATIVE
 * -5							NULL
 * 0							ODD POSITIVE
 * 3							EVEN NEGATIVE
 * -4
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		while(n > cont) {
			int x = sc.nextInt();
			
			if(x == 0) {
				System.out.println("NULL");
			} else if(x > 0) {
				if(x % 2 == 0) {
				System.out.println("EVEN POSITIVE");
				}
				else {
					System.out.println("ODD POSITIVE");
				}
			}
			else {
				if(x % 2 == 0) {
					System.out.println("EVEN NEGATIVE");
				} else {
					System.out.println("ODD NEGATIVE");
				}
			}
			
			cont++;
		}
		
		sc.close();
	}

}
