package Exercicios.ExercicoQuatorze;

import com.google.gson.Gson;

record Pessoa(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjeto {
  public static void main(String[] args) {
    String jsonPessoa = "{\"nome\": \"Pedro\", \"idade\": 25, \"cidade\": \"Poços de Caldas\"}";

    Gson gson = new Gson();

    Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

    System.out.println("Objeto Pessoa: " + pessoa);
  }
}
