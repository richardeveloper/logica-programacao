package sequencial;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double reais, dolar, marco, libra;
		
		System.out.println("Digite o valor em R$: ");
		reais = input.nextDouble();
		
		dolar = reais / 1.8;
		marco = reais / 2;
		libra = reais / 3.57;
		
		System.out.printf("Valor em doláres: %.2f\n", dolar);
		System.out.printf("Valor em marco alemão: %.2f\n", marco);
		System.out.printf("Valor em libra esterlina: %.2f\n", libra);
		
		input.close();
	}
}
