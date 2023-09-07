public class exercicio_4 {

    public static void main(String[] args) {
        int opcao = 0;
        float notas[] = new float[3];
        do {
            System.out.println("1 - Cadastrar notas Aluno");
            System.out.println("2 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(System.console().readLine());
            switch (opcao) {
                case 1:
                    System.out.print("Nota 1: ");
                    notas[0] = Float.parseFloat(System.console().readLine());
                    System.out.print("Nota 2: ");
                    notas[1] = Float.parseFloat(System.console().readLine());
                    System.out.print("Nota 3: ");
                    notas[2] = Float.parseFloat(System.console().readLine());
                    Aluno aluno = new Aluno(notas);
                    System.out.println("Média Ponderada: " + aluno.calculaMedia('P'));
                    System.out.println("Média Aritmética: " + aluno.calculaMedia('A'));
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;

                default:
                    break;
            }
        } while (opcao != 2);
    }

    public static class Aluno {
        private float notas[] = new float[3];

        public Aluno(float[] notas) {
            this.notas = notas;
        }

        public Aluno(float nota1, float nota2, float nota3) {
            setNotas(nota1, nota2, nota3);
        }

        public void setNotas(float nota1, float nota2, float nota3) {
            notas[0] = nota1;
            notas[1] = nota2;
            notas[2] = nota3;
        }

        public float calculaMedia(char param) {
            float media = 0;
            if (param == 'A') {
                media = (notas[0] + notas[1] + notas[2]) / notas.length;
            } else if (param == 'P') {
                media = (notas[0] * 5 + notas[1] * 3 + notas[2] * 2) / 10;
            }
            return media;
        }
    }

}
