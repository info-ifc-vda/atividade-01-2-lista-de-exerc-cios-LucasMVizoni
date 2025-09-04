import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        float[] L = new float[3];
        float[] A = new float[3];

        System.out.println("Informe os lados do triângulo:");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "º lado: ");
            L[i] = teclado.nextFloat();
        }

        System.out.println("Informe os ângulos do triângulo:");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "º ângulo: ");
            A[i] = teclado.nextFloat();
        }

        if((L[0] == L[1]) && (L[0] == L[2])){
            System.out.println("O triângulo é Equilátero!");
        }else if((L[0] != L[1]) && (L[0] != L[2]) && (L[1] != L[2])){
            System.out.println("O triângulo é Escaleno!");
        }else{
            System.out.println("O triângulo é Isóceles!");
        }

        if((A[0] == 90) || (A[1] == 90) || (A[2] == 90)){
            System.out.println("O triângulo é Retângulo!");
        }else if((A[0] > 90) || (A[1] > 90) || (A[2] > 90)){
            System.out.println("O triângulo é Obtusângulo!");
        }else{
            System.out.println("O triângulo é Acutângulo!");
        }

    }
}
