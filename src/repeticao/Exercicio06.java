package repeticao;

import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double transacao;

    double totalCompras = 0.0;
    double totalComprasVista = 0.0;
    double totalComrpasPrazo = 0.0;
    double totalPrimeiraParcela = 0.0;

    String pagamento;

    for (int i = 1; i <= 15; i++) {
      System.out.println("Digite o valor da transação: ");
      transacao = input.nextDouble();

      do {
        System.out.println("Digite a forma de pagamento:");
        System.out.println("V - À vista");
        System.out.println("P - À prazo");

        pagamento = input.next();
      } while (isFormaPagamentoInvalida(pagamento));

      totalCompras += transacao;

      if (pagamento.equals("V")) {
        totalComprasVista += transacao;
      }
      else {
        totalComrpasPrazo += transacao;
        totalPrimeiraParcela += (transacao / 3);
      }
    }

    System.out.printf("Valor total de compras: R$ %.2f %n", totalCompras);
    System.out.printf("Valor total de compras à vista: R$ %.2f %n", totalComprasVista);
    System.out.printf("Valor total de compras à prazo: R$ %.2f %n", totalComrpasPrazo);
    System.out.printf("Valor total de primeiras parcelas: R$ %.2f %n", totalPrimeiraParcela);

    input.close();
  }

  private static boolean isFormaPagamentoInvalida(String pagamento) {
    return !pagamento.equalsIgnoreCase("V") && !pagamento.equalsIgnoreCase("P");
  }
}
