import java.util.ArrayList;
import java.util.Scanner;

public class J21 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dodaj slowo");
        String slowo;

        while(true) {
            slowo = sc.nextLine();

            if (slowo.equals("end")) {
                break;
            }
            else {
                lista.add(slowo);
            }
        }

        for (String tmp : lista) {

            System.out.println(tmp);
        }
}







    }


