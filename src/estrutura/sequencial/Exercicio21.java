//21. Fa�a um programa que receba o n�mero de horas trabalhadas, o valor do sal�rio m�nimo e o n�mero de horas extras trabalhadas, 
//    calcule e mostre o sal�rio a receber, de acordo com as regras a seguir:
//    a) a hora trabalhada vale 1/8 do sal�rio m�nimo;
//    b) a hora extra vale 1/4 do sal�rio m�nimo;
//    c) o sal�rio bruto equivale ao n�mero de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//    d) a quantia a receber pelas horas extras equivale ao n�mero de horas extras trabalhadas multiplicado pelo valor da hora extra;
//    e) o sal�rio a receber equivale ao sal�rio bruto mais a quantia a receber pelas horas extras.

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
		System.out.println("Digite o valor do sal�rio m�nimo: ");
		salarioMin = input.nextDouble();
		
		valorHora = salarioMin / 8;
		valorExtra = salarioMin / 4;
		
		salarioBruto = horasTrab * valorHora;
		
		salarioFinal = salarioBruto + (valorExtra * horasExtra);
		
		System.out.println("Sal�rio Final: R$ "+salarioFinal);
		
		input.close();
	}
}
