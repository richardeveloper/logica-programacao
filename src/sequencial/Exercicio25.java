//25. Fa�a um programa que receba uma hora (uma vari�vel para hora e outra para minutos), calcule e mostre:
//    a) a hora digitada convertida em minutos;
//    b) o total dos minutos, ou seja, os minutos digitados mais a convers�o anterior;
//    c) o total dos minutos convertidos em segundos.

package sequencial;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horas, minutos, totalHoras, totalMinutos;
		
		System.out.println("Digite a hora do hor�rio: ");
		horas = input.nextInt();
		System.out.println("Digite os minutos do hor�rio:");
		minutos = input.nextInt();
		
		totalHoras = horas * 60;
		totalMinutos = totalHoras + minutos;
		
		System.out.println("Hora convertida em minutos: "+totalHoras);
		System.out.println("Total dos minutos: "+totalMinutos);
		System.out.println("Total do minutos convertidos em segundos: "+(totalMinutos*60));
		
		input.close();
		
	}
}
