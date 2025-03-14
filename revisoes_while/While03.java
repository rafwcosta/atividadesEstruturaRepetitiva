package revisoes_while;

import java.util.Locale;
import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Tipos dos combustíveis:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Finalizar programa");
        System.out.println();
        System.out.print("Digite o tipo de combustível: ");
        int tipoDoCombustivel = sc.nextInt();

        while (tipoDoCombustivel != 4) {
            if (tipoDoCombustivel == 1) {
                alcool += 1;
            }
            else if (tipoDoCombustivel == 2) {
                gasolina += 1;
            }
            else {
                diesel += 1;
            }

            System.out.print("Digite o tipo de combustível: ");
            tipoDoCombustivel = sc.nextInt();
        }

        System.out.println("Programa finalizado!");
        System.out.println();
        System.out.println("Quantida de álcool: " + alcool);
        System.out.println("Quantidade de gasolina: " + gasolina);
        System.out.println("Quantidade de diesel: " + diesel);

        sc.close();
    }
}