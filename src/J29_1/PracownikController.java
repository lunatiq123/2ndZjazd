package J29_1;


import java.util.ArrayList;


public class PracownikController {

    ArrayList<Pracownik> ListaPracownikow = new ArrayList<>();


    public void dodajPracownika(String imie, String nazwisko, String kontrakt, double pensja)
    {
        Pracownik pracownik = new Pracownik(imie, nazwisko, kontrakt, pensja);
        ListaPracownikow.add(pracownik);
    }

    public void pokazPracownika(){
        for (Pracownik tmp : ListaPracownikow) {
            System.out.println(tmp);
        }


    }
    public void usunPracownika(String nazwisko){
        for (Pracownik tmp : ListaPracownikow){
            if (tmp.getNazwisko().equals(nazwisko)){
                ListaPracownikow.remove(tmp);
                break;
            }
        }

    }

    public void zmienKontrakt(String nazwisko, double pensja){
        for (Pracownik tmp : ListaPracownikow){
            if (tmp.getNazwisko().equals(nazwisko) && tmp.getKontrakt().equals("etat")){
               tmp.setPensja(pensja);


            }
        }

    }

}
