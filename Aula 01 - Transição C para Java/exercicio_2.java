import java.util.Random;

public class exercicio_2 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] ParImpar = new int[2];

        Random rand = new Random();

        // Preencher e imprime o vetor com números aleatórios entre 0 e 100
        System.out.print("vetorA[");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(101);
            if (i != vetorA.length - 1) {
                System.out.print(vetorA[i] + ", ");
            } else {
                System.out.println(vetorA[i] + "]");
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                ParImpar[0] += 1;
            } else {
                ParImpar[1] += 1;
            }
        }
        // System.out.println("ParImpar[%d, %d]", ParImpar[0], ParImpar[1]);
        System.out.println("ParImpar[" + ParImpar[0] + "," + ParImpar[1] + "]");

    }

}
