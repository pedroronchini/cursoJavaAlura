package Exercicios.ExercicioDez;

import java.util.ArrayList;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "Produto: " + this.getNome() + "\nPreço: " + this.getPreco() + "\nQuantidade: " + this.getQuantidade();
  }

  public static void main(String[] args) {
    ArrayList<Produto> listaProduto = new ArrayList<>();

    Produto produto1 = new Produto("Abacaxi", 5.60, 3);
    Produto produto2 = new Produto("Morango", 6.85, 6);
    Produto produto3 = new Produto("Banana", 3.57, 12);

    listaProduto.add(produto1);
    listaProduto.add(produto2);
    listaProduto.add(produto3);

    System.out.println(listaProduto.size());
    System.out.println(listaProduto.get(0).getNome());
    System.out.println(listaProduto.get(0).toString());
  }
}
