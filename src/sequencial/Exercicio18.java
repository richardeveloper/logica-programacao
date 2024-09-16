package sequencial;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celsius, fahreheit;
		
		System.out.println("Digite uma temperatura (�C): ");
		celsius = input.nextDouble();
		
		fahreheit = 180 * (celsius + 32)/100;
		
		System.out.println("Temperatura em Fahrenheit: " + fahreheit + "º");
		
		input.close();
	}
}
