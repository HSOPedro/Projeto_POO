package br.inatel._Sistema_compra;

//classe que representa um hardware básico
public class HardwareBasico {
    private String nome;
    private int capacidade;

    //construtor da classe
    public HardwareBasico(String nomeParametro, int capacidadeParametro) {
        nome = nomeParametro;
        capacidade = capacidadeParametro;
    }

    //metodo para mostrar o hardware na tela
    public void mostrarHardware() {
        System.out.println(nome + ": " + capacidade);
    }
}