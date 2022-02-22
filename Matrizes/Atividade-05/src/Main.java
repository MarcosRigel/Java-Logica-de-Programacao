/* Fazer um programa para ler duas matrizes de n�meros inteiros A e B, contendo de M linhas e N colunas cada. Depois,
 * gerar uma terceira matriz C onde cada elemento desta � a soma dos elementos correspondentes das matrizes originais.
 * Imprimir na tela a matriz gerada.
 * 
 * Entrada:
 * A entrada cont�m os valores de M e N, depois os valores a primeira matriz A, depois os valores da segunda matriz B,
 * conforme exemplo.
 * 
 * Sa�da:
 * A sa�da cont�m os valores da matriz gerada C, conforme exemplo.
 * 
 * Exemplo
 * =============================================================================
 * Entrada									Sa�da
 * =============================================================================
 * 2 3										5 9 7
 * 3 5 2									5 13 9
 * 4 5 1
 * 2 4 5
 * 1 8 8
 * 
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int M = sc.nextInt();
       int N = sc.nextInt();
       
       int[][] A = new int[M][N];
       int[][] B = new int[M][N];
       int[][] C = new int[M][N];
       
       for (int i = 0; i < M; i++) {
           for (int j = 0; j < N; j++) {
               A[i][j] = sc.nextInt();
           }
       }
       
       for (int i = 0; i < M; i++) {
           for (int j = 0; j < N; j++) {
               B[i][j] = sc.nextInt();
           }
       }
       
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
       
       sc.close();
    }
}