package revisoes_while;

import java.util.Locale;
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }

            System.out.print("Digite o valor de X: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextInt();
        }

        System.out.println("Nulo");

        sc.close();
    }
}