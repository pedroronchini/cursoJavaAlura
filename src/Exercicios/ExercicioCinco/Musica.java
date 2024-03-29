package Exercicios.ExercicioCinco;

public class Musica {
    // Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
    // exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double retornaMedia() {
        return avaliacao / numAvaliacoes;
    }
}
