package Exercicios.ExercicioSete;

public class ContaCorrente extends ContaBancaria {

  private double tarifaMensal;

  public void cobrarTarifaMensal(){
    saldo -= tarifaMensal;

    System.out.println("A tarifa mensal é de: " + tarifaMensal);
  }
}
