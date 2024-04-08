package Exercicios.ExercicioNove;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();

    pessoa1.setNome("Pedro");
    pessoa1.setIdade(23);

    Pessoa pessoa2 = new Pessoa();

    pessoa2.setNome("João");
    pessoa2.setIdade(40);

    Pessoa pessoa3 = new Pessoa();

    pessoa3.setNome("Maria");
    pessoa3.setIdade(20);

    ArrayList<Pessoa> listPessoa = new ArrayList<>();

    listPessoa.add(pessoa1);
    listPessoa.add(pessoa2);
    listPessoa.add(pessoa3);

    System.out.println(listPessoa.size());
    System.out.println(listPessoa.get(0).getNome());
    System.out.println(listPessoa);
  }
}
