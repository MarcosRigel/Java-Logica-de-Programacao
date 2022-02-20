/* Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior n�mero
 * do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento
 * 
 * Exemplo
 * =============================================
 * Entrada							Sa�da
 * =============================================
 * 6								14.0
 * 8.0 4.0 10.0 14.0 13.0 7.0		3
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextDouble();
        }

        double maior = 0.0;
        double proximo = 0.0;
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            proximo = vetor[i];
            if(proximo > maior) {
                maior = proximo;
                posicao = i;
            }
        }
        
        System.out.printf("%.1f%n", maior);
        System.out.println(posicao);
        
        sc.close();
	}

}
