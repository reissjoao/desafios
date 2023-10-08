package desafioOrganizandoAtivos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class OrdenarAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a quantidade de ativos
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Criar uma lista para armazenar os ativos
        ArrayList<String> ativos = new ArrayList<>();

        // Ler os tipos de ativos e adicioná-los à lista
        for (int i = 0; i < quantidadeAtivos; i++) {
            String tipoAtivo = scanner.nextLine();
            ativos.add(tipoAtivo);
        }

        // Ordenar a lista de ativos em ordem alfabética
        Collections.sort(ativos);

        // Exibir os ativos ordenados
        for (String ativo : ativos) {
            System.out.println(ativo);
        }

        scanner.close();
    }
}
