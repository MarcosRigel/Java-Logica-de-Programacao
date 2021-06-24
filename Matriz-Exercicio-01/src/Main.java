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
