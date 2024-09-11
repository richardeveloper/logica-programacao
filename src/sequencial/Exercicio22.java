/**
 *  Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número 
 *  de diagonais desse polígono. Sabe-se que ND = N * (N − 3)/2, em que N é o número de lados do 
 *  polígono.
 */

package sequencial;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int lados, diagonais;
		
		System.out.println("Digite o número de lados do polígono: ");
		lados = input.nextInt();
		
		diagonais = lados * (lados - 3)/2;
		
		System.out.println("Números de diagonais: "+diagonais);
		
		input.close();
	}
}
