package J30_3;


public class Uczestnik {

    public Uczestnik() {
    }

    private String imie;
    private String nazwisko;
    String nazwaKursu;
    static int count = 0;


    public Uczestnik(String imie, String nazwisko, String nazwaKursu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaKursu = nazwaKursu;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nazwaKursu='" + nazwaKursu + '\'' +
                '}';
    }
}