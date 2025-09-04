
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int menor18 = 0;
        double iTotal = 0;
        double[] vIdade = new double [5];
        double aTotal = 0;
        double maior80 = 0;

        int i;
        for(i = 0; i < 5; i++){
            for(int j = 0; j < 11; j++){

                System.out.printf("Informe a idade do time [%i] jogador [%i]: ",(i+1),(j+1));
                int idade = teclado.nextInt();

                iTotal += idade;

                if(idade < 18){
                    menor18 ++;
                }

                System.out.printf("Informe a peso do time [%i] jogador [%i]: ",(i+1),(j+1));
                float peso = teclado.nextFloat();
                
                if(peso > 80){
                    maior80 ++;
                }

                System.out.printf("Informe a altura do time [%i] jogador [%i]: ",(i+1),(j+1));
                float altura = teclado.nextFloat();

                aTotal += altura;

            }

            vIdade[i] = iTotal;

        }

        System.out.println("Quantidade total de jogadores menores que 18 é: "+menor18);

        for(i = 0; i < 5; i++){
            System.out.printf("Altura média do time [%i]: %0.2f\n",(i+1),(vIdade[i]/11));
        }

        System.out.println("Média da altura de todos os jogadores: "+(aTotal/55));

        System.out.printf("Porcentagem de jogadores acima de 80Kg: %0.2f %%%",(maior80/55*100));
    }
}
