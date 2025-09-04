import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int[] cod = new int[10];
        double[] sal = new double[10];
        int i, j;

        
        System.out.println("Cadastro de contas: ");
        for (i = 0; i < 10; i++) {
            System.out.print("Informe o código da conta "+(i + 1)+": ");
            cod[i] = teclado.nextInt();

            for (j = 0; j < i; j++) {
                if (cod[i] == cod[j]) {
                    System.out.println("Código já cadastrado! Informe outro código.");
                    i--;
                    break;
                }
            }

            System.out.print("Informe o saldo da conta "+(i + 1)+": ");
            sal[i] = teclado.nextDouble();
        }

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar ativo bancário");
            System.out.println("4 - Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.print("Informe o código da conta para depósito: ");
                int codDepo = teclado.nextInt();
                System.out.print("Informe o valor do depósito: ");
                double valDepo = teclado.nextDouble();

                boolean conta = false;
                for (i = 0; i < 10; i++) {
                    if (cod[i] == codDepo) {
                        sal[i] += valDepo;
                        System.out.println("Depósito realizado com sucesso!");
                        conta = true;
                        break;
                    }
                }
                if (!conta) {
                    System.out.println("Conta não encontrada!");
                }
            } else if (opcao == 2) {
                System.out.print("Informe o código da conta para saque: ");
                int codSaq = teclado.nextInt();
                System.out.print("Informe o valor do saque: ");
                double valSaq = teclado.nextDouble();

                boolean conta = false;
                for (i = 0; i < 10; i++) {
                    if (cod[i] == codSaq) {
                        if (sal[i] >= valSaq) {
                            sal[i] -= valSaq;
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                        conta = true;
                        break;
                    }
                }
                if (!conta) {
                    System.out.println("Conta não encontrada!");
                }
            } else if (opcao == 3) {
                double ativoBancario = 0;
                for (i = 0; i < 10; i++) {
                    ativoBancario += sal[i];
                }
                System.out.println("Ativo bancário total: R$ " + ativoBancario);
            } else if (opcao == 4) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }
}
