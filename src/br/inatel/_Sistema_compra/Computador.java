package br.inatel._Sistema_compra;

// classe principal que representa um computador
public class Computador {

    private String marca; // marca do computador
    private float preco; // preço do computador
    private SistemaOperacional sistemaOperacional; // sistema operacional
    private HardwareBasico[] hardwares; // vetor de hardwares
    private MemoriaUSB memoriaUSB; // memória USB

    // construtor
    public Computador(String marcaParametro, float precoParametro) {
        marca = marcaParametro; // recebe a marca
        preco = precoParametro; // recebe o preço
        hardwares = new HardwareBasico[3]; // cria espaço para 3 hardwares
    }

    // retorna o preço
    public float getPreco() {
        return preco;
    }

    // retorna o vetor de hardwares
    public HardwareBasico[] getHardwares() {
        return hardwares;
    }

    // define o sistema operacional
    public void setSistemaOperacional(SistemaOperacional sistemaParametro) {
        sistemaOperacional = sistemaParametro;
    }

    // adiciona memória USB
    public void addMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;
    }

    // mostra todas as configurações do computador
    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);

        // mostra o sistema operacional
        sistemaOperacional.mostraSO();

        // percorre e mostra os hardwares
        for (int i = 0; i < hardwares.length; i++) {
            hardwares[i].mostraHardware();
        }

        // mostra a memória USB
        memoriaUSB.mostraUSB();
    }
}