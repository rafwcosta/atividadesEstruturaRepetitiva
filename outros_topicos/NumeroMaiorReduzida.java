import java.util.Locale;
import java.util.Scanner;

public class NumeroMaiorReduzida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entradas
        System.out.println("Digite 3 números: ");
        System.out.print("1: ");
        int a = sc.nextInt();
        System.out.print("2: ");
        int b = sc.nextInt();
        System.out.print("3: ");
        int c = sc.nextInt();

        // Criando a função para que o programa fique mais enxuto
        int higher = max(a, b, c);

        // Criando a função responsável para mostrar na tela o resultado
        showResult(higher);

        sc.close();
    }

    // Criando a função "max"
    
    /*
     * public = para que a função fique disponível em outras classes
     * static = para que a função possa ser chamada independente de se criar um objeto
    */
    public static int max(int x, int y, int z) {
        // Implementando a lógica da função
        int aux; // variável que só vai existir no escopo dessa função
        
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > x && y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux; // para indicar que essa função deve retornar esse valor
    }

    // void = para retornar uma mensagem na tela, um valor vazio (void)
    public static void showResult(int valor) {
        System.out.println("Maior: " + valor);
    }
}