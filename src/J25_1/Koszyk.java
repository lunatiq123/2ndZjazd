package J25_1;

import java.util.ArrayList;

public class Koszyk {

    ArrayList<String> produkty = new ArrayList<>();
    ArrayList<Integer> ilosc = new ArrayList<>();

    public void addKoszyk (String produkt, int ilosc) {
        this.produkty.add(produkt);
        this.ilosc.add(ilosc);

    }



}
