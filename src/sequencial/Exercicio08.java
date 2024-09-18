package sequencial;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pesoKilos, pesoGramas;
		
		System.out.println("Digite o peso (Kg): ");
		pesoKilos = input.nextDouble();
		
		pesoGramas = pesoKilos * 1000;
		
		System.out.println("Peso em grama: " + pesoGramas);
		
		input.close();
	}
}
