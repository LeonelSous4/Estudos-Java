package Exercicios;

import java.util.Scanner;

public class CadastroLoja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();

        System.out.print("Digite a idade da loja (em anos): ");
        int idadeLoja = scanner.nextInt();

        System.out.print("Digite o faturamento da loja: ");
        double faturamentoMensal = scanner.nextDouble();

        if (idadeLoja < 1) {
            System.out.println("Status: Loja nova");
        } else if (idadeLoja >= 1 && idadeLoja <= 5) {
            System.out.println("Status: Loja em consolidação");
        } else {
            System.out.println("Status: Loja consolidada");
        }

        System.out.print("Digite o porte da loja (1- Pequena, 2- Média, 3- Grande): ");
        int porte = scanner.nextInt();

        switch (porte) {
            case 1:
                System.out.println("Porte: Pequena");
                break;
            case 2:
                System.out.println("Porte: Média");
                break;
            case 3:
                System.out.println("Porte: Grande");
                break;
            default:
                System.out.println("Porte Inválido");
                break;
        }

        System.out.println("\n--- Produtos Disponíveis ---");
        String[] produtos = {"cafe", "arroz", "farinha", "feijao"};

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + produtos[i]);
        }

        String opcao;

        do {
            System.out.println("\n--- MENU DE CONSULTA ---");
            System.out.println("Deseja ver o faturamento anual estimado? (s/n)");
            System.out.print("Opção: ");

            opcao = scanner.next().trim().toLowerCase();

            switch (opcao) {
                case "s":
                    double faturamentoAnual = faturamentoMensal * 12;
                    System.out.printf("-> O faturamento anual estimado é: R$ %.2f\n", faturamentoAnual);
                    break;

                case "n":
                    System.out.println("Saindo do menu...");
                    break;

                default:
                    System.out.println("Opção inválida! Digite apenas 's' para sim ou 'n' para não.");
                    break;
            }

        } while (!opcao.equals("n"));

        String mensagemResumo = "Resumo: a loja " + nomeLoja + " tem " + idadeLoja + " anos e faturamento mensal de R$ " + faturamentoMensal + ".";
        System.out.println("\n" + mensagemResumo);

        scanner.close();
    }
}