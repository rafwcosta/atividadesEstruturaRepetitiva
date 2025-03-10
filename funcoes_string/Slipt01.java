package funcoes_string;

import java.util.Locale;
import java.util.Scanner;

public class Slipt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        sc.close();
    }
}
