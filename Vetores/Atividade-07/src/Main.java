/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1 e 2 semestres.
 * Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando
 * aprovados aqueles cuja média das notas seja igual a seis.
 * 
 *  Exemplo
 *  ====================================================================================================
 *  Entrada									Saída
 *  ====================================================================================================
 *  4										Alunos aprovados:
 *  Joao 7.0 8.5							Joao
 *  Maria 9.2 6.5							Maria 
 *  Carlos 5.0 6.0							Teresa
 *  Teresa 5.5 6.5
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] vetNomes = new String[N];
		double[] vetNota1 = new double[N];
		double[] vetNota2 = new double[N];
		double media = 0.0;
		
		for(int i = 0; i < N; i++) {
			vetNomes[i] = sc.next();
			vetNota1[i] = sc.nextDouble();
			vetNota2[i] = sc.nextDouble();

		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < N; i++) {
			media = (vetNota1[i] + vetNota2[i]) / 2.0;
			if(media >= 6.0) {
				System.out.println(vetNomes[i]);
			}
		}
		
		sc.close();
	}

}
