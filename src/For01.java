import java.util.Scanner;
import java.util.Locale;

public class For01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas vezes deverão ser somados os números?: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i<n; i++) {
            System.out.print("Digite o valor: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}