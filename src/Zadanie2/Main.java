package Zadanie2;

public class Main {

    public static void main(String[] args) {
        Person person = new Student("Dzienne", 2, 500);

            System.out.println(person.toString());
        Person wykładowca = new Lecturer("informatyka", 10000);
        System.out.println(wykładowca.toString());


    }
}
