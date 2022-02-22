/* Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar 
 * na tela somente os números negativos da matriz.
 * 
 * Entrada
 * A entrada contém os números M e N na mesma linha, depois os dados da matriz.
 * 
 * Saída
 * A saida contém uma mensagem e depois os números negativos da matriz, conforme exemplo.
 * 
 * Exemplo
 * =============================================================================
 * Entrada						Saída
 * =============================================================================
 * 2 3 							VALORES NEGATIVOS:
 * 12 -8 5						-8
 * -13 10 -6					-13
 * 								-6
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int[][] MxN = new int[M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                MxN[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("VALORES NEGATIVOS: ");
         for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (MxN[i][j] < 0) {
                    System.out.println(MxN[i][j]);
                }
            }
        }
        
        sc.close();
    }
    
}
