import java.time.LocalDate;
import java.util.ArrayList;

public class exercicio_3 {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario funcionario = new Funcionario("Maria", 'F', LocalDate.of(1990, 5, 15));
        Funcionario funcionario2 = new Funcionario("João", 'M', LocalDate.of(1990, 5, 15));
        Funcionario funcionario3 = new Funcionario("Ana", 'F', LocalDate.of(1995, 8, 20));
        Funcionario funcionario4 = new Funcionario("Pedro", 'M', LocalDate.of(1985, 3, 10));
        Funcionario funcionario5 = new Funcionario("Laura", 'F', LocalDate.of(1992, 12, 5));
        Funcionario funcionario6 = new Funcionario("Carlos", 'M', LocalDate.of(1988, 7, 3));
        Funcionario funcionario7 = new Funcionario("Sofia", 'F', LocalDate.of(1987, 6, 25));
        Funcionario funcionario8 = new Funcionario("Ricardo", 'M', LocalDate.of(1993, 9, 15));
        Funcionario funcionario9 = new Funcionario("Mariana", 'F', LocalDate.of(1998, 2, 18));
        Funcionario funcionario10 = new Funcionario("Luís", 'M', LocalDate.of(1991, 11, 8));
        Funcionario funcionario11 = new Funcionario("Isabel", 'F', LocalDate.of(1986, 4, 30));
        Funcionario funcionario12 = new Funcionario("António", 'M', LocalDate.of(1996, 1, 22));
        Funcionario funcionario13 = new Funcionario("Catarina", 'F', LocalDate.of(1989, 10, 12));
        Funcionario funcionario14 = new Funcionario("Paulo", 'M', LocalDate.of(1994, 7, 6));
        Funcionario funcionario15 = new Funcionario("Beatriz", 'F', LocalDate.of(1997, 6, 9));

        funcionarios.add(funcionario);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        funcionarios.add(funcionario6);
        funcionarios.add(funcionario7);
        funcionarios.add(funcionario8);
        funcionarios.add(funcionario9);
        funcionarios.add(funcionario10);
        funcionarios.add(funcionario11);
        funcionarios.add(funcionario12);
        funcionarios.add(funcionario13);
        funcionarios.add(funcionario14);
        funcionarios.add(funcionario15);

        gerarRelatorio(funcionarios);

    }

    public static void gerarRelatorio(ArrayList<Funcionario> funcionarios) {
        int totalFuncionarios = funcionarios.size();
        int totalFeminino = 0;
        int totalMasculino = 0;
        int idadeTotalGeral = 0;
        int idadeTotalFeminino = 0;
        int idadeTotalMasculino = 0;

        for (Funcionario funcionario : funcionarios) {
            idadeTotalGeral += calcularIdade(funcionario.getDataNascimento());

            if (funcionario.getSexo() == 'F') {
                totalFeminino++;
                idadeTotalFeminino += calcularIdade(funcionario.getDataNascimento());
            } else if (funcionario.getSexo() == 'M') {
                totalMasculino++;
                idadeTotalMasculino += calcularIdade(funcionario.getDataNascimento());
            }
        }

        double percentualFeminino = (double) totalFeminino / totalFuncionarios * 100.0;
        double percentualMasculino = (double) totalMasculino / totalFuncionarios * 100.0;
        double idadeMediaGeral = (double) idadeTotalGeral / totalFuncionarios;
        double idadeMediaFeminino = (double) idadeTotalFeminino / totalFeminino;
        double idadeMediaMasculino = (double) idadeTotalMasculino / totalMasculino;

        System.out.println("Quantidade total de funcionários: " + totalFuncionarios);
        System.out.println("Quantidade de funcionários do sexo feminino: " + totalFeminino);
        System.out.println("Percentual de funcionários do sexo feminino: " + percentualFeminino + "%");
        System.out.println("Quantidade de funcionários do sexo masculino: " + totalMasculino);
        System.out.println("Percentual de funcionários do sexo masculino: " + percentualMasculino + "%");
        System.out.println("Idade média geral dos funcionários: " + idadeMediaGeral);
        System.out.println("Idade média dos funcionários do sexo feminino: " + idadeMediaFeminino);
        System.out.println("Idade média dos funcionários do sexo masculino: " + idadeMediaMasculino);
    }

    public static int calcularIdade(LocalDate birthdate) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthdate.getYear();
    }

    public static class Funcionario {
        private String nome;
        private char sexo; // 'M' ou 'F'
        private LocalDate dataNascimento;

        // Construtor
        public Funcionario(String nome, char sexo, LocalDate dataNascimento) {
            this.nome = nome;
            this.sexo = sexo;
            this.dataNascimento = dataNascimento;
        }

        // Getters e Setters para nome
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getters e Setters para sexo
        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        // Getters e Setters para dataNascimento
        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        @Override
        public String toString() {
            return "Funcionario [nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + "]";
        }

    }

}
