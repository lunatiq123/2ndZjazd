package J30_3;

public class Kurs extends Uczestnik {

    public Kurs(){
    }

    String nazwaKursu;
    static int student = 0;


    public Kurs(String nazwaKursu, int student) {
        this.nazwaKursu = nazwaKursu;
        this.student = student;
    }

    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "nazwaKursu='" + nazwaKursu + '\'' +
                ", student=" + student +
                '}';
    }
}


