public class exercicio_8 {
    private static final int MATRIX_X = 4;
    private static final int MATRIX_Y = 4;

    public static void main(String[] args) {
        int[][] matriz = new int[MATRIX_X][MATRIX_Y];
        matriz[0][0] = 5;
        matriz[0][1] = 10;
        matriz[0][2] = 7;
        matriz[0][3] = 8;

        matriz[1][0] = 13;
        matriz[1][1] = 4;
        matriz[1][2] = 1;
        matriz[1][3] = 3;

        matriz[2][0] = 9;
        matriz[2][1] = 2;
        matriz[2][2] = 6;
        matriz[2][3] = 5;

        matriz[3][0] = 10;
        matriz[3][1] = 7;
        matriz[3][2] = 4;
        matriz[3][3] = 9;

        System.out.println("Matriz original: ");
        printMatriz(matriz);

        exibeSomaQuadradosDiagonalSecundaria(matriz);

        System.out.println("\nMatriz transposta: ");
        printMatriz(matrizTransposta(matriz));

        System.out.println("\nMatriz multiplicada por 2: ");
        printMatriz(multiplicarMatrixPorInteiro(matriz, 2));

        System.out.println("\nMatriz com linha 3 e coluna 3 invertidas: ");
        inverterLinha3Coluna3(matriz);
        printMatriz(matriz);

    }

    public static int[][] matrizTransposta(int[][] matriz) {
        int[][] transposta = new int[MATRIX_Y][MATRIX_X];

        for (int i = 0; i < MATRIX_X; i++) {
            for (int j = 0; j < MATRIX_Y; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    public static void exibeSomaQuadradosDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < MATRIX_Y; i++) {
            soma += (matriz[i][MATRIX_Y - 1 - i] ^ 2);
        }
        System.out.println("\nSoma dos quadrados da diagonal secundária: " + soma);
    }

    public static int[][] multiplicarMatrixPorInteiro(int[][] matriz, int c) {
        int[][] new_matriz = new int[MATRIX_X][MATRIX_Y];
        for (int i = 0; i < MATRIX_X; i++) {
            for (int j = 0; j < MATRIX_Y; j++) {
                new_matriz[i][j] = matriz[i][j] * c;
            }
        }
        return new_matriz;
    }

    public static void inverterLinha3Coluna3(int[][] matriz) {
        int[][] transposta = matrizTransposta(matriz);

        for (int i = 0; i < MATRIX_X; i++) {
            matriz[i][3] = transposta[i][3];
        }
        for (int i = 0; i < MATRIX_Y; i++) {
            matriz[3][i] = transposta[3][i];
        }

    }

    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < MATRIX_X; i++) {
            for (int j = 0; j < MATRIX_Y; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
