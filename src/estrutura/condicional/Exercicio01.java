//01. Fa�a um programa que receba quatro notas de um aluno, calcule e mostre a m�dia aritm�tica das notas e a mensagem de aprovado ou 
//    reprovado, considerando para aprova��o m�dia 7.

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = input.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = input.nextFloat();
		System.out.println("Digite a quarta nota: ");
		n4 = input.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("M�dia do aluno: "+media);
		
		if(media >= 7) {
			System.out.println("Aluno Aprovado !");
		}
		else {
			System.out.println("Aluno Reprovado !");
		}
		
		input.close();
	}
}
