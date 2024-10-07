package br.com.estruturas.sequencial;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int diagonalMaior, diagonalMenor, area;
		
		System.out.println("Digite o valor da diagonal maior: ");
		diagonalMaior = input.nextInt();
		
		System.out.println("Digite o valor da diagonal menor: ");
		diagonalMenor = input.nextInt();
		
		area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.println("Área do losango: " + area);
		
		input.close();
	}
}
