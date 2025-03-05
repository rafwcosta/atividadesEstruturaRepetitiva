package revisoes_while;

import java.util.Locale;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entradas
        System.out.print("Coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Coordenada Y: ");
        int y = sc.nextInt();

        // Cálculos com a estrutura repetitiva "while", utilizando também if-else
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1° quadrante.");
            }
            else if (x < 0 && y > 0) {
                System.out.println("2° quadrante.");
            }
            else if (x < 0 && y < 0) {
                System.out.println("3° quadrante.");
            }
            else {
                System.out.println("4° quadrante.");
            }

            System.out.print("Coordenada X: ");
            x = sc.nextInt();
            System.out.print("Coordenada Y: ");
            y = sc.nextInt();
        }

        // Saída, caso a condição while for falsa
        System.out.println("Nulo.");

        sc.close();
    }
}