import java.util.Random;

public class exercicio_7 {
    private static final int TAMANHO_VETOR = 20;
    private static final int VALOR_ALEATORIO_MAXIMO = 20;

    public static void main(String[] args) {
        int[] vetorA = new int[TAMANHO_VETOR];
        int[] vetorB = new int[TAMANHO_VETOR];

        Random rand = new Random();

        // Preenche e printa vetorA
        System.out.print("vetorA[");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetorA[i] = rand.nextInt(VALOR_ALEATORIO_MAXIMO + 1);

            if (i != TAMANHO_VETOR - 1) {
                System.out.print(vetorA[i] + ", ");
            } else {
                System.out.println(vetorA[i] + "]");
            }
        }

        // Preenche e printa vetorB
        System.out.print("vetorB[");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetorB[i] = rand.nextInt(VALOR_ALEATORIO_MAXIMO + 1);
            if (i != TAMANHO_VETOR - 1) {
                System.out.print(vetorB[i] + ", ");
            } else {
                System.out.println(vetorB[i] + "]");
            }
        }

        int[] vetorResultante = somaVetorEInverte(vetorA, vetorB);

        // Printa vetor resultante
        System.out.print("vetorResultante[");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            if (i != TAMANHO_VETOR - 1) {
                System.out.print(vetorResultante[i] + ", ");
            } else {
                System.out.println(vetorResultante[i] + "]");
            }
        }

    }

    public static int[] somaVetorEInverte(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[TAMANHO_VETOR];
        int count = TAMANHO_VETOR - 1;

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetorC[count] = vetorA[i] + vetorB[i];
            count--;
        }
        return vetorC;
    }

}
