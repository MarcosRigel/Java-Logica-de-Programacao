/* Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos
 * elementos de cada linha da matriz.
 * 
 * Entrada
 * A entrada contém o número N, depois os dados da matriz.
 * 
 * Saída
 * A saída contém os números representando a soma dos elementos de cada linha da matriz.
 * 
 * Exemplo:
 * =============================================================================
 * Entrada                               Saída
 * =============================================================================
 * 3									11 
 * 5 2 4								19
 * 10 3 6								29
 * 9 8 12
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int soma = 0;
        
        int[][] mat = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                soma = soma + mat[i][j];
            }
            System.out.println(soma);
            soma = 0;
        }
        
        sc.close();
    }
    
}
