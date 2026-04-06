package br.inatel._Sistema_compra;

// classe que representa o cliente
public class Cliente {

    private String nome; // nome do cliente
    private String cpf; // CPF do cliente
    private Computador[] computadores; // vetor que guarda os computadores comprados

    // construtor
    public Cliente(String nomeParametro, String cpfParametro) {
        nome = nomeParametro; // recebe o nome
        cpf = cpfParametro; // recebe o CPF
        computadores = new Computador[10]; // cliente pode comprar até 10 PCs
    }

    // retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // retorna o CPF do cliente
    public String getCpf() {
        return cpf;
    }

    // adiciona um computador na posição do vetor
    public void addComputador(Computador pc, int posicao) {
        computadores[posicao] = pc;
    }

    // calcula o valor total da compra
    public float calculaTotalCompra() {
        float total = 0; // variável que guarda o total

        // percorre todos os computadores
        for (int i = 0; i < computadores.length; i++) {

            // verifica se não está vazio
            if (computadores[i] != null) {
                total += computadores[i].getPreco(); // soma o preço
            }
        }

        return total; // retorna o total da compra
    }
}