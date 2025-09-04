import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escolha um número: ");
        int num1 = teclado.nextInt();
        System.out.println("Escolhar outro número: ");
        int num2 = teclado.nextInt();

        double fatorial = 1;
        int aux1, aux2, i;

        if(num1 < num2){
            aux1 = num1; aux2 = aux1;
            for(i = aux1; i <= num2; i++){ 
                do { 
                    fatorial *= aux2;
                    aux2 --;
                } while (aux2 != 0);
                System.out.println("Fatorial de "+aux1+" é de: "+fatorial);
                fatorial = 1;
                aux1 ++;
                aux2 = aux1;
            }
        }else if(num1 > num2){
            aux1 = num2; aux2 = aux1;
            for(i = aux1; i <= num1; i++){ 
                do { 
                    fatorial *= aux2;
                    aux2 --;
                } while (aux2 != 0);
                System.out.println("Fatorial de "+aux1+" é de: "+fatorial);
                fatorial = 1;
                aux1 ++;
                aux2 = aux1;
            }
        }
        
    }
}
