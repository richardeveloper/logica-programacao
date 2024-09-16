package sequencial;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float reais, dolar, marco, libra;
		
		System.out.println("Digite o valor em R$: ");
		reais = input.nextFloat();
		
		dolar = reais / 1.8f;
		marco = reais / 2;
		libra = reais / 3.57f;
		
		System.out.printf("Valor em doláres: %.2f\n", dolar);
		System.out.printf("Valor em marco alemão: %.2f\n", marco);
		System.out.printf("Valor em libra esterlina: %.2f\n", libra);
		
		input.close();
	}
}
