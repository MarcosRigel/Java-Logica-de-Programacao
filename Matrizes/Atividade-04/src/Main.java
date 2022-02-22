/* Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.
 * 
 * Entrada:
 * A entrad cont�m o valor N, depois os dados da matriz.
 * 
 * Sa�da:
 * A sa�da cont�m a soma dos elementos da diagonal principal.
 * 
 * Exemplo
 * =============================================================================
 * Entrada								Sa�da
 * =============================================================================
 * 3									12
 * 10 3 2
 * 5 15 7
 * 8 6 4
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] mat = new int[N][N];
        int soma = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
                soma = soma + mat[i][i];
        }
        System.out.println(soma);
        
        sc.close();
    }
    
}
