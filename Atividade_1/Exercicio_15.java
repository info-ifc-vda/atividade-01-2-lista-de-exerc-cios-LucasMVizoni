import java.util.Random;

public class Exercicio_15 {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] M = new int[7][7];
        int[] maiorL = new int[7], menorC = new int[7];
        int i, j;

        System.out.println("Matriz: ");
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                M[i][j] = random.nextInt(1, 101);
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();   
        }

        for (i = 0; i < 7; i++) {
            int maior = M[i][0];
            for (j = 1; j < 7; j++) {
                if (M[i][j] > maior) {
                    maior = M[i][j];
                }
            }
            maiorL[i] = maior;
        }

        for (j = 0; j < 7; j++) {
            int menor = M[0][j];
            for (i = 1; i < 7; i++) {
                if (M[i][j] < menor) {
                    menor = M[i][j];
                }
            }
            menorC[j] = menor;
        }

        System.out.println("\nMaior elemento de cada linha:");
        for (i = 0; i < 7; i++) {
            System.out.print(maiorL[i] + " ");
        }

        System.out.println("\nMenor elemento de cada coluna:");
        for (i = 0; i < 7; i++) {
            System.out.print(menorC[i] + " ");
        }
    }
}
