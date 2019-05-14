package J25_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Koszyk> listaKoszykow = new ArrayList<>();
        HashMap<String, Double> sklep = new HashMap<>();
        sklep.put("chleb", 2.00);
        sklep.put("woda", 1.00);
        sklep.put("sok", 3.50);
        sklep.put("piwa", 2.80);

        while (true) {
            System.out.println("Czy chcesz rozpocząć zakupy T/N");
            String dec = input.nextLine().toUpperCase();

            if (dec.equals("T")) {

                Koszyk obj = new Koszyk();

                while (true) {

                    System.out.println("Dodaj produkt do koszyka");
                    System.out.println(sklep);
                    String produkt = input.nextLine();

                    if (produkt.equals("")) {
                        listaKoszykow.add(obj);
                        break;
                    } else {
                        System.out.println("Podaj ilość:");
                        int ilosc = input.nextInt();
                        input.nextLine();

                        obj.addKoszyk(produkt, ilosc);
                    }
                }
            } else {
                break;
            }

            System.out.println("PODSUMOWANIE");

            for (Koszyk tmp : listaKoszykow) {
                double suma = 0;
                for (int i = 0; i < tmp.produkty.size(); i++) {

                    suma += sklep.get(tmp.produkty.get(i)) * tmp.ilosc.get(i);
                }

                System.out.println("Razem do zaplaty: " + suma);
            }
        }
    }

}
