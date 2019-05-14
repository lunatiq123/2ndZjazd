import java.util.HashSet;
import java.util.Scanner;

public class J22_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Character> podaneLitery = new HashSet<>();

        System.out.println("Podaj hasło do odgadnięcia");
        String haslo = sc.nextLine();

        while (true) {
            boolean koniec = true;
            for (int i = 0; i < haslo.length(); i++) {

                char znak = haslo.charAt(i);

                if (podaneLitery.contains(znak)) {
                    System.out.print(znak);

                } else {
                    koniec = false;
                    System.out.print(" - ");
                }


            }

            if(koniec == true){
                break;
            }

            System.out.println();
            System.out.println("Podaj literę do odgadnięcia");
            String litera = sc.nextLine();
            podaneLitery.add(litera.charAt(0));


        }


    }

}
