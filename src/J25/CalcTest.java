package J25;

public class CalcTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add(3,4);
        calc.add(3,4, 5);
        calc.add(3.5,4.5);
        calc.add(3.6,4.9, 2.34);

    }

}
