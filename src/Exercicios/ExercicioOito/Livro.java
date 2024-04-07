package Exercicios.ExercicioOito;

public class Livro extends Produto implements Calculavel{
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return getPrecoUnitario() * 0.9;
    }
}
