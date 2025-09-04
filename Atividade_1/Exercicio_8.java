import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor a ser pago: ");
        double valor = teclado.nextDouble();

        System.out.print("Informe o valor pago: ");
        double valorPago = teclado.nextDouble();

        if (valorPago < valor) {
            System.out.println("Valor insuficiente.");
            return;
        }

        double troco = valorPago - valor;

        double[] valores = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05};
        int[] quantidades = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            while (troco >= valores[i]) {
                quantidades[i]++;
                troco -= valores[i];
                troco = Math.round(troco * 100.0) / 100.0;
            }
        }

        System.out.println("Troco:");
        for (int i = 0; i < valores.length; i++) {
            if (quantidades[i] > 0) {
                if (valores[i] >= 1) {
                    System.out.println("Notas de R$"+(int) valores[i]+ ": "+quantidades[i]);
                } else {
                    System.out.println("Moedas de R$"+valores[i]+": "+quantidades[i]);
                }
            }
        }
    }
}
