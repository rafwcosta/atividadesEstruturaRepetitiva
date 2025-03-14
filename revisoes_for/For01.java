package revisoes_for;

import java.util.Locale;
import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entrada
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        // Utilização da condição For para imprimir na tela os valores ímpares de 1 até x
        System.out.println("ímpares de " + x + ":");
        for (int i = 1; i < x; i++) {
            if (i % 2 != 0) {
                // Saída
                System.out.println(i);
            }
        }

        sc.close();
    }
}