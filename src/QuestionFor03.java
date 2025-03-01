import java.util.Scanner;
import java.util.Locale;

public class QuestionFor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos testes deverão ser realizados?: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Digite o valor de A: ");
            double a = sc.nextDouble();
            System.out.print("Digite o valor de B: ");
            double b = sc.nextDouble();
            System.out.print("Digite o valor de C: ");
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("Média: %.1f%n", media);
            System.out.println();
        }

        sc.close();
    }
}