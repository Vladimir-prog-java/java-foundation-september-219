package ru.itsjava.interfaces.comparable;

    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {

            Person personIvan = new Person("Иван", "Иванов", 33);
            Person personAleksandr = new Person("Александр", "Александров", 30);
            Person personAndrey = new Person("Андрей", "Иванов", 33);
            System.out.println("personIvan.compareTo(personAndrey) = " + personIvan.compareTo(personAndrey));

            Person[] persons = {personIvan,personAleksandr,personAndrey};
            System.out.println("До сортировки Arrays.toString(persons) = " + Arrays.toString(persons));
            Arrays.sort(persons);
            System.out.println("После сортировки Arrays.toString(persons) = " + Arrays.toString(persons));

            System.out.println("personAleksandr.clone() = " + personAleksandr.clone());
        }
    }


