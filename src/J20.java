
import java.util.Random;
import java.util.Arrays;

public class J20 {
    public static void main(String[] args) {
        Random ran = new Random();


        int[] tablica = new int[20];
        System.out.println("20 losowych liczb od 1 do 10 :");

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (ran.nextInt(10) + 1);
            System.out.print(" " + tablica[i]);
        }

        System.out.println();
        System.out.println(Arrays.toString(tablica));

        for (int x : tablica) {
            int ile = 0;
            for (int i = 0; i < tablica.length; i++) {

                if (x == tablica[i])
                    ile++;
            }

            System.out.println("Liczba " + x + " występuje " + ile + " razy");



        }

    }
}


















 /*
 Ćwiczenie J20
  Napisz program, który utworzy tablicę 20 liczb całkowitych z przedziału
 1...10, a następnie wypisze na ekranie ile razy każda z liczb z tego
 przedziału powtarza się w tablicy
  */