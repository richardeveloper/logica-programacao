package br.com.estruturas.repeticao;

public class Exercicio02 {
  public static void main(String[] args) {

    double despesas = 200.0;
    int quantidadeIngressos = 120;

    for (double i = 5.0; i >= 1.0; i = i - 0.5) {
      System.out.println("Preço do ingresso: R$ " + i);
      System.out.println("Quantidade de ingressos vendidos: " + quantidadeIngressos);
      System.out.println("Despesas: R$ " + despesas);
      System.out.println("Lucro Total: R$ " + ((quantidadeIngressos * i) - despesas));
      System.out.println();
      quantidadeIngressos += 26;
    }
  }
}
