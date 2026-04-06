package br.inatel._Sistema_compra;

// classe que representa o sistema operacional
public class SistemaOperacional {

    private String nome; // nome do sistema
    private int tipo; // quantidade de bits (32 ou 64)

    // construtor
    public SistemaOperacional(String nomeParametro, int tipoParametro) {
        nome = nomeParametro; // recebe o nome
        tipo = tipoParametro; // recebe o tipo
    }

    // mostra o sistema operacional
    public void mostraSO() {
        System.out.println("Sistema: " + nome + " (" + tipo + " bits)");
    }
}