package sequencial;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horasTrab, horasExtra;
		double salarioMin, salarioFinal, salarioBruto, valorHora, valorExtra;
		
		System.out.println("Digite as horas trabalhadas: ");
		horasTrab = input.nextInt();
		
		System.out.println("Digite a hora extra trabalhada: ");
		horasExtra = input.nextInt();
		
		System.out.println("Digite o valor do salário mínimo: ");
		salarioMin = input.nextDouble();
		
		valorHora = salarioMin / 8;
		valorExtra = salarioMin / 4;
		
		salarioBruto = horasTrab * valorHora;
		
		salarioFinal = salarioBruto + (valorExtra * horasExtra);
		
		System.out.println("Salário Final: R$ " + salarioFinal);
		
		input.close();
	}
}
