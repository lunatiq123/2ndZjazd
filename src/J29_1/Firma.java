package J29_1;

import java.util.Scanner;

public class Firma extends PracownikController {

    String nazwaFirmy;
    Scanner sc = new Scanner(System.in);

    public Firma(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;

        while (true) {
            System.out.println("D-dodaj, P-pokaz, U-usun, Z-zmiana kontraktu, Q-koniec");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {

                String imie;
                String nazwisko;
                String kontrakt = null;
                double pensja = 0;

                System.out.println("Podaj imię");
                imie = sc.nextLine();

                System.out.println("Podaj nazwisko");
                nazwisko = sc.nextLine();

                System.out.println("Podaj kontrakt");
                System.out.println("S-staż, E-etat");
                dec = sc.nextLine().toUpperCase();

                if (dec.equals("S")) {
                    kontrakt = "staż";
                    pensja = 1000;
                }
                else if (dec.equals("E")) {
                    kontrakt = "etat";
                    System.out.println("Podaj pensję pracownika etatowego");
                    pensja = sc.nextDouble();
                    sc.nextLine();
                }

                dodajPracownika(imie, nazwisko, kontrakt, pensja);

            } else if (dec.equals("P")) {
                pokazPracownika();
            } else if (dec.equals("U")) {
                System.out.println("Podaj nazwisko");
                String nazwisko = sc.nextLine();
                usunPracownika(nazwisko);
            } else if (dec.equals("Z")) {
                System.out.println("Podaj nazwisko");
                String nazwisko = sc.nextLine();
                System.out.println("Podaj nową pensję");
                double pensja = sc.nextDouble();
                zmienKontrakt(nazwisko,pensja);

            } else if (dec.equals("Q")) {
                break;
            }

        }

    }
}

