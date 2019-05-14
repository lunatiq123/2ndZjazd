public class J19_1 {

    public static void main(String[] args) {
        int[][] tablica = new int[5][5];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i][i] = 1;
            tablica[i][tablica.length-1-i] = 1;
            for (int j = 0; j < tablica[i].length; j++) {

                System.out.print(tablica[i][j]);
            }

            System.out.println("");

        }
    }
}
