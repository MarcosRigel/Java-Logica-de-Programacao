/* Distância Entre Dois Pontos
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
 * mostrando 4 casas decimais após a vírgula, segundo a fórmula:
 * 
 * DistanciaX = Math.pow((x2 - x1), 2.0);
 * DistanciaY = Math.pow((y2 - y1), 2.0);
 * Distancia = Math.sqrt(distanciaX + distanciaY);
 * 
 * Entrada:
 * O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
 * 
 * Saida:
 * Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 * 
 * Exemplo:
 * ------------------------------------------------
 * Entrada						Saida
 * ------------------------------------------------
 * 1.0 7.0						4.4721
 * 5.0 9.0
 * ------------------------------------------------
 * -2.5 0.4						16.1484
 * 12.1 7.3
 * ------------------------------------------------
 * 2.5 -0.4						16.4575
 * -12.2 7.0
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double distanciaX = Math.pow((x2 - x1), 2.0);
		double distanciaY = Math.pow((y2 - y1), 2.0);
		double distancia = Math.sqrt(distanciaX + distanciaY);
		
		System.out.printf("%.4f%n", distancia);
		
		sc.close();
	}

}
