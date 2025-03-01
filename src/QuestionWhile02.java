import java.util.Scanner;
import java.util.Locale;

public class QuestionWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de X na coordenada: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y na coordenada: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1° quadrante.");
            }
            else if (x < 0 && y > 0) {
                System.out.println("2° quadrante.");
            }
            else if (x < 0 && y < 0) {
                System.out.println("3° quadrante.");
            }
            else {
                System.out.println("4° quadrante.");
            }

            System.out.print("Digite o valor de X na coordenada: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de Y na coordenada: ");
            y = sc.nextInt();
        }

        System.out.println("Um dos pontos foi na origem 0.");

        sc.close();
    }
}