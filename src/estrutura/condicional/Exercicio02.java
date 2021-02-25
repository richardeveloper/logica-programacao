//02. Faça um programa que receba duas notas, calcule e mostre a média aritmética e a mensagem que se encontra na tabela a seguir:
//	  0,0 ~ 3,0 - Reprovado
//    3,0 ~ 7,0 - Exame
//    7,0 ~ 10,0 - Aprovado

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float n1, n2, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = input.nextFloat();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Média do aluno: "+media);
		
		if(media <=10 && media >=7) {
			System.out.println("Aluno Aprovado !");
		}
		else if(media < 7 && media >=3) {
			System.out.println("Aluno de Exame !");
		}
		else if(media < 3 && media >= 0){
			System.out.println("Aluno Reprovado !");
		}
		
		input.close();
	}
}
