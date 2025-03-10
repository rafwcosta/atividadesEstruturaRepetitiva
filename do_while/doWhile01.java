package do_while;

import java.util.Locale;
import java.util.Scanner;

public class doWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();

            double f = 9.0 * c / 5.0 + 32.0;
            
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir? (s/n): ");
            resp = sc.next().charAt(0);
            if (resp != 's') {
                System.out.println("O código só aceita 's' ou 'n'. Inicie o programa novamente.");
                sc.close();
                return;
            }
        } while (resp != 'n');

        sc.close();
    }
}