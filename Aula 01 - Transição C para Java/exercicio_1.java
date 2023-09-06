import java.util.Random;

public class exercicio_1 {
    public static void main(String[] args) {

        int[] vetorA = new int[15];
        long[] vetorB = new long[15];

        Random rand = new Random();

        // Preencher e imprime o vetor com números aleatórios entre 0 e 15
        System.out.print("vetorA[");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(16);
            if (i != vetorA.length - 1) {
                System.out.print(vetorA[i] + ", ");
            } else {
                System.out.println(vetorA[i] + "]"); // imprime o último elemento sem a vírgula
            }
        }

        // preenche e imprime vetorB com fatoriais de vetorA
        System.out.print("vetorB[");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Fatorial.calculaFatorial(vetorA[i]);
            if (i != vetorA.length - 1) {
                System.out.print(vetorB[i] + ", ");
            } else {
                System.out.println(vetorB[i] + "]"); // imprime o último elemento sem a vírgula
            }
        }

    }

    public long fatorial(long value) {
        long result = 1;

        for (long i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    public class Fatorial {
        static long[] calculedFatorials = new long[100];
        static long lastCalculedFatorial = 0;

        public static long calculaFatorial(int value) {
            if (value < 2) {
                return 1;
            }

            if (value <= lastCalculedFatorial) {
                return calculedFatorials[value];
            }

            long result = value * calculaFatorial(value - 1);
            calculedFatorials[value] = result;

            return result;
        }

    }
}
