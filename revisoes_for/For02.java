package revisoes_for;

import java.util.Locale;
import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entrada
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        // Variáveis
        int in = 0;
        int out = 0;

        // Utilização da estrutura condicional "for" para descobrir os valores dentro do intervalo [10,20]
        System.out.println("Digite o(s) valor(es) de X: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        // Saídas
        System.out.println();
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}