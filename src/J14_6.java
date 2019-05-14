import java.util.Scanner;

public class J14_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String slowo = sc.nextLine();

        for (int i = 0; i < slowo.length(); i++) {
            int ile = 0;
            for (int j = 0; j < slowo.length(); j++) {
                if (slowo.charAt(i) == slowo.charAt(j)) {
                    ile++;
                }
            }

            System.out.println("Litera "+slowo.charAt(i)+ " wystepuje"+ile);

        }
    }
}


