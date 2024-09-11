/**
 *  Faça um programa que receba o raio, calcule e mostre:
 *  
 *  a) o comprimento de uma esfera; sabe-se que C = 2* pi * R;
 *  b) a área de uma esfera; sabe-se que A = pi * R²
 *  c) o volume de uma esfera; sabe-se que V = 3/4 * pi * R²
 */

package sequencial;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raio, comprimento, area, volume;
		
		System.out.println("Digite o valor do raio: ");
		raio = input.nextDouble();
		
		comprimento = 2 * Math.PI * raio;
		area = Math.PI * Math.pow(raio, 2);
		volume = 3.0/4 * Math.PI * Math.pow(raio, 3);

		System.out.println("Comprimento da esfera: "+comprimento);
		System.out.println("Área da esfera: "+area);
		System.out.println("Volume da esfera: "+volume);
		
		input.close();
	}
}
