import java.util.HashMap;
import java.util.Scanner;

public class J21_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("zero", 0);
        mapa.put("jeden", 1);
        mapa.put("dwa", 2);
        mapa.put("trzy", 3);
        mapa.put("cztery", 4);
        mapa.put("piec", 5);

        System.out.println("Podaj wartość a");
        String a = sc.nextLine();

        System.out.println("Podaj wartość b");
        String b = sc.nextLine();


        //System.out.println(wynik);

        for(String tmp : mapa.keySet()) {
            System.out.println(mapa.get(tmp));
        }

        System.out.println(mapa.size());

        for(String tmp : mapa.keySet()) {
            System.out.println(tmp + " " + (mapa.get(tmp)));
        }
    }
}








