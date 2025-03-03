import java.util.Scanner;
import java.util.Locale;

public class QuestionFor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (int i=1; i<=n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);

        sc.close();
    }
}