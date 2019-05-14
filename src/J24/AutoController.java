package J24;

import java.util.ArrayList;

public class AutoController {

    ArrayList<Auto> listaAut = new ArrayList<>();

    public void addAuto() {
        Auto a = new Auto("aaa", "ccc", 123, "dddaad", "ssss");
        Auto b = new Auto("bbb", "cbc", 13333, "dddaddd", "ssss");
        Auto c = new Auto("aaa", "ccc", 123344, "ddsdd", "ssss");

        listaAut.add(a);
        listaAut.add(b);
        listaAut.add(c);
    }

    public void showAuto() {
        System.out.println("Zawartość listy");
        for (Auto tmp : listaAut) {
            System.out.println(tmp);
        }

    }


}
