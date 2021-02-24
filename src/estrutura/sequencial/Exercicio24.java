//24. Fa�a um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. Ela vai passar por v�rios 
//    pa�ses e precisa converter seu dinheiro em d�lares, marco alem�o e libra esterlina. Sabe-se que a cota��o do d�lar � de 
//    R$ 1,80; do marco alem�o, de R$ 2,00; e da libra esterlina, de R$ 3,57. O programa deve fazer as convers�es e mostr�-las.

package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double reais, dolar, marco, libra;
		
		System.out.println("Digite o valor em R$: ");
		reais = input.nextDouble();
		
		dolar = reais / 1.80;
		marco = reais / 2;
		libra = reais / 3.57;
		
		System.out.printf("Valor em dol�res: %.2f\n",dolar);
		System.out.printf("Valor em marco alem�o: %.2f\n",marco);
		System.out.printf("Valor em libra esterlina: %.2f\n",libra);
		
		input.close();
	}
}
