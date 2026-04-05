package br.inatel._Sistema_compra;

//classe principal que representa um computador
public class Computador {
    private String marca;//marca do computador
    private float preco;//preço do computador
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwares; // lista de hardwares (array)
    private MemoriaUSB memoriaUSB;

    public Computador(String marcaParametro, float precoParametro) {
        marca = marcaParametro;//marca do computador
        preco = precoParametro;//preço do computador
        hardwares = new HardwareBasico[3];//cria um vetor de 3 hardwares
    }

    public float getPreco() {
        return preco;
    }

    public HardwareBasico[] getHardwares() {
        return hardwares;
    }

    public void setSistemaOperacional(SistemaOperacional sistemaParametro) {
        sistemaOperacional = sistemaParametro;
    }

    public void setMemoriaUSB(MemoriaUSB memoriaParametro) {
        memoriaUSB = memoriaParametro;
    }

    //mostra todas as informações do computador
    public void mostrarComputador() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$" + preco);

        sistemaOperacional.mostrarSO();

        //percorre e mostra os hardwares
        for (int i = 0; i < hardwares.length; i++) {
            hardwares[i].mostrarHardware();
        }

        memoriaUSB.mostrarUSB();
    }
}