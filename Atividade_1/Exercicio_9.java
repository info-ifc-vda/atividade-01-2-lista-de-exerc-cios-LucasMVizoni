
import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = teclado.nextInt();
        
        int div = 2, flag = 0;
        do { 
            if(num % div == 0){
                flag++;
            }
            div ++;
        } while (div <= num);

        if (flag == 1){
            System.out.println("O número "+num+" é primo.");
        } else {
            System.out.println("O número "+num+" não é primo.");
        }
    }
}
