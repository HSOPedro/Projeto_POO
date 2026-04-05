package br.inatel.modelo;

//classe que representa o sistema operacional
public class SistemaOperacional {
    private String nome;//nome do sistema
    private int tipo;

    //construtor
    public SistemaOperacional(String nomeParametro, int tipoParametro) {
        nome = nomeParametro;
        tipo = tipoParametro;
    }

    //metodo que mostra o sistema operacional
    public void mostrarSO() {
        System.out.println("Sistema: " + nome + " (" + tipo + " bits)");
    }
}