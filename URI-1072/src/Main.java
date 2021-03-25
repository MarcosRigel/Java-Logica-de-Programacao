/* Intervalor 2 
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
 * 
 * Entrada:
 * A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 * 
 * Saida:
 * Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 * 
 * Exemplos:
 * ------------------------------------------------
 * Entrada							Saida
 * ------------------------------------------------
 * 4								2 in
 * 14								2 out
 * 123
 * 10
 * -25
 * 
 */


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contIn = 0;
		int contOut = 0;

		for(int i = 1; i <= 4; i++) {
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				contIn = contIn + 1;
			} else {
				contOut = contOut + 1;
			}
		}
		
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");
		
		sc.close();
	}

}
