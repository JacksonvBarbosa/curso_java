import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        //Variaveis
        String nome = "Jackson dos Santos Ventura";
        String tipoConta = "Corrente";
        double saldo = 3000;
        int opcao = 0;

        //Apresentação de dados
        System.out.println("********************************** \n");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("********************************** \n");

        //Menu de Opções

        String menu = """
                Operações
                
                1 - Consultar saldos
                2 - Recebebimento - PIX/TED/DEPOSITOS etc
                3 - Transferências - PIX/TED etc
                4 - Sair
                """;
        System.out.println(menu);

        //lógica principal
        while(opcao != 4) {
            Scanner op = new Scanner(System.in);
            System.out.println("Digite a opção desejada: ");
            opcao = op.nextInt();
            if (opcao == 1) {
                System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
            } else if (opcao == 2) {
                System.out.println("Digite o valor a receber: R$ ");
                double receber = op.nextDouble();

                saldo += receber;
            } else if(opcao == 3) {
                System.out.println("Digite o valor a transferir: R$ ");
                double transferir = op.nextDouble();

                if(transferir < saldo) {
                    saldo -= transferir;
                } else {
                    System.out.println("Saldo abaixo do valor requerido! Não foi possivel efetuar a transferência");
                }

            } else if(opcao > 4) {
                System.out.println("Opção Invalida! Tente Novamente!");
            }
        }

        System.out.println("Volte sempre!");

    }

}
