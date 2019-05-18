package J25_2;

import java.util.Scanner;

public class Run {

    // stwórz obiekt klasy Kalkulator a następnie
    //będziesz prosić użytkownika o podanie:
    // podaj 1 liczbę, podaj znak działania, podaj 2 liczbę
    //  - Następnie program powinien zaprezentować poprawny wynik.
    // - Program powinien zapytać czy chcesz dokonać kolejnych obliczeń T/N

    public static void main(String[] args) {

        int a;
        int b;
        String znak;
        Scanner sc = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();

        while (true){

            System.out.println("Podaj liczbę a");
            a = sc.nextInt();
            System.out.println("Podaj znak działania (+,-,*,/");
            znak = sc.next();
            System.out.println("Podaj liczbę b");
            b = sc.nextInt();

            if (znak == "+") {
                calc.suma(a, b);
            } else if (znak == "-") {
                calc.roznica(a, b);
            } else if (znak == "*") {
                calc.iloczyn(a, b);
            } else if (znak == "/") {
                calc.iloraz(a, b);
            }

            System.out.println("Czy chcesz dokonać następnych obliczeń ? (T/N)?");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("T")) {

            }else if (dec.equals("N")) {
                break;
            }

        }

    }
}
