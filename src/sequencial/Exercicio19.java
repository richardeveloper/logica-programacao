//19. Sabe-se que, para iluminar de maneira correta os c�modos de uma casa, para cada m2, deve-se usar 18 W de pot�ncia. Fa�a um 
//    programa que receba as duas dimens�es de um c�modo (em metros), calcule e mostre a sua �rea (em m2) e a pot�ncia de 
//    ilumina��o que dever� ser utilizada.

package sequencial;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double lado1, lado2, area, potencia;
		
		System.out.println("Digite o valor da primeira dimens�o: ");
		lado1 = input.nextDouble();
		System.out.println("Digite o valor da segunda dimens�o: ");
		lado2 = input.nextDouble();
		
		area = lado1 * lado2;
		System.out.println("Dimens�o do com�do: "+area+" m�");
		
		potencia = area * 18;
		System.out.println("Pot�ncia de ilumina��o: "+potencia+" W");
		
		input.close();
	}
}
