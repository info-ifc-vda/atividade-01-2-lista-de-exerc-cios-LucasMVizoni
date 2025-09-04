
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int i, div = 2, flag = 0;
        int[] num = new int[10];

        for(i = 0; i < 10; i++){
            System.out.print("Informe um número: ");
            num[i] = teclado.nextInt();
        }

        for(i = 0; i < 10; i++){
            do { 
                if(num[i] % div == 0){
                flag++;
                }
                div ++;
            } while (div <= num[i]);

            div = 2;

            if (flag == 1){
                System.out.println("O número "+num[i]+" é primo.");
            } else {
                System.out.println("O número "+num[i]+" não é primo.");
            }

            flag = 0;
        }
    }
}
