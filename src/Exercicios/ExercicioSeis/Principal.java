package Exercicios.ExercicioSeis;

public class Principal {
  public static void main(String[] args) {
    Livro livro = new Livro();

    livro.setAutor("Philip K. Dick");
    livro.setTitulo("O homen do castelo auto");

    livro.exibirDetalhes();
  }
}
