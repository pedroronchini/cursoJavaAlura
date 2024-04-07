package Exercicios.ExercicioOito;

public class ProdutoFisico  extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return getPrecoUnitario() * 1.05;
    }
}
