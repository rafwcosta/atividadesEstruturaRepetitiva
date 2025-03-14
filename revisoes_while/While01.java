package revisoes_while;

import java.util.Locale;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida!");
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}