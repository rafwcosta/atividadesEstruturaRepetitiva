import java.util.Scanner;
import java.util.Locale;

public class QuestionFor02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quanto valores deverão ser lidos?: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i<n ; i++) {

            System.out.print("Digite o valor de X: ");
            int x = sc.nextInt();
            
            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }

        }

        System.out.println("In: " + in);
        System.out.println("Out: " + out);

        sc.close();

    }
}