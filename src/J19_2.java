import java.util.Scanner;

public class J19_2 {

    public static void main(String[] args) {
        int[][] gra = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int gracz = 1;

        while (true) {
            System.out.println("Gracz: " + gracz);

            System.out.println("Podaj wspolrzedne x: ");
            x = sc.nextInt();
            System.out.println("Podaj wspolrzedne y: ");
            y = sc.nextInt();

            gra[x][y] = gracz;

            if (
                    (gra[0][0] == gra[0][1] && gra[0][1] == gra[0][2] && gra[0][0] != 0) ||
                            (gra[1][0] == gra[1][1] && gra[1][1] == gra[1][2] && gra[0][0] != 0) ||
                            (gra[2][0] == gra[2][1] && gra[2][1] == gra[2][2] && gra[0][0] != 0) ||
                            (gra[0][0] == gra[1][0] && gra[1][0] == gra[2][0] && gra[0][0] != 0) ||
                            (gra[0][1] == gra[1][1] && gra[1][1] == gra[2][1] && gra[0][0] != 0) ||
                            (gra[0][2] == gra[1][2] && gra[1][2] == gra[2][2] && gra[0][0] != 0) ||
                            (gra[0][0] == gra[1][1] && gra[1][1] == gra[2][2] && gra[0][0] != 0) ||
                            (gra[0][2] == gra[1][1] && gra[1][1] == gra[2][0] && gra[0][0] != 0)
            ) {
                System.out.println("Wygrana gracza " + gracz);
                break;
            }

            for (int i = 0; i < gra.length; i++) {
                for (int j = 0; j < gra.length; j++) {

                    System.out.print(gra[i][j] + " ");
                }
                System.out.println();
            }

            if (gracz == 1) {
                gracz = 9;
            } else {
                gracz = 1;
            }

        }


    }

}
