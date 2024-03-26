package java_criando_sua_primeira_aplicacao.Exercicios;
/*
  Escreva um programa que converta uma temperatura digitada em Celsius e converta para Fahrenheit.
*/

public class ExercicioUm {
  public static void main(String[] args) {
    double temperaturaGrauCelsios = 24;
    double temperaturaGrauFahrenheit = temperaturaGrauCelsios * 1.8 + 32;

    String mensagem = String.format(
      "A temperatura em celsios é: %.2f e a temperatura em Fahrenheit é %.2f",
      temperaturaGrauCelsios,
      temperaturaGrauFahrenheit
    );
    System.out.println(mensagem);

    int temperaturaGrauFahrenheitInteira = (int) (temperaturaGrauFahrenheit);
    int temperaturaGrauCelsiosInteira = (int) temperaturaGrauCelsios;

    String mensagem2 = String.format(
      "A temperatura em celsios é: %d e a temperatura em Fahrenheit é %d",
      temperaturaGrauCelsiosInteira,
      temperaturaGrauFahrenheitInteira
    );

    System.out.println(mensagem2);
  }
}
