package Exercicios.ExercicioOnze;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    // Exercicio 1
    // ArrayList<String> list = new ArrayList<>();

    // list.add("Abacaxi");
    // list.add("Limão");
    // list.add("Morango");
    // list.add("Banana");

    // for (String item: list) {
    //   System.out.println(item);
    // }

    // Exercicio 2
    // Cachorro cachorro = new Cachorro();
    // Animal animal = (Animal) cachorro;

    // Exercicio 3
    // Animal animal = new Cachorro();

    // if (animal instanceof Cachorro) {
    //   Cachorro cachorro = (Cachorro) animal;
    // } else {
    //   System.out.println("O objeto não é um Cachorro.");
    // }

    // Exercicio 4
    // Produto produto1 = new Produto("Ar condicionado", 2000.0);
    // Produto produto2 = new Produto("Aquecedor", 800.0);
    // Produto produto3 = new Produto("Ventilador", 150.0);

    // ArrayList<Produto> listaProdutos = new ArrayList<>();
    // listaProdutos.add(produto1);
    // listaProdutos.add(produto2);
    // listaProdutos.add(produto3);

    // double somaPrecos = 0;
    // for (Produto produto : listaProdutos) {
    //     somaPrecos += produto.getPreco();
    // }

    // double precoMedio = somaPrecos / listaProdutos.size();
    // System.out.println("Preço médio dos produtos: " + precoMedio);

    //  Exercicio 5
    // Circulo circulo = new Circulo(5);
    // Quadrado quadrado = new Quadrado(4);

    // ArrayList<Forma> listaFormas = new ArrayList<>();
    // listaFormas.add(circulo);
    // listaFormas.add(quadrado);

    // for (Forma forma: listaFormas) {
    //   System.out.println("Área: " + forma.calcularArea());
    // }

    // Exercicio 6
    ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
    ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
    ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

    ArrayList<ContaBancaria> listaContas = new ArrayList<>();
    listaContas.add(conta1);
    listaContas.add(conta2);
    listaContas.add(conta3);

    ContaBancaria contaMaiorSaldo = listaContas.get(0);
    for (ContaBancaria conta : listaContas) {
        if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
            contaMaiorSaldo = conta;
        }
    }

    System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
            ", Saldo: " + contaMaiorSaldo.getSaldo());
  }
}
