package J30_3;

public class Kurs extends Uczestnik {

    public Kurs(){
    }


    String nazwaKursu;
    static int count = 0;



    public Kurs(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }


    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }


    @Override
    public String toString() {
        return "Kurs{" +
                "nazwaKursu='" + nazwaKursu + '\'' +
                '}';

    }
}
