package condicional;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = input.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = input.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		n4 = input.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Média do aluno: " + media);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Aluno reprovado.");
		}
		
		input.close();
	}
}
