package J30_3;

import java.util.ArrayList;
import java.util.Scanner;

public class KursController {

    ArrayList<Kurs> kursLista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public KursController() {
        while (true) {

            System.out.println("D-dodaj, U-usun, E-edytuj, W-wyświetl, X-uczestnik, K-koniec");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {
                addKurs();
            } else if (dec.equals("U")) {
                delKurs();
            } else if (dec.equals("E")) {
                editKurs();
            } else if (dec.equals("W")) {
                showKurs();
            } else if (dec.equals("X")) {
                userKurs();
            } else if (dec.equals("K")) {
                break;
            }
        }

    }

    public void addKurs() {
        String nazwaKursu;
        System.out.println("Podaj nazwę kursu");
        nazwaKursu = sc.nextLine();
        Kurs kurs = new Kurs(nazwaKursu);
        kursLista.add(kurs);
        Uczestnik.count++;

    }

    public void delKurs() {
        String nazwaKursu;
        System.out.println("Podaj nazwę kursu");
        nazwaKursu = sc.nextLine();
        for (Kurs tmp : kursLista) {
            if (tmp.getNazwaKursu().equals(nazwaKursu)) {
                kursLista.remove(tmp);
                Uczestnik.count--;
                break;
            }
        }
    }

    public void editKurs() {
        String nazwaKursu;
        System.out.println("Podaj nazwę kursu");
        nazwaKursu = sc.nextLine();

        for (Kurs tmp : kursLista) {
            if (tmp.getNazwaKursu().equals(nazwaKursu)) {
                System.out.println("Podaj nową nazwę kursu");
                String nowyKurs = sc.nextLine();

                if (!nowyKurs.equals("")) {
                    tmp.setNazwaKursu(nowyKurs);
                }
            }
        }
    }


    public void showKurs() {
        for (Kurs tmp : kursLista) {
            System.out.println(tmp);
        }

    }

    public void userKurs() {

        UczestnikController userController = new UczestnikController();

    }

}