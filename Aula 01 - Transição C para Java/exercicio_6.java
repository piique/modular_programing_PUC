import java.util.Scanner;

public class exercicio_6 {

    public static void main(String[] args) {
        System.out.print("Digite a quantidade N de conjuntos: ");
        int n = Integer.parseInt(System.console().readLine());
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Digite o primeiro inteiro: ");
            int inteiro1 = Integer.parseInt(System.console().readLine());
            System.out.print("Digite o segundo inteiro: ");
            int inteiro2 = Integer.parseInt(System.console().readLine());
            System.out.print("Digite o terceiro inteiro: ");
            int inteiro3 = scan.nextInt();
            ordenaInteiros(inteiro1, inteiro2, inteiro3);
            n--;
        } while (n > 0);
        scan.close();
    }

    public static void ordenaInteiros(int inteiro1, int inteiro2, int inteiro3) {
        System.out.print("Ordem crescente: ");
        if (inteiro1 > inteiro2 && inteiro1 > inteiro3) {
            if (inteiro2 > inteiro3) {
                System.out.print(inteiro1 + " " + inteiro2 + " " + inteiro3);
            } else {
                System.out.print(inteiro1 + " " + inteiro3 + " " + inteiro2);
            }
        } else if (inteiro2 > inteiro1 && inteiro2 > inteiro3) {
            if (inteiro1 > inteiro3) {
                System.out.print(inteiro2 + " " + inteiro1 + " " + inteiro3);
            } else {
                System.out.print(inteiro2 + " " + inteiro3 + " " + inteiro1);
            }
        } else if (inteiro3 > inteiro1 && inteiro3 > inteiro2) {
            if (inteiro1 > inteiro2) {
                System.out.print(inteiro3 + " " + inteiro1 + " " + inteiro2);
            } else {
                System.out.print(inteiro3 + " " + inteiro2 + " " + inteiro1);
            }
        }
    }

}
