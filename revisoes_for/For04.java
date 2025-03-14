package revisoes_for;

import java.util.Locale;
import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de número a serem lidos: ");
        int n = sc.nextInt();

        double divisao;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor de X: ");
            int x = sc.nextInt();
            System.out.print("Digite o valor de Y: ");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível!");
            }
            else {
                divisao = (double) x / y;
                System.out.printf("Resultado: %.1f%n", divisao);
            }
        }

        sc.close();
    }
}