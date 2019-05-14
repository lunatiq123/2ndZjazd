
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class J22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String towar;

// mapa jako sklep
        HashMap<String, Double> sklep = new HashMap<>();
        sklep.put("mleko", 2.20);
        sklep.put("jaja", 5.20);
        sklep.put("chleb", 1.80);
        sklep.put("cukier", 3.20);
        sklep.put("woda", 1.8);

        for (String tmp : sklep.keySet()) {
            System.out.println(tmp + " " + sklep.get(tmp));
        }

        //lista jako koszyk
        ArrayList<String> koszyk = new ArrayList<>();
        while (true) {
            System.out.println("Podaj nazwę towaru, jeśli chcesz zakończyc wciśniej pusty ENTER");
            towar = sc.nextLine();

            if (towar.equals("")) {
                break;
            }

            koszyk.add(towar);
        }
            //wyswietlenie zawartosci koszyka
            System.out.println(koszyk);

            //sumowanie wartości koszyka, do przejrzenia zawartosci koszyka uzywam pętli for-each
        double suma = 0;
        for(String produkt : koszyk) {

            suma += sklep.get(produkt );
        }
        System.out.println("Razem do zaplaty: "+suma);

        }
    }










