/**
 *  Faça um programa que receba o peso de uma pessoa em quilos e mostre o peso em gramas.
 */

package sequencial;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pesoKg, pesoG;
		
		System.out.println("Digite o peso (Kg): ");
		pesoKg = input.nextDouble();
		
		pesoG = pesoKg * 1000;
		
		System.out.println("Peso em grama: "+pesoG);
		
		input.close();
	}
}
