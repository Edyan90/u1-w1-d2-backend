package ex1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------- ex1-----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ciao inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println(stringaPariDispari(stringa));
        System.out.println("----------------------------------------- ex2-----------------------------------------------");
        System.out.println("ciao inserisci un anno per sapere se è bisestile");
        int anno = scanner.nextInt();
        System.out.println(annoBisestile(anno));
        scanner.close();
    }

    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0;
    }
}
