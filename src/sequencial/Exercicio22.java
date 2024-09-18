package sequencial;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int lados, diagonais;
		
		System.out.println("Digite o número de lados do polígono: ");
		lados = input.nextInt();
		
		diagonais = lados * (lados - 3) / 2;
		
		System.out.println("Números de diagonais: " + diagonais);
		
		input.close();
	}
}
