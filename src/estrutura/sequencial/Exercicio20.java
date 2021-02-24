//20. Faça um programa que receba a medida do ângulo formado por uma escada apoiada no chão e a distância em que a escada está da 
//    parede, calcule e mostre a medida da escada para que se possa alcançar sua ponta.

package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int angulo;
		double distancia, medida;
		
		System.out.println("Digite o ângulo formado pela escada: ");
		angulo = input.nextInt();
		System.out.println("Digite a distância da escada para a parede: ");
		distancia = input.nextDouble();
		
		medida = distancia / Math.sin(angulo);
		System.out.println("Medida da escada: "+medida);
		
		input.close();
	}
}
