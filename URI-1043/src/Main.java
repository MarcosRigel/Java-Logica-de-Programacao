import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, soma, resultado;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        soma = B + C;
        resultado = 0;
        
        if (soma > A) {
            resultado = A + B + C;
            System.out.printf("Perimetro = %.1f%n", resultado);
        } else {
            resultado = ((A+B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", resultado);
        }
        
        sc.close();
    }
    
}
