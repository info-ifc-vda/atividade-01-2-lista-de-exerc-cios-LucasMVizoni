
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = teclado.nextInt();

        double fatorial = 1;

        do { 
            
            fatorial *= num;
            num --;

        } while (num != 0);
        
        System.out.println("Fatorial é de: "+fatorial);
    }
}
