package Exercicios.ExercicioSeis;

public class ContaBancaria {
  //  Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), 
  //  saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

  private double saldo;
  private int numeroConta;
  public String titular;

  public int getNumeroConta() {
    return numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
