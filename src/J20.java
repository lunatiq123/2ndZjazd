import java.util.Random;


public class J20 {

    public static void main(String[] args) {
        Random ran = new Random();
        int liczba;

        int[] tablica = new int[20];
        System.out.println("20 losowych liczb od 1 do 20 (tablica) : ");

        for (int i = 0; i < tablica.length; i++) {

            liczba = ran.nextInt(19) + 1;
            tablica[i] = i + liczba;

            System.out.print(" " + tablica[i]);
        }

    }
}

 /*
 Ćwiczenie J20
  Napisz program, który utworzy tablicę 20 liczb całkowitych z przedziału
 1...10, a następnie wypisze na ekranie ile razy każda z liczb z tego
 przedziału powtarza się w tablicy
  */