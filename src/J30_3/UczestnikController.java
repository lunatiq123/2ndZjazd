package J30_3;

import java.util.ArrayList;
import java.util.Scanner;

public class UczestnikController {


    ArrayList<Uczestnik> uczestnikLista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public UczestnikController() {
        while (true) {

            System.out.println("D-dodaj, U-usun, E-edytuj, W-wyświetl, K-koniec");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {
                addUser();
            } else if (dec.equals("U")) {
                delUser();
            } else if (dec.equals("E")) {
                editUser();
            } else if (dec.equals("W")) {
                showUser();
            } else if (dec.equals("K")) {
                break;
            }
        }

    }

    public void addUser() {
        String imie;
        String nazwisko;
        String nazwaKursu;
        System.out.println("Podaj imię");
        imie = sc.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = sc.nextLine();
        System.out.println("Podaj nazwę kursu");
        nazwaKursu = sc.nextLine();
        Uczestnik uczestnik = new Uczestnik(imie, nazwisko, nazwaKursu);
        uczestnikLista.add(uczestnik);


    }

    public void delUser() {
        String nazwisko;
        System.out.println("Podaj nazwisko kursanta");
        nazwisko = sc.nextLine();
        for (Uczestnik tmp : uczestnikLista) {
            if (tmp.getNazwisko().equals(nazwisko)) {
                uczestnikLista.remove(tmp);
                break;
            }
        }
    }

    public void editUser() {
        String nazwisko;
        System.out.println("Podaj nazwisko kursanta");
        nazwisko = sc.nextLine();

        for (Uczestnik tmp : uczestnikLista) {
            if (tmp.getNazwisko().equals(nazwisko)) {
                System.out.println("Podaj nową imię");
                String noweImie = sc.nextLine();

                if (!noweImie.equals("")) {
                    tmp.setImie(noweImie);
                }

                System.out.println("Podaj nowe nazwisko");
                String noweNazwisko = sc.nextLine();

                if (!noweNazwisko.equals("")) {
                    tmp.setNazwisko(noweNazwisko);

                }
            }
        }
    }


    public void showUser() {
        for (Uczestnik tmp : uczestnikLista) {
            System.out.println(tmp);
        }

    }


}
