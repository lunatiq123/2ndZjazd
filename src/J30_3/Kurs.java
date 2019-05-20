package J30_3;

public class Kurs {

    public Kurs(){
    }


    String nazwaKursu;


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
