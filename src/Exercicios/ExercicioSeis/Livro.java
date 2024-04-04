package Exercicios.ExercicioSeis;

public class Livro {
  // Desenvolva uma classe Livro com os atributos privados titulo e autor. 
  // Utilize métodos getters e setters para acessar e modificar esses atributos. 
  // Adicione um método exibirDetalhes que imprime o título e o autor do livro.

  private String titulo;
  private String autor;

  public String getAutor() {
    return autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void exibirDetalhes() {
    System.out.println("Autor: " + autor);
    System.out.println("Título:" + titulo);
  }
}
