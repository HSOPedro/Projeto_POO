package br.inatel.Menu;

import java.util.Scanner;

import br.inatel._Sistema_compra.*;
import br.inatel.Processo.ProcessarPedido;

public class PCMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Pedro Henrique Santos de Oliveira";
        String cpf = "111.1111.111.11";

        Cliente cliente = new Cliente(nome, cpf);

        // PROMOÇÕES
        Computador p1 = new Computador("Apple", 2170);
        p1.getHardwares()[0] = new HardwareBasico("Processador i3", 2200);
        p1.getHardwares()[1] = new HardwareBasico("Memória RAM", 8);
        p1.getHardwares()[2] = new HardwareBasico("HD", 500);
        p1.setSistemaOperacional(new SistemaOperacional("macOS", 64));
        p1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador p2 = new Computador("Samsung", 3404);
        p2.getHardwares()[0] = new HardwareBasico("Processador i5", 3370);
        p2.getHardwares()[1] = new HardwareBasico("Memória RAM", 16);
        p2.getHardwares()[2] = new HardwareBasico("HD", 1000);
        p2.setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        p2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador p3 = new Computador("Dell", 7848);
        p3.getHardwares()[0] = new HardwareBasico("Processador i7", 4500);
        p3.getHardwares()[1] = new HardwareBasico("Memória RAM", 32);
        p3.getHardwares()[2] = new HardwareBasico("HD", 2000);
        p3.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        p3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // CARRINHO
        Computador[] carrinho = new Computador[10];
        int quantidade = 0;
        int opcao;

        // MENU
        do {
            System.out.println("---------------------------");
            System.out.println("1 - Apple");
            System.out.println("2 - Samsung");
            System.out.println("3 - Dell");
            System.out.println("0 - Finalizar");
            System.out.println("Carrinho: " + quantidade + "/10");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1, 2, 3:

                    if (quantidade >= 10) {
                        System.out.println("Limite de 10 computadores já foi atingido!");
                        break;
                    }

                    if (opcao == 1) {
                        carrinho[quantidade] = p1;
                        cliente.addComputador(p1, quantidade);
                    } else if (opcao == 2) {
                        carrinho[quantidade] = p2;
                        cliente.addComputador(p2, quantidade);
                    } else {
                        carrinho[quantidade] = p3;
                        cliente.addComputador(p3, quantidade);
                    }

                    quantidade++;
                    System.out.println("Computador adicionado ao carrinho!");
                    break;

                case 0:
                    System.out.println("Finalizando compra...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre 0 e 3.");
            }

        } while (opcao != 0);

        // RESUMO
        System.out.println("--------Dados do Cliente--------");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("");

        for (int i = 0; i < quantidade; i++) {
            carrinho[i].mostraPCConfigs();
        }

        float total = cliente.calculaTotalCompra();

        System.out.println("Total da compra: R$" + total);

        // FINAL
        ProcessarPedido.processar(carrinho);

        scanner.close();
    }
}
