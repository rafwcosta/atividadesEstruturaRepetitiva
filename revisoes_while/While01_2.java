package revisoes_while;

import java.util.Scanner;
import java.util.Locale;

public class While01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter password: ");
        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Incorrect password!");
            System.out.print("Enter password: ");
            password = sc.nextInt();
        }

        System.out.println("Access allowed!");

        sc.close();
    }
}