/* Aumento de Salário
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
 * 
 * Salario						Percentual de Reajuste
 * 0 - 400.00						15%
 * 400.01 - 800.00					12%
 * 800.01 - 1200.00					10%
 * 1200.01 - 2000.00				7%
 * Acima de 2000.00					4%
 * 
 * Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
 * Entrada
 * A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 * 
 * Saída
 * Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
 * 
 * Exemplo
 * ------------------------------------------------------
 * Entrada							Saida
 * ------------------------------------------------------
 * 400.00							Novo salario: 460.00
 * 									Reajuste ganho: 60.00
 * 									Em percentual: 15 %
 * -------------------------------------------------------
 * 800.01							Novo salario: 880.01
 * 									Reajuste ganho: 80.00
 * 									Em percentual: 10 %
 * -------------------------------------------------------
 * 2000.00							Novo salario: 2140.00
 * 									Reajuste ganho: 140.00
 * 									Em percentual: 7 %
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double reajusteGanho = 0.0;
		double novoSalario = 0.0;
		
		 if (salario == 0 || salario == 400.00) {
             reajusteGanho = salario * 0.15;
             novoSalario = salario + reajusteGanho;
             System.out.printf("Novo salario: %.2f%n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
             System.out.printf("Em percentual: 15%");
         }

         if (salario == 400.01 || salario == 800.00) {
             reajusteGanho = salario * 0.12;
             novoSalario = salario + reajusteGanho;
             System.out.printf("Novo salario: %.2f%n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
             System.out.printf("Em percentual: 12%");
         }

         if (salario == 800.01 || salario == 1200.00) {
             reajusteGanho = salario * 0.10;
             novoSalario = salario + reajusteGanho;
             System.out.printf("Novo salario: %.2f%n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
             System.out.printf("Em percentual: 10%");
         }

         if (salario == 1200.01 || salario == 2000.00) {
             reajusteGanho = salario * 0.07;
             novoSalario = salario + reajusteGanho;
             System.out.printf("Novo salario: %.2f%n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
             System.out.printf("Em percentual: 7%");
         }

         if (salario > 2000.00) {
             reajusteGanho = salario * 0.04;
             novoSalario = salario + reajusteGanho;
             System.out.printf("Novo salario: %.2f%n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
             System.out.printf("Em percentual: 4%");
         }
		
		sc.close();
	}

}
