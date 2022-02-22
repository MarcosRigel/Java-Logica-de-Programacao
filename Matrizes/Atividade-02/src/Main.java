/* Ler um n�mero N e depois uma matriz quadrada NxN com n�meros inteiros. Depois, mostrar na tela a soma dos
 * elementos de cada linha da matriz.
 * 
 * Entrada
 * A entrada cont�m o n�mero N, depois os dados da matriz.
 * 
 * Sa�da
 * A sa�da cont�m os n�meros representando a soma dos elementos de cada linha da matriz.
 * 
 * Exemplo:
 * =============================================================================
 * Entrada                               Sa�da
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
