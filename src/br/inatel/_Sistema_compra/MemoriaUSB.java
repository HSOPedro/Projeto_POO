package br.inatel._Sistema_compra;

// classe que representa uma memória USB
public class MemoriaUSB {

    private String nome; // nome da memória
    private int capacidade; // capacidade em GB

    // construtor
    public MemoriaUSB(String nomeParametro, int capacidadeParametro) {
        nome = nomeParametro; // recebe o nome
        capacidade = capacidadeParametro; // recebe a capacidade
    }

    // mostra a memória USB
    public void mostraUSB() {
        System.out.println(nome + ": " + capacidade + "GB");
    }
}