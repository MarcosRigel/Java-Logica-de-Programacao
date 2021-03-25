/* Lanche
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. 
 * 
 * codigo	especificacao		preço
 * 1		cachorro-quente		R$4.00
 * 2		x-salada			R$4.50
 * 3		x-bacon				R$5.00
 * 4		torrada simples		R$2.00
 * 5		refrigerante		R$1.50
 * 
 * Entrada
 * O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
 * 
 * Saida
 * O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 * 
 * Exemplos:
 * ------------------------------------------------
 * Entrada						Saída
 * ------------------------------------------------
 * 3 2 							Total: R$ 10.00
 * ------------------------------------------------
 * 4 3							Total: R$ 6.00
 * ------------------------------------------------
 * 2 3							Total: R$ 13.50
 * 
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x = 0;
		
		if(a == 1) {
			x = 2.0;
		} 
		if (a == 2) {
			x = 4.50; 
		} 
		if (a == 3) {
			x = 5.00;
		} 
		if(a == 4) {
			x = 2.00;
		} 
		if(a == 5) {
			x = 1.50;
		}

		double result = x * b;
		System.out.printf("Total: R$ %.2f%n", result);
		
		sc.close();
	}

}
