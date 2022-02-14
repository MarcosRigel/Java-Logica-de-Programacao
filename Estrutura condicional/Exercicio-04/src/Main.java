import java.util.Scanner;

/* Fazer um programa para ler tr�s n�meros inteiros. Em seguida, mostrar qual o menor dentre os
 * tr�s n�meros lidos. Em caso de empate, mostrar apenas uma vez.
 * 
 * Exemplos:
 * =================================================
 * Entrada							Sa�da
 * =================================================
 * 7 3 8							MENOR = 3
 * =================================================
 * 5 12 5							MENOR = 5
 * =================================================
 * 9 9 9							MENOR = 9
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		}
		else if (b < c) {
			System.out.println("MENOR = " + b);
		}
		else {
			System.out.println("MENOR = " + c);
		}
		
		sc.close();
	}

}
