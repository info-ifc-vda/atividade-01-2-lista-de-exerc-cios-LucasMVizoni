import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();

        System.out.println("Informe o valor da hora trabalhado: ");
        float valor = teclado.nextFloat();

        double bruto = horas * valor;

        System.out.println("O salário bruto é de: R$ "+bruto);

        System.out.println("Imposto: R$ "+bruto*0.3);

        System.out.println("O salário liquido é de: R$ "+ (bruto - bruto*0.3));
    }
}
