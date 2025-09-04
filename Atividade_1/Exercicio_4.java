
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o código do produto comprado: ");
        int cod = teclado.nextInt();

        System.out.println("Informe a quantidade comprada do produto: ");
        int quant = teclado.nextInt();

        float valor;

        if((cod >= 1) && (cod <= 10)){
            valor = 10;
        }else if((cod > 10) && (cod <=20)){
            valor = 15;
        }else if((cod > 20) && (cod <=30)){
            valor = 20;
        }else{
            valor = 40;
        }

        double total = valor * quant;
        
        double des;

        if(total <= 250){
            des = total * 0.05;
        }else if((total > 250) && (total <= 500)){
            des = total * 0.1;
        }else{
            des = total * 0.15;
        }

        System.out.println("O valor total a pagar é: R$ "+(total-des));
        
    }
}
