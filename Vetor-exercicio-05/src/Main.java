import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
			soma = soma + vet[i];
		}
		
		double media = soma / N;
		System.out.println(media);
		
		sc.close();
	}

}
