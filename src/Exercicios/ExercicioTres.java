package java_criando_sua_primeira_aplicacao.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {
  /**
   * Crie um programa que simula um jogo de adivinhação, 
   * que deve gerar um número aleatório entre 0 e 100 e 
   * pedir para que o usuário tente adivinhar o número, 
   * em até 5 tentativas. A cada tentativa, o programa 
   * deve informar se o número digitado pelo usuário é 
   * maior ou menor do que o número gerado.
   */
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int numeroDoUsuario = 0;
    int contador = 0;
    int numeroAleatorio = new Random().nextInt(100);

    while (contador <= 5) {
      System.out.println("Digite um número de 0 a 100: ");
      numeroDoUsuario = leitura.nextInt();

      if (numeroDoUsuario < 0 || numeroDoUsuario > 100) {
        System.out.println("Número inválido!");
        contador++;
      } else {
        if (numeroDoUsuario == numeroAleatorio) {
          System.out.println("Você adivinhou o número pensado!");
          break;
        } else if (numeroDoUsuario > numeroAleatorio) {
          System.out.println("O número digitado é maior que o número pensado!");
        } else {
          System.out.println("O número digitado é menor que o numero pensado");
        }
      }
    }
  }
}
