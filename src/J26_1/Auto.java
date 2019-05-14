package J26_1;

public class Auto {

    String marka;
    String model;
    private boolean Zabezpieczony = true;
    private int pin = 12345;

    public Auto() {
    }

    public void alarm (int kod){
        if (kod == pin && Zabezpieczony  == true){

            this.Zabezpieczony = false;
            System.out.println("Samochód jest odbezpieczony");
        }
        else if (kod == pin && Zabezpieczony == false){
            this.Zabezpieczony = true;
            System.out.println("Samochód jest zabezpieczony");
        }
        else{
            System.out.println("błędny pin");
        }

    }

    public Auto(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
}

