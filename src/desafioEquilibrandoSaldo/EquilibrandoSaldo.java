package desafioEquilibrandoSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {      

        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.println("Saldo Atual: ");
        double saldoAtual = leitorDeEntradas.nextDouble();

        System.out.println("Digite o valor depositado: ");
        double valorDepositado = leitorDeEntradas.nextDouble();

        System.out.println("Digite o valor de Retirada: ");
        double valorRetirada = leitorDeEntradas.nextDouble();

        double saldoAtualizado = saldoAtual + valorDepositado - valorRetirada;

        if (saldoAtualizado < 0) {
           System.out.println("Valor indisponivel! Saldo negativo");     
        } else {             
            System.out.println("Saldo atualizado na conta: " + saldoAtualizado);
        }        
    }
}
