//11. Faça um programa que calcule e mostre a área de um losango. Sabe-se que A = (diagonal maior * diagonal menor)/2;

package sequencial;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int dMaior, dMenor, area;
		
		System.out.println("Digite o valor da diagonal maior: ");
		dMaior = input.nextInt();
		System.out.println("Digite o valor da diagonal menor: ");
		dMenor = input.nextInt();
		
		area = (dMaior * dMenor)/2;
		
		System.out.println("Área do losango: "+area);
		
		input.close();
	}
}
