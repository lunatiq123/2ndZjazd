import java.util.ArrayDeque;
import java.util.Scanner;

public class J14_4 {

    public static void main(String[] args) {

        int liczba;
        int cyfra;

        ArrayDeque<String> slowa = new ArrayDeque<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą ");
        liczba = sc.nextInt();

        String dlugosc = Integer.toString(liczba);

        for (int i = 0; i < dlugosc.length(); i++) {

            cyfra = liczba % 10;
            liczba = liczba / 10;

            switch (cyfra) {
                case 1:
                    slowa.addFirst("jeden ");
                    break;
                case 2:
                    slowa.addFirst("dwa ");
                    break;
                case 3:
                    slowa.addFirst("trzy ");
                    break;
                case 4:
                    slowa.addFirst("cztery ");
                    break;
                case 5:
                    slowa.addFirst("pięć ");
                    break;
                case 6:
                    slowa.addFirst("sześć ");
                    break;
                case 7:
                    slowa.addFirst("siedem ");
                    break;
                case 8:
                    slowa.addFirst("osiem ");
                    break;
                case 9:
                    slowa.addFirst("dziewięć ");
                    break;
                case 0:
                    slowa.addFirst("zero ");
                    break;
            }

        }

        System.out.print(slowa);
    }
}

/*
Napisz program, który będzie pobierał od użytkownika
dowolną liczbę całkowitą, a następnie wypisze słownie wszystkie
liczby np.:
Dla 1357
jeden trzy pięć siedem
 */