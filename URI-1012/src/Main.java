/* �rea
 * Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
 * d) a �rea do quadrado que tem lado B.
 * e) a �rea do ret�ngulo que tem lados A e B.
 * 
 * Entrada:
 * O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.
 * 
 * Saida:
 * O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas descritas acima, sempre com mensagem
 * correspondente e um espa�o entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.
 * 
 * Exemplos:
 * ------------------------------------------
 * Entrada					Saida
 * ------------------------------------------
 * 3.0 4.0 5.2				TRIANGULO: 7.800
 * 							CIRCULO: 84.949
 * 							TRAPEZIO: 18.200
 * 							QUADRADO: 16.000
 * 							RETANGULO: 12.000
 * ------------------------------------------
 * 12.7 10.4 15.2			TRIANGULO: 96.520
 * 							CIRCULO: 725.833
 * 							TRAPEZIO: 175.560
 * 							QUADRADO: 108.160 
 * 							RETANGULO: 132.080
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		double triangulo = (a * c) /2.0;
		double circulo = pi * Math.pow(c, 2.0);
		double trapezio = (a + b) * c / 2.0;
		double quadrado = Math.pow(b, 2.0);
		double retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}