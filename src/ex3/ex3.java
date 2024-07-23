package ex3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        split(scanner);
    }

    public static void split(Scanner scanner) {
        while (true) {
            System.out.println("scrivi una stringa");
            String stringa = scanner.nextLine();
            if (Objects.equals(stringa, ":q")) break; //chiedere a Riccardo perché con stringa==":q" non c'era il break
            char[] arrayLettere = stringa.toCharArray();
            System.out.println(Arrays.toString(arrayLettere));
        }
    }
}
