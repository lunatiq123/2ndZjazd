package J29;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    ArrayList<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public StudentController() {
        while (true) {

            System.out.println("D-dodaj, P-pokaz, U-usun, M-modyfikuj, L-liczba studentów, K-koniec");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {
                addStudent();
            } else if (dec.equals("P")) {
                showStudent();
            } else if (dec.equals("U")) {
                delStudent();
            } else if (dec.equals("M")) {
                modStudent();
            } else if (dec.equals("L")) {
                listStudent();
            } else if (dec.equals("K")) {
                break;
            }
        }
    }

    public void addStudent() {
        String imie;
        String nazwisko;
        int index;
        System.out.println("Podaj imię");
        imie = sc.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = sc.nextLine();
        System.out.println("Podaj numer indeksu");
        index = sc.nextInt();
        sc.nextLine();
        Student student = new Student(imie, nazwisko, index);
        studentList.add(student);
    }

    public void showStudent() {
        //pokazuje liste studentow
        for (Student tmp : studentList) {
            System.out.println(tmp);
        }
        if (studentList == null) {
            System.out.println("Lista jest pusta");
        }
    }

    public void delStudent() {
        int index;
        System.out.println("Podaj numer indeksu");
        index = sc.nextInt();
        sc.nextLine();

        for (Student tmp : studentList) {
            if (tmp.getIndex() == index) {
                studentList.remove(tmp);
                Student.count--;
                break;
            }
        }
    }

    public void modStudent() {
        int index;
        System.out.println("Podaj numer indeksu");
        index = sc.nextInt();
        sc.nextLine();
        for (Student tmp : studentList) {
            if (tmp.getIndex() == index) {
                System.out.println("Podaj imię");
                String noweImie = sc.nextLine();

                if (!noweImie.equals("")) {
                    tmp.setImie(noweImie);
                }


                System.out.println("Podaj nazwisko");
                String noweNazwisko = sc.nextLine();
                if (!noweNazwisko.equals("")) {
                    tmp.setNazwisko(noweNazwisko);

                }
            }
        }
    }

        public void listStudent () {
            System.out.println(Student.count);
        }
    }
