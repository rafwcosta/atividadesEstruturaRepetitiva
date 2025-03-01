import java.util.Scanner;
import java.util.Locale;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o tipo de combustível abastecido:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        System.out.print("Resposta: ");
        int combustivel = sc.nextInt();

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            }
            else if (combustivel == 2) {
                gasolina += 1;
            }
            else if (combustivel == 3) {
                diesel += 1;
            }

            System.out.print("Resposta: ");
            combustivel = sc.nextInt();
        }

        System.out.println("Programa encerrado.");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}