package br.inatel._Sistema_compra;

// classe que representa um hardware básico
public class HardwareBasico {

    private String nome; // nome do hardware
    private int capacidade; // capacidade do hardware

    // construtor
    public HardwareBasico(String nomeParametro, int capacidadeParametro) {
        nome = nomeParametro; // recebe o nome
        capacidade = capacidadeParametro; // recebe a capacidade
    }

    // mostra as informações do hardware
    public void mostraHardware() {
        System.out.println(nome + ": " + capacidade);
    }
}