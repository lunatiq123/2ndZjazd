import java.util.ArrayDeque;
import java.util.Scanner;

public class J21_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// FIFO (first in first out), LIFO (last in first out), FIOL (first in out last)

        ArrayDeque<String> kolejka = new ArrayDeque<>();
        kolejka.addFirst("A");
        kolejka.addFirst("B");
        kolejka.addFirst("C");
        kolejka.addFirst("D");
        kolejka.addFirst("E");

        System.out.println(kolejka);
        
        System.out.println();

        kolejka.removeLast();
        kolejka.removeLast();

        System.out.println(kolejka);


        System.out.println();

        kolejka.removeFirst();
        kolejka.removeFirst();

        System.out.println(kolejka);

    }
}
