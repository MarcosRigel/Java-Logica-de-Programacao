/* Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
 * Ao final mostrar uma mensagem com os nomes e a idade m�dia entre essas pessoas,
 * com uma casa decimal, conforme exemplo.
 * 
 * Exemplo:
 * ==============================================================
 * Entrada					Sa�da
 * ==============================================================
 * Maria 19					A idade m�dia de Maria e Joaquim � de			
 * Joaquim 20				19.5 anos
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double) (idade1 + idade2) / 2;
		
		System.out.printf("A idade m�dia de %s e %s � de %.1f anos", nome1, nome2, media);
		
		sc.close();
	}

}
