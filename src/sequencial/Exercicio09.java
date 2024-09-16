package sequencial;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int baseMaior, baseMenor, altura, area;
		
		System.out.println("Digite o valor da base maior: ");
		baseMaior = input.nextInt();
		
		System.out.println("Digite o valor da base menor: ");
		baseMenor = input.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		altura = input.nextInt();
		
		area = ((baseMaior+baseMenor) * altura)/2;
		
		System.out.println("Área do trapézio: " + area);
		
		input.close();
	}
}
