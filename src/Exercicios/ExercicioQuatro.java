package Exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
  public static void main(String[] args) {
    // verificaSinalNumero();
    // comparaDoisNumerosInterios();
    // calculaArea();
    // calculaTabuada();
    // verificaNumero();
    calculaFatorial();
  }

  /**
   * Crie um programa que solicite ao usuário digitar um número. 
   * Se o número for positivo, exiba "Número positivo", caso 
   * contrário, exiba "Número negativo".
  */
  public static void verificaSinalNumero() {
    Scanner leitura = new Scanner(System.in);
    int numeroDigitado = 0;
    
    System.out.println("Digite um número: ");
    numeroDigitado = leitura.nextInt();

    if (numeroDigitado > 0) {
      System.out.println("Número positivo!");
    } else if (numeroDigitado < 0) {
      System.out.println("Número negativo");
    } else {
      System.out.println("O número digitado foi zero");
    }
  }
  /**
   * Peça ao usuário para inserir dois números inteiros.
   * Compare os números e imprima uma mensagem indicando 
   * se são iguais, diferentes, o primeiro é maior ou o 
   * segundo é maior.
  */
  public static void comparaDoisNumerosInterios() {
    Scanner leitura = new Scanner(System.in);
    int primeiroNumero = 0;
    int segundoNumero = 0;

    System.out.println("Digite o primeiro número: ");
    primeiroNumero = leitura.nextInt();

    System.out.println("Digite o segundo número: ");
    segundoNumero = leitura.nextInt();

    if (primeiroNumero == segundoNumero) {
      System.out.println("Os dois números digitados são iguais");
    } else {
      if (primeiroNumero > segundoNumero) {
        System.out.println("Os dois números digitados são diferentes e o primeiro número é maior que o segundo número");
      } else {
        System.out.println("Os dois números digitados são diferentes e o segundo número é maior que o primeiro número");
      }
    }
  }
  /**
    * Crie um menu que oferece duas opções ao usuário: 
    * "1. Calcular área do quadrado" e "2. Calcular área do círculo". 
    * Solicite a escolha do usuário e realize o cálculo da área com 
    * base na opção selecionada.
  */
  public static void calculaArea() {
    Scanner leitura = new Scanner(System.in);
    int escolha = 0;
    String menu = """
      -------- Menu --------
      1. Calcular área do quadrado
      2. Calcular área do círculo
      3. Sair
      ----------------------
      Escolha uma das opções: 
    """;

    while (escolha != 3) {
      System.out.println(menu);
      escolha = leitura.nextInt();

      switch (escolha) {
        case 1:
          System.out.println("Digite o lado do quadrado: ");
          
          double lado = leitura.nextDouble();
          double areaQuadrado = lado * lado;

          System.out.println("A área do quadrado é: " + areaQuadrado);

          break;
        case 2:
          System.out.println("Digite o raio do circulo: ");
          
          double raio = leitura.nextDouble();
          double areaCirculo = 3.14 * raio * raio;

          System.out.println("A área do circulo é: " + areaCirculo);

          break;
        case 3:
          System.out.println("Sistema encerrado");
          break;
        default:
          System.out.println("Escolha um número de 1 á 3");
          break;
      }
    }
  }

  /**
   * Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
  */
  public static void calculaTabuada() {
    Scanner leitura = new Scanner(System.in);
    String resultado = "";

    System.out.println("Digite um número: ");
    int numero = leitura.nextInt();
  
    for (int i = 1; i <= 10; i++) {
      resultado = String.format("%d X %d = %d", i, numero, (i * numero));

      System.out.println(resultado);
    }
  }

  /**
    * Crie um programa que solicite ao usuário a entrada de um número inteiro. 
    * Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
  */
  public static void verificaNumero() {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numero = leitura.nextInt();

    if ((numero % 2) == 0) {
      System.out.println("O número é par");
    } else {
      System.out.println("O número é impar");
    }
  }

  /**
   * Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. 
  */
  public static void calculaFatorial() {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite um número: ");
    
    int numero = leitura.nextInt();
    int fatorial = 1;

    for (int i = 1; i <= numero; i++) {
      fatorial *= i;
    }

    System.out.println("O fatorial de " + numero + " é: " + fatorial);
  }
}
