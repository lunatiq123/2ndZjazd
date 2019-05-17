import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class J22_2 {

    public static void main(String[] args) {
        int liczba;

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {

            System.out.println("Podaj liczbę całkowitą lub wciśnij ZERO aby zakończyć");
            liczba = sc.nextInt();

            if (liczba == 0) {
                break;
            }

            lista.add(liczba);
        }
        System.out.println(lista);

      Collections.sort(lista);
     System.out.println("Lista rosnąco posortowana metodą: " + lista);


//jak zdaze to zamista metody Collections pomysle nad wlasnym algorytmem


       }


        }

/*

 Napisz program, który pobiera od użytkownika ciąg liczb całkowitych
i dodaje je do listy.
 Dodawanie przerywane jest 0, które nie jest dodawane do listy.
 Zaprojektuj własny algorytm sortujący, który posortuje rosnąco ww. utworzoną listę
i wynik wypisze do konsoli.

 */