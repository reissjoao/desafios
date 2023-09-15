package desafioJurosCompostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite o valor Inicial: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Digite o periodo em anos: ");
        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        // TODO: Iterar, baseado no período em anos, para cálculo do valorFinal com os juros.
        for (int i = 1; i <= periodo; i++) {
            valorFinal += valorFinal * taxaJuros; // Adiciona os juros ao valor final a cada ano
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}