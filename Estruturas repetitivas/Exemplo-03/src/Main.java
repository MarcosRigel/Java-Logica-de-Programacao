/* Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a idade de um indiv�duo.
 * O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor de idade negativa. Calcular e imprimir a idade m�dia
 * deste grupo de indiv�duos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
 * 
 * Exemplos:
 * ====================================================
 * Entrada							Sa�da
 * ====================================================
 * 31								34.67
 * 27
 * 46
 * -5
 * ====================================================
 * -10								impossivel calcular
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("impossivel calcular");
		}
		
		sc.close();

	}

}
