package J23;

public class Company {

    public static void main(String[] args) {
        Employee worker1 = new Employee("Jan", "Kowalski", "20.02.1990", 9);
        Employee worker2 = new Employee("Euchrid", "Eukruk", "12.01.1888", 12);
        Employee worker3 = new Employee("Dyzio", "Żonkil", "unknown", 1);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);

    }
}
