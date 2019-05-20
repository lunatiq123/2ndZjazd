package J30_3;



public class Uczestnik {

    public  Uczestnik () {
    }

    private String imie;
    private String nazwisko;
    String nazwaKursu;
    static int count = 0;

    public Uczestnik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
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

