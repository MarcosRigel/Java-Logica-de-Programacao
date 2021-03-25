/* Múltiplos
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 * 
 * Entrada
 * A entrada contém valores inteiros.
 * 
 * Saida
 * A saída deve conter uma das mensagens conforme descrito acima.
 * 
 * Exemplos
 * ----------------------------------------------
 * Entrada						Saida
 * ----------------------------------------------
 * 6 24							Sao Multiplos
 * ----------------------------------------------
 * 6 25							Nao sao Multiplos
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b % a == 0 || a % b == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
