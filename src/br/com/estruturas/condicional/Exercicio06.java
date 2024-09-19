package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n1, n2;
		int opcao;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println("Digite a opção desejada:");
		System.out.println("1- O primeiro número elevado ao segundo número");
		System.out.println("2- Raiz quadrada de cada um dos números");
		System.out.println("3- Raiz cúbica de cada um dos números");
		opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Primeiro número elevado ao segundo número: " + Math.pow(n1, n2));
			break;
		case 2:
			System.out.println("Raiz quadrada do primeiro número: " + Math.sqrt(n1));
			System.out.println("Raiz quadrada do segundo número: " + Math.sqrt(n2));
			break;
		case 3:
			System.out.println("Raiz quadrada do primeiro número: " + Math.cbrt(n1));
			System.out.println("Raiz quadrada do segundo número: " + Math.cbrt(n2));
			break;
		default:
			System.out.println("Opção Inválida !");
			break;
		}
		
		input.close(); 
	}
}
