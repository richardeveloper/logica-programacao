//20. Fa�a um programa que receba a medida do �ngulo formado por uma escada apoiada no ch�o e a dist�ncia em que a escada est� da 
//    parede, calcule e mostre a medida da escada para que se possa alcan�ar sua ponta.

package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int angulo;
		double distancia, medida;
		
		System.out.println("Digite o �ngulo formado pela escada: ");
		angulo = input.nextInt();
		System.out.println("Digite a dist�ncia da escada para a parede: ");
		distancia = input.nextDouble();
		
		medida = distancia / Math.sin(angulo);
		System.out.println("Medida da escada: "+medida);
		
		input.close();
	}
}
