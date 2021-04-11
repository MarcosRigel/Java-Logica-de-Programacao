import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contIn = 0;
		int contOut = 0;

		for(int i = 1; i <= 4; i++) {
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				contIn = contIn + 1;
			} else {
				contOut = contOut + 1;
			}
		}
		
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");
		
		sc.close();
	}

}
