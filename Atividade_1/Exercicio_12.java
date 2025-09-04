import java.util.Random;

public class Exercicio_12 {
    public static void main(String[] args) {
        
        Random random = new Random();

        int i, j, k, aux = 0;
        int[] v1 = new int[10], v2 = new int[10], v3 = new int[20];
        
        System.out.println("Vetor 1: ");
        for(i = 0; i < 10; i++){
            v1[i] = random.nextInt(1, 21);
            System.out.print(v1[i] + " ");
        }

        System.out.println("\nVetor 2: ");
        for(i = 0; i < 10; i++){
            v2[i] = random.nextInt(1, 21);
            System.out.print(v2[i] + " ");
        }

        for(i = 0; i < 10; i++){
            boolean found = false;
            for(j = 0; j < 10; j++){
                if(v1[i] == v2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                boolean added = false;
                for(k = 0; k < aux; k++){
                    if(v1[i] == v3[k]){
                        added = true;
                        break;
                    }
                }
                if(!added){
                    v3[aux] = v1[i];
                    aux++;
                }
            }
        }

        for(i = 0; i < 10; i++){
            boolean found = false;
            for(j = 0; j < 10; j++){
                if(v2[i] == v1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){ 
                boolean added = false;
                for(k = 0; k < aux; k++){
                    if(v2[i] == v3[k]){
                        added = true;
                        break;
                    }
                }
                if(!added){
                    v3[aux] = v2[i];
                    aux++;
                }
            }
        }

        if(aux == 0){
            System.out.println("Nenhum valor único encontrado");
        } else {
            System.out.print("Vetor 3 (valores únicos): ");
            for(i = 0; i < aux; i++){
                System.out.print(v3[i] + " ");
            }
        }
    }
}
