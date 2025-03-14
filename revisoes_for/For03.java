package revisoes_for;

import java.util.Locale;
import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entrada
        System.out.print("Digite a quantidade de números a serem lidos: ");
        int n = sc.nextInt();

        // Utilização da estrutura repetitiva "for" para descobrir a média ponderada dos valores
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor de A: ");
            double a = sc.nextDouble();
            System.out.print("Digite o valor de B: ");
            double b = sc.nextDouble();
            System.out.print("Digite o valor de C: ");
            double c = sc.nextDouble();

            // Cálculo
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            // Saída
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}