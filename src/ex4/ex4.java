package ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ciao inserisci un numero per iniziare i ciclo For");
        int numero = scanner.nextInt();
        cicloFor(numero);
        scanner.close();
    }

    public static void cicloFor(int numero) {
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

}
