package sequencial;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horas, minutos, totalHoras, totalMinutos;
		
		System.out.println("Digite a hora do horário: ");
		horas = input.nextInt();
		
		System.out.println("Digite os minutos do horário: ");
		minutos = input.nextInt();
		
		totalHoras = horas * 60;
		totalMinutos = totalHoras + minutos;
		
		System.out.println("Hora convertida em minutos: " + totalHoras);
		System.out.println("Total dos minutos: " + totalMinutos);
		System.out.println("Total do minutos convertidos em segundos: " + (totalMinutos * 60));
		
		input.close();
	}
}
