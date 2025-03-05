package revisoes_while;

import java.util.Locale;
import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Tipo de combustível: ");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.err.println("4. Finalizar o programa");
        System.out.print("Resposta: ");
        int tipo = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            }
            else if (tipo == 2) {
                gasolina += 1;
            }
            else if (tipo == 3) {
                diesel += 1;
            }

            System.out.print("Resposta: ");
            tipo = sc.nextInt();
        }

        System.out.println("Programa finalizado!");
        System.out.println();
        System.out.println("Quantidade de álcool: " + alcool);
        System.out.println("Quantidade de gasolina: " + gasolina);
        System.out.println("Quantidade de diesel: " + diesel);

        sc.close();
    }
}