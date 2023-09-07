import java.util.ArrayList;

public class exercicio_5 {

    public static void main(String[] args) {
        int opcao = 0;
        ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
        do {
            System.out.println("1 - Cadastrar Habitante");
            System.out.println("2 - Média Salarial");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(System.console().readLine());
            switch (opcao) {
                case 1:
                    System.out.print("Salário: ");
                    float salario = Float.parseFloat(System.console().readLine());
                    System.out.print("Quantidade de filhos: ");
                    int qtd_filhos = Integer.parseInt(System.console().readLine());
                    Habitante habitante = new Habitante(salario, qtd_filhos);
                    habitantes.add(habitante);
                    break;
                case 2:
                    System.out.println("Média salarial: " + calculaMediaSalarial(habitantes));
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        } while (opcao != 3);
    }

    public static float calculaMediaSalarial(ArrayList<Habitante> habitantes) {
        float media = 0;
        for (Habitante habitante : habitantes) {
            media += habitante.getSalario();
        }
        return media;
    }

    public static class Habitante {
        private float salario;
        private int qtd_filhos;

        public Habitante(float salario, int qtd_filhos) {
            this.salario = salario;
            this.qtd_filhos = qtd_filhos;
        }

        public float getSalario() {
            return salario;
        }

        public float getQtdFilhos() {
            return qtd_filhos;
        }

    }

}
