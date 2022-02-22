/* Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de caa linha. Suponha n�o haver empates
 * Entrada:
 * A entrada cont�m o n�mero N, depois os dados da matriz.
 * Sa�da:
 * A sa�da cont�m os n�meros representando o maior elemento de cada linha da matriz
 * 
 * Exemplo:
 * =============================================================================
 * Entrada									Sa�da
 * =============================================================================
 * 4										12
 * 10 5 12 3								7
 * 4 7 0 6									8
 * 3 3 8 1									15
 * 15 13 4 7
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int cont = 0;
        int[][] mat = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] > cont) {
                    cont = mat[i][j];
                }
            }
            System.out.println(cont);
            cont = 0;
        }
        
        sc.close();
    }
}