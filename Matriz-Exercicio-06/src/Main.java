import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[][] mat = new double[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        
        System.out.print("SOMA DOS POSITIVOS: ");
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] > 0) {
                    soma = soma + mat[i][j];
                }
            }
        }
        
        int x = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(mat[x][j] + " ");
            }
        }
        
        int y = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(mat[i][y]);
            }
        }
        
        
        sc.close();
    }
}