import java.util.Locale;
import java.util.Scanner;

// Programa principal
public class NumeroMaiorReduzido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite 3 valores: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        sc.close();
    }

    // Lógica da função "int maior = max(a, b,c);"
    public static int max(int a,int b,int c) {
        int aux;

        if (a > b && a > c) {
            aux = a;
        }
        else if (b > a && b > c) {
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }

    // Lógica da função "showResult(maior);"
    public static void showResult(int valor) {
        System.out.println("Maior: " + valor);
    }
}