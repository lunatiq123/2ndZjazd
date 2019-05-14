import java.util.Random;

public class J20 {

    public static void main(String[] args) {



        Random r = new Random();
        int liczba = r.nextInt();



        System.out.println(liczba);


        /*
        for (int i = 0; i < numbers.length; i++) {

            int liczba = r.nextInt();

            if (liczba > 0 && liczba <= 20) {
                numbers[i] = liczba;
            }
        }
        System.out.println(numbers);

         */

    }

}



/*
Ćwiczenie J20
 Napisz program, który utworzy tablicę 20 liczb całkowitych z przedziału
1...10, a następnie wypisze na ekranie ile razy każda z liczb z tego
przedziału powtarza się w tablicy
 */