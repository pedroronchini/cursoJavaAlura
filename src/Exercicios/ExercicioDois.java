package Exercicios;

public class ExercicioDois {
  public static void main(String[] args) {
    // realizaMedia();
    // casting();
    // concatenaStings();
    // calculaTotalPrecoProduto();
    // dolarToReal();
    calculaDesconto();
  }
  /**
   * Crie um programa que realize a média de duas notas decimais e exiba o resultado
   */
  public static void realizaMedia() {
    double notaUm = 10;
    double notaDois = 8;
    double media = (notaUm + notaDois) / 2;
    String mensagem = String.format(
      "A média entre a primeira nota %.2f e a segunda nota %.2f é %.2f",
      notaUm,
      notaDois,
      media
    );

    System.out.println(mensagem);
  }
  /**
    * Declare uma variável do tipo double e uma variável do tipo int.
    * Faça o casting da variável double para int e imprima o resultado.
    */
  public static void casting() {
    double numeroDouble = 2145.9887;
    int numeroInt = (int) numeroDouble;
    System.out.println(numeroInt);
  }

  /**
    * Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
    * Atribua valores a essas variáveis e concatene-as em uma mensagem.
    */
    public static void concatenaStings() {
      char letra = 'a';
      String palavra = "alfabeto";
      String mensagem = "A primeira letra do " + palavra + " é a letra: " + letra;

      System.out.println(mensagem);
    }
  
  /**
   * Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
   * Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
   */
  public static void calculaTotalPrecoProduto() {
    double precoProduto = 45.69;
    int quantidade = 5;
    double valorTotal = precoProduto * quantidade;
    String mensagem = String.format(
      "O valor do produto é %f e o valor total para %d unidades é: %.2f",
      precoProduto,
      quantidade,
      valorTotal
    );

    System.out.println(mensagem);
  }
  
  /**
   * Declare uma variável do tipo double valorEmDolares.
   * Atribua um valor em dólares a essa variável. 
   * Considere que o valor de 1 dólar é equivalente a 4.94 reais.
   * Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
   */
  public static void dolarToReal() {
    double valorEmDolares = 50.48;
    double umRealEmDolar = 4.94;
    double valor = valorEmDolares * umRealEmDolar;
    String mensagem = String.format(
      "O valor em dolar é USD %.2f, sabendo que 1 real é USD%.2f o valor em reais é: %.2f",
      valorEmDolares,
      umRealEmDolar,
      valor
    );

    System.out.println(mensagem);
  }

  /**
   * Declare uma variável do tipo double precoOriginal.
   * Atribua um valor em reais a essa variável, representando o preço original de um produto.
   * Em seguida, declare uma variável do tipo double percentualDesconto e 
   * atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
   * Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
   */
  public static void calculaDesconto() {
    double precoOriginal = 780.96;
    double percentualDesconto = 10;
    double valorDesconto =  (percentualDesconto / 100) * precoOriginal;
    double novoPreco = precoOriginal - valorDesconto;
    String mensagem = String.format(
      """
        O preço original do produto é: %.2f
        A porcentagem do desconto é: %.2f
        O valor do desconto é: %.2f
        O novo preço é: %.2f
      """,
      precoOriginal,
      percentualDesconto,
      valorDesconto,
      novoPreco
    );
    
    System.out.println(mensagem);
  }
}
