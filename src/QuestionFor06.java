import java.util.Scanner;
import java.util.Locale;

public class QuestionFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        for (int i=1; i<n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}