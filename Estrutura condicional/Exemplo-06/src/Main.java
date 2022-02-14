/* Fazer um progrma para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente, conforme exemplos.
 * 
 * Exemplo
 * =========================================================
 * Entrada						Sa�da
 * =========================================================
 * 1							Dia da semana: domingo
 * =========================================================
 * 4							Dia da semana: quarta
 * =========================================================
 * 9							Dia da seman: valor inv�lido
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
	
		default: dia = "valor invalido";
			
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
		
	}

}
