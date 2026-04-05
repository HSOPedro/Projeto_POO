package br.inatel.Menu;

import java.util.Scanner;

import br.inatel._Sistema_compra.*; // importa todas as classes
import br.inatel.Processo.ProcessarPedido; // importa a classe de processamento

public class PCMania {

    public static void main(String[] args) {

        // cria objeto para leitura
        Scanner scanner = new Scanner(System.in);

        //Dados do cliente
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();// le o nome

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();// le o cpf

        int tamanho;

        boolean verificado = false; // variável de controle para o cpff

        //loop ate o cpf ser valido
        while (!verificado) {

            tamanho = cpf.length();

            //verifica se tem 11 dígitos
            if (tamanho == 11) {
                System.out.println("CPF válido");
                verificado = true;
            } else {
                System.out.println("CPF inválido, deve ter 11 dígitos.");
                System.out.println("Digite o CPF novamente:");
                cpf = scanner.nextLine();
            }
        }
        // cria o cliente com nome e CPF
        Cliente cliente = new Cliente(nome, cpf);

        //promocoes

        Computador p1 = new Computador("Apple", 2170);
        p1.getHardwares()[0] = new HardwareBasico("Processador i3", 2200);
        p1.getHardwares()[1] = new HardwareBasico("Memória RAM", 8);
        p1.getHardwares()[2] = new HardwareBasico("HD", 500);
        p1.setSistemaOperacional(new SistemaOperacional("macOS", 64));
        p1.setMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador p2 = new Computador("Samsung", 3404);
        p2.getHardwares()[0] = new HardwareBasico("Processador i5", 3370);
        p2.getHardwares()[1] = new HardwareBasico("Memória RAM", 16);
        p2.getHardwares()[2] = new HardwareBasico("HD", 1000);
        p2.setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        p2.setMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador p3 = new Computador("Dell", 7848);
        p3.getHardwares()[0] = new HardwareBasico("Processador i7", 4500);
        p3.getHardwares()[1] = new HardwareBasico("Memória RAM", 32);
        p3.getHardwares()[2] = new HardwareBasico("HD", 2000);
        p3.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        p3.setMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        //carrinho
        //vetor que armazena os pcs comprados max 10
        Computador[] carrinho = new Computador[10];
        int quantidade = 0;//controla quantos pcs foram adicionados
        int opcao; //opção do menu

        //loop do menu
        do {
            System.out.println("\n---------------------------");
            System.out.println("1 - Apple");
            System.out.println("2 - Samsung");
            System.out.println("3 - Dell");
            System.out.println("0 - Finalizar");
            System.out.println("Carrinho: " + quantidade + "/10");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:

                    //verifica limite do carrinho
                    if (quantidade >= 10) {
                        System.out.println("\nLimite de 10 computadores já foi atingido!");
                        break;
                    }

                    //adiciona o computador escolhido
                    if (opcao == 1) {
                        carrinho[quantidade++] = p1;
                    } else if (opcao == 2) {
                        carrinho[quantidade++] = p2;
                    } else {
                        carrinho[quantidade++] = p3;
                    }

                    System.out.println("Computador adicionado!");
                    break;

                case 0:
                    System.out.println("\nFinalizando compra...");
                    break;

                default:
                    System.out.println(" Opção inválida, escolha entre 0 e 3.");
            }

        } while (opcao != 0); //repete até o usuário sair

        //resumo
        float total = 0; //total da compra

        System.out.println("\n--------Dados do Cliente--------d");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        //percorre o carrinho e mostra os pcs
        for (int i = 0; i < quantidade; i++) {
            carrinho[i].mostrarComputador();
            total += carrinho[i].getPreco();//soma preço
        }

        System.out.println("\nTotal da compra: R$" + total);

        //final
        // envia o pedido
        ProcessarPedido.processar(carrinho);

        scanner.close();
    }
}