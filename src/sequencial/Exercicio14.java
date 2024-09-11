/**
 *  Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
 *  
 *  a) a idade dessa pessoa em anos;
 *  b) a idade dessa pessoa em meses;
 *  c) a idade dessa pessoa em dias;
 *  d) a idade dessa pessoa em semanas. 
 */


package sequencial;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int anoNascimento, anoAtual, idadeAno, idadeMes, idadeDia, idadeSemana;
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = input.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = input.nextInt();
		
		idadeAno = anoAtual - anoNascimento;		
		idadeMes = idadeAno*12;
		idadeDia = idadeAno*365;
		idadeSemana = idadeDia/7;
		
		System.out.println("Idade em anos: "+idadeAno+" anos");
		System.out.println("Idade em meses: "+idadeMes+" meses");
		System.out.println("Idade em dias: "+idadeDia+" dias");
		System.out.println("Idade em semanas: "+idadeSemana+" semanas");
		
		input.close();
	}
}
