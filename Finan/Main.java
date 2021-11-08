package Finan;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double valorRendimento;
        Scanner scanner = new scanner(System.in);


        int opcaoMenu = 0;

        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Cadastrar Investimento");
            System.out.println("2 - Exibir Lucros");
            System.out.println("3 - Sair");
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1:
                    cadastro(scanner);
                    break;
                case 2:
                    exibirLucros(scanner);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println();
            while (opcaoMenu !=6);
        }
    }


    public static void cadastro(Scanner scanner){

        System.out.println("Selecione onde deseja investir:");
        System.out.println("1 - Tesouro SELIC");
        System.out.println("2 - CDB");
        System.out.println("3 - LCI");
        int opcao = 0;

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do investimento");
                double valorInvestido = scanner.nextDouble();
                Cadastro.setSelic(valorInvestido);
                break;
            case 2:
                System.out.println("Digite o valor do investimento");
                double valorInvestido = scanner.nextDouble();
                Cadastro.setCdb(valorInvestido);
                break;
            case 3:
                System.out.println("Digite o valor do investimento");
                double valorInvestido = scanner.nextDouble();
                Cadastro.setLci(valorInvestido);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println();
        while (opcao !=6);
    }

    public static void exibirLucros(Scanner scanner){
        System.out.println("Digite o rendimento Anual do SELIC");
        double rendimentoSelic = scanner.nextDouble();
        System.out.println("Digite o rendimento Anual do CDB");
        double rendimentoCdb = scanner.nextDouble();
        System.out.println("Digite o rendimento Anual do LCI");
        double rendimentoLci = scanner.nextDouble();
        Lucro.getLucroSelic(rendimentoSelic);
        Lucro.getLucroCdb(rendimentoCdb);
        Lucro.getLucroLci(rendimentoLci);
        break;
    }
}
