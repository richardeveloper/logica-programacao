package br.com.estruturas.sequencial;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double peso, pesoEngordar, pesoEmagrecer;
		
		System.out.println("Digite o peso (Kg): ");
		peso = input.nextDouble();
		
		pesoEngordar = peso + (peso * 0.15);
		
		System.out.println("Caso engorde 15% do peso: " + pesoEngordar + " kg");
		
		pesoEmagrecer = peso - (peso * 0.2); 

		System.out.println("Caso emagreça 20% do peso: " + pesoEmagrecer + " kg");
		
		input.close();
	}
}
