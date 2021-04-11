import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
		for(int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}
		
		int maiorIdade = idades[0];
		String nomeMaisVelho = nomes[0];
		for(int i = 0; i < N; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				nomeMaisVelho = nomes[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomeMaisVelho);
		
		sc.close();
	}

}
