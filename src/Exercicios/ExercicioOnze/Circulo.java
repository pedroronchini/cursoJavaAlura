package Exercicios.ExercicioOnze;

public class Circulo implements Forma {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * raio * raio;
  }

}
