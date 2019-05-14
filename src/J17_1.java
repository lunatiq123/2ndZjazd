import java.util.Scanner;

public class J17_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*obliczanie potęgi
        System.out.println("Podaj podstawę");
        int podstawa = input.nextInt();
        System.out.println("Podaj wykładnik 1-100");
        int wykladnik = input.nextInt();
            int wynik = 1;
            for(int i=0; i<wykladnik; i++){
                wynik *= podstawa;
            }
            System.out.println(wynik);
        */

        //ćwiczenie J17
        int liczba;
        int min = 0;
        int max = 0;
        int suma = 0;
       int ile = 0;
        System.out.println("Podaj ciąg liczb całkowitych, gdzie 0 będzie ostatnia liczbą");
        while (true) {
            liczba = input.nextInt();
            if (liczba == 0) {
                break;
            }
            if (ile == 0) {
                min = liczba;
                max = liczba;
            } else {
                if (max < liczba) {
                    max = liczba;
                }
                if (min > liczba) {
                    min = liczba;
                }
            }
            suma += liczba;
            ile++;
        }
        System.out.println("MIN to  "+ min + ", MAX to " + max + " a średnia to ");
        System.out.println(suma/ile);
    }
}
