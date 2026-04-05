package br.inatel.modelo;

//classe que representa o cliente
public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    //construtor
    public Cliente(String nomeParametro, String cpfParametro) {
        nome = nomeParametro;//nome do cliente
        cpf = cpfParametro;//cp do cliente
        computadores = new Computador[10];
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}