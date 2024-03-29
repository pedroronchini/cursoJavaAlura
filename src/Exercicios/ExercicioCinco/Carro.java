package Exercicios.ExercicioCinco;

public class Carro {
    // Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a
    // idade do carro.
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdadeDoCarro() {
        return 2024 -ano;
    }
}
