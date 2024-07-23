package ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ciao inserisci un numero compresso tra 0 e 3");
        int numero = scanner.nextInt();
        System.out.println(Lettere(numero));
    }

    public static String Lettere(int numero) {
        if (0 <= numero && numero <= 3) {
            switch (numero) {
                case 0:
                    return "zero";

                case 1:
                    return "uno";

                case 2:
                    return "due";

                case 3:
                    return "true";

                default:
                    return "non hai inserito un numero compresso tra 0 e 3";

            }
        } else {
            return "non hai inserito un numero compresso tra 0 e 3";
        }
    }
}
