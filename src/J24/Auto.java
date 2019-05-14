package J24;

public class Auto {

    String marka;
    String model;
    double cena;
    String kolor;
    String silnik;

    public Auto() {
    }

    public Auto(String marka, String model, double cena, String kolor, String silnik) {
        this.marka = marka;
        this.model = model;
        this.cena = cena;
        this.kolor = kolor;
        this.silnik = silnik;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + cena +
                ", kolor='" + kolor + '\'' +
                ", silnik='" + silnik + '\'' +
                '}';
    }

/*
    1.pola
    2.konstruktor
    3.nasze metody
    4.gettery i settery
    5. to string
    */


}
