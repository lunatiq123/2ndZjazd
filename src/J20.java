
import java.util.Random;

public class J20 {
    public static void main(String[] args) {
        Random ran = new Random();
        int ile = 0;
        int[] tablica = new int[20];


        System.out.println("20 losowych liczb od 1 do 20 (tablica):");

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = ran.nextInt(20);
            System.out.print(" " + tablica[i]);


            for (int j = 0; j < tablica.length; j++) {
                if (tablica[i] == tablica[i]) {
                    ile++;
                }

            }

            System.out.println("Liczba " + tablica[i] + " występuje " + (ile + 1) + " razy");

        }

    }

}





 /*
 Ćwiczenie J20
  Napisz program, który utworzy tablicę 20 liczb całkowitych z przedziału
 1...10, a następnie wypisze na ekranie ile razy każda z liczb z tego
 przedziału powtarza się w tablicy
  */