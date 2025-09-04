import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe números para calcular o Cubo e a Raiz (0 para sair):");
        System.out.println("Número\tCubo\tRaiz");
        System.out.println("-------------------------");

        int num;
        do {
            num = teclado.nextInt();
            if (num != 0) {
                System.out.println(num+"\t"+Math.pow(num, 3)+"\t"+String.format("%.2f", Math.sqrt(num)));
            }
        } while (num != 0);
    }
}
