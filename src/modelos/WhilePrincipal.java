package modelos;

import java.util.Scanner;

public class WhilePrincipal {
    private String nome;
    private double valor;


    public void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite do cartão: ");
        double credito = scanner.nextDouble();

        double saldo = credito;
        int escolha = 1;
        while (escolha != 0) {
            System.out.println("Nome produto: ");
            this.nome = scanner.next();
            System.out.println("Preço: ");
            this.valor = scanner.nextDouble();
            if (this.valor > saldo) {
                System.out.println("********************");
                System.out.println("COMPRAS REALIZADAS:\n");
                ListaDeCompras.getListaDeCompras().forEach((nome, valor) -> {
                    System.out.println( nome + " - R$%.2f".formatted(valor));
                });
                System.out.println("\n********************\n");
                break;
            } else {
                saldo -= this.valor;
                System.out.printf("Compra realizada com sucesso.\n");
                ListaDeCompras.getListaDeCompras().put(this.nome,this.valor);
                System.out.printf("\nNovo Limite: R$%.2f\n", saldo);
            }
            System.out.println("Digite 1 para continuar comprando ou 0 para sair");
            escolha = scanner.nextInt();
            while (escolha != 1 && escolha != 0) {
                System.out.println("Opção inválida, tente novamente");
                escolha = scanner.nextInt();
            }
        }

        System.out.println(ListaDeCompras.getListaDeCompras());
    }
}
