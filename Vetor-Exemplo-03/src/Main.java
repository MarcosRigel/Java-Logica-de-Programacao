import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        double media = 0;
        int N = sc.nextInt();
        double[] vet = new double[N];
        
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
            soma = soma + vet[i];
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
        
        media = soma / N;
        
        System.out.println();
        System.out.printf("%.2f%n", soma);
        System.out.printf("%.2f%n", media);
        
        
        
        sc.close();
    }
    
}
