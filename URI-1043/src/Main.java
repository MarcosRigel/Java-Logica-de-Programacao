import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, resultado;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        resultado = 0;
        
<<<<<<< HEAD
        if (A < B + C && B < A + C && C < A + B) {
=======
        if (A < B + C && B < A + C && C < B + A) {
>>>>>>> edcc7b52b5548b7accdf0d50250fa1150d72a799
            resultado = A + B + C;
            System.out.printf("Perimetro = %.1f%n", resultado);
        } else {
            resultado = ((A+B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", resultado);
        }
        
        sc.close();
    }
    
}
