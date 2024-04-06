package Exercicios.ExercicioSete;

public class ContaBancaria {
  // Crie uma classe ContaBancaria com métodos para realizar 
  // operações bancárias como depositar(), sacar() e consultarSaldo(). 
  // Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. 
  // Adicione um método específico para a subclasse, como cobrarTarifaMensal(), 
  // que desconta uma tarifa mensal da conta corrente.

  protected double saldo;

  public void depositar(double valor) {
    saldo += valor;

    System.out.println("Depósito feito de: " + valor);
  }

  public void sacar(double valor) {
    saldo -= valor;

    System.out.println("Foi sacado o valor: " +  valor);
  }

  public void consultarSaldo() {
    System.out.println("O saldo atual é de " + saldo);
  }
}
