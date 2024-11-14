import modelos.ListaDeCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite do cartão: ");
        double credito = scanner.nextDouble();

        double saldo = credito;
        while (credito != 0) {
            System.out.println();
            System.out.println("Nome produto: ");
            String nome = scanner.next();
            System.out.println("Preço: ");
            double valor = scanner.nextDouble();
            if (valor > saldo) {
                System.out.println("Limite insuficiente");
            } else {
                saldo -= valor;
                System.out.printf("%s: R$%.2f\n",nome,valor);
                ListaDeCompras.getListaDeCompras().put(nome,valor);
            }
            System.out.printf("Novo Limite: R$%.2f", saldo);
            System.out.println("Digite 1 para continuar comprando ou 0 para sair\n");
            int escolha = scanner.nextInt();
            credito = escolha;
        }

        System.out.println(ListaDeCompras.getListaDeCompras());
    }
}
