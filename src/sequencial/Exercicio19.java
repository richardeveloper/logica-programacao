package sequencial;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double lado1, lado2, area, potencia;
		
		System.out.println("Digite o valor da primeira dimensão: ");
		lado1 = input.nextDouble();
		
		System.out.println("Digite o valor da segunda dimensão: ");
		lado2 = input.nextDouble();
		
		area = lado1 * lado2;
		System.out.println("Dimensão do comôdo: " + area + " m²");
		
		potencia = area * 18;
		System.out.println("Potência de iluminação: " + potencia + " W");
		
		input.close();
	}
}
