package Exercicios.ExercicioDez;

public class ProdutoPerecivel extends Produto {
  private String dataValidade;

  public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
    super(nome, preco, quantidade);
    this.dataValidade = dataValidade;
  }

  public static void main(String[] args) {
    ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Danone", 2.40, 1, "11/06/2024");

    System.out.println(produtoPerecivel);
  }
}
