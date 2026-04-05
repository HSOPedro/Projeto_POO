package br.inatel._Sistema_compra;

//classe que representa uma memória USB
public class MemoriaUSB {
    private String nome;//nome da memória
    private int capacidade;//capacidade em GB

    //construtor
    public MemoriaUSB(String nomeParametro, int capacidadeParametro) {
        nome = nomeParametro;
        capacidade = capacidadeParametro;
    }

    //metodo para mostrar a memória USB
    public void mostrarUSB() {
        System.out.println(nome + ": " + capacidade + "GB");
    }
}