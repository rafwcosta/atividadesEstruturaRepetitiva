package outros_topicos;

import java.util.Locale;
import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite 3 números: ");
        System.out.print("1: ");
        int a = sc.nextInt();
        System.out.print("2: ");
        int b = sc.nextInt();
        System.out.print("3: ");
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