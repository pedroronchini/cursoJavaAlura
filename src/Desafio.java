import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    String nome = "João Ferreira";
    String tipoConta = "Corrente";
    double saldo = 4000;
    String texto = "";
    String menu = """
      -------- Operações --------
      1. Consultar saldos
      2. Receber valor
      3. Transferir valor
      4. Sair
      ---------------------------
      Digite a opção desejada: 
    """;
    String dadosCliente = String.format("""
      ******************************************
      Dados iniciais do cliente:
      
      Nome:             %s
      Tipo conta:       %s
      Saldo inicial:    %.2f
      ******************************************          
    """, nome, tipoConta, saldo);

    System.out.println(dadosCliente);

    while (opcao != 4) {
      System.out.println(menu);
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          texto = String.format("O saldo atual é R$ %.2f \n", saldo);
          
          System.out.println(texto);

          break;
        case 2:
          System.out.println("Informe o valor a receber: ");
          double recebido = scanner.nextDouble();

          saldo += recebido;
          texto = String.format("Saldo atualizado R$ %.2f \n", saldo);

          System.out.println(texto);

          break;
        case 3:
          System.out.println("Informe o valor que deseja transferir: ");
          double transferir = scanner.nextDouble();

          if (saldo < transferir) {
            System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
          } else {
            saldo -= transferir;
            texto = String.format("Saldo atualizado R$ %.2f \n", saldo);

            System.out.println(texto);
          }

          break;
        case 4:
          System.out.println("Sistema encerrado!");
          
          break;
      
        default:
          System.out.println("Opção inválida!");
          
          break;
      }
    }
  }
}
