import java.util.Scanner;

public class Exercicio_2 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o salário minimo: ");
        float min = teclado.nextFloat();

        System.out.println("Informe a quantidade de Quilowatts consumida: ");
        float quil = teclado.nextFloat();

        System.out.println("O valor do Quilowatt é: R$ "+ min * 0.01);

        System.out.println("Valor a ser pago pela residência: R$ "+ quil * (min * 0.01));
    }
}
