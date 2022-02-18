/* Fazer um programa para ler um valor N e depois o nome de N pessoas.
 * Em seguida, mostrar os nomes lidos.
 * 
 * ==================================================
 * Entrada						Saída
 * ==================================================
 * 3							Nomes lidos:
 * Maria						Maria
 * Joaquim						Joaquim
 * Ana							Ana
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("Nomes lidos:");
		for (String s : nomes) {
			System.out.println(s);
		}
		
		sc.close();

	}

}
