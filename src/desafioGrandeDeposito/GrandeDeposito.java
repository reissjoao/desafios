package desafioGrandeDeposito;

import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.printf("Deposito realizado com sucesso!\n Saldo atual: R$ %.2f%n " , valor);
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.printf("Encerrando o programa...");
        } else {
            //TODO: Imprimir a mensagem de encerrar o programa.
            System.out.printf("Valor invalido! Digite um valor maior que zero.");
        }
    }
}
