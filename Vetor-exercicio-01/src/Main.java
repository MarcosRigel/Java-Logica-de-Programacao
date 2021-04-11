import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0;i<n;i++) {
			vet[i] = sc.nextDouble();
		}
		
		double maior = vet[0];
		double maiorIndice = 0.0;
		for(int i = 1; i < n; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				maiorIndice = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(maiorIndice);
		
		sc.close();
	}

}
