// Programa que lê números inteiros até que o zero seja lido. Ao final, mostrar a soma dos números lidos, utilizando a estrutura repetitiva "While".

import java.util.Scanner;
import java.util.Locale;

public class While01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            System.out.print("Digite um valor inteiro: ");
            x = sc.nextInt();
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}