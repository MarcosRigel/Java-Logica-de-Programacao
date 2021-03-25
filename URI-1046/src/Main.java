/* Tempo de Jogo
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * Entrada
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 * 
 * Saida
 * Apresente a duração do jogo conforme exemplo abaixo.
 * 
 * Exemplo
 * -----------------------------------------------------
 * Entrada						Saida
 * -----------------------------------------------------
 * 16 2 						O JOGO DUROU 10 HORA(S)
 * -----------------------------------------------------
 * 0 0							O JOGO DUROU 24 HORA(S)
 * -----------------------------------------------------
 * 2 16 						O JOGO DUROU 14 HORAS(S)
 * 
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int horaTotal = 0;
		
		if (horaInicial < horaFinal)
        {
            horaTotal = horaFinal - horaInicial;
        }
        else {
            horaTotal = 24 - horaInicial + horaFinal;
        }
		
		System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
		
		sc.close();
	}

}
