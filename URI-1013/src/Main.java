/* O Maio
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
 * MaiorAB = (a+b+abs(a-b)) / 2
 * 
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
 * 
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 * 
 * Saida
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 * 
 * Exemplos:
 * ---------------------------------------
 * Entrada					Saida
 * ---------------------------------------
 * 7 14 106					106 eh o maior
 * ---------------------------------------
 * 217 14 6					217 eh o maior
 * 
 */


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorab = (a + b + Math.abs(a - b)) / 2;
		int maiorc = (maiorab + c + Math.abs(maiorab - c)) / 2;
		
		System.out.println(maiorc + " eh o maior");
		
		sc.close();
	}

}
