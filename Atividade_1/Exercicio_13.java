import java.util.Random;

public class Exercicio_13 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] V1 = new int[10], V2 = new int[5];
        int[] vResult1 = new int[10], vResult2 = new int[10];
        int i, j;


        System.out.println("Vetor 1:");
        for (i = 0; i < 10; i++) {
            V1[i] = random.nextInt(1, 20);
            System.out.print(V1[i] + " ");
        }

        System.out.println("\nVetor 2:");
        for (i = 0; i < 5; i++) {
            V2[i] = random.nextInt(1, 20);
            System.out.print(V2[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            if (V1[i] % 2 == 0) {
                int soma = 0;
                for (j = 0; j < 5; j++) {
                    soma += V2[j];
                }
                vResult1[i] = V1[i] + soma;
            } else {
                vResult1[i] = 0;
            }
        }

        for (i = 0; i < 10; i++) {
            if (V1[i] % 2 != 0) {
                int div = 0;
                for (j = 0; j < 5; j++) {
                    if (V1[i] % V2[j] == 0) {
                        div++;
                    }
                }
                vResult2[i] = div;
            } else {
                vResult2[i] = 0;
            }
        }

        System.out.println("\nPrimeiro vetor resultante (apenas números pares somados):");
        for (i = 0; i < 10; i++) {
            if (vResult1[i] != 0) {
            System.out.print(vResult1[i] + " ");
            }
        }

        System.out.println("\nSegundo vetor resultante:");
        for (i = 0; i < 10; i++) {
            System.out.print(vResult2[i] + " ");
        }
    }
}
