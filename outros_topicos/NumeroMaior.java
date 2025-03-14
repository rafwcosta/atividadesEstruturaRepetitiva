import java.util.Locale;
import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite 3 valores: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Maior: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Maior: " + b);
        }
        else {
            System.out.println("Maior: " + c);
        }

        sc.close();
    }
}