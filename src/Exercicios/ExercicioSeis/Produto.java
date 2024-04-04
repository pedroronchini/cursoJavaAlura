package Exercicios.ExercicioSeis;

public class Produto {
  // Desenvolva uma classe Produto com os atributos privados nome e preco.
  // Utilize métodos getters e setters para acessar e modificar esses atributos. 
  // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
  private String nome;
  private double preco;

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void aplicarDesconto(double valorPercentual) {
    double desconto = preco * (valorPercentual / 100);

    preco -= desconto;
  }
}
