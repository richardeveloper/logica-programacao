//21. Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número de horas extras trabalhadas, 
//    calcule e mostre o salário a receber, de acordo com as regras a seguir:
//    a) a hora trabalhada vale 1/8 do salário mínimo;
//    b) a hora extra vale 1/4 do salário mínimo;
//    c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//    d) a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor da hora extra;
//    e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras.

package estrutura.sequencial;

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
		
		System.out.println("Salário Final: R$ "+salarioFinal);
		
		input.close();
	}
}
