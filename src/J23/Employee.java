package J23;

public class Employee {

    String imie;
    String nazwisko;
    String dataUrodzenia;
    int stazPracy;

    public Employee(String imie, String nazwisko, String dataUrodzenia, int stazPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.stazPracy = stazPracy;
    }



    //prawy klawisz myszki i 'Generate' i 'toString'
    @Override
    public String toString() {
        return "Employee{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", stazPracy=" + stazPracy +
                '}';
    }
}
