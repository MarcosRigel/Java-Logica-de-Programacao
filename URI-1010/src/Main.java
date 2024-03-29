/* C�lculo Simples
 * Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.


 * Entrada
 * O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 * 
 * Saida
 * A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.
 * 
 * Exemplos:
 * ----------------------------------------------------
 * Entrada						Saida
 * ----------------------------------------------------
 * 12 1 5.30					VALOR A PAGAR: R$ 15.50
 * 16 2 5.10
 * ----------------------------------------------------
 * 13 2 15.30					VALOR A PAGAR: R$ 51.40
 * 161 4 5.20
 * ----------------------------------------------------
 * 1 1 15.10					VALOR A PAGAR: R$ 30.20
 * 2 1 15.10
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		int peca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double valorPagar = ((valorUnitario1 * numeroPeca1) + (valorUnitario2 * numeroPeca2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		sc.close();

	}

}
