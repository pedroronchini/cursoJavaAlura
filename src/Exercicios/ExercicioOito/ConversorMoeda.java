package Exercicios.ExercicioOito;

public class ConversorMoeda implements ConversaoFinanceira {

  // Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira 
  // com o método converterDolarParaReal() para converter um valor em dólar para reais. 
  // A classe deve receber o valor em dólar como parâmetro.
  @Override
  public double converterDolarParaReal(double valor) {
    return valor * 5.40;
  }

}
