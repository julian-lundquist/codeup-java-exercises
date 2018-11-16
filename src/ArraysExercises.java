import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] people, Person person) {
        Person[] people1 = Arrays.copyOf(people, people.length + 1);
        people1[people1.length - 1] = new Person(person.getName());
        return people1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        String[] people = new String[3];
        Person[] people = new Person[3];

        people[0] = new Person("Tom");
        people[1] = new Person("Alex");
        people[2] = new Person("Joe");

//        for (int i = 0; i < people.length; i += 1) {
//            System.out.println(people[i].getName());
//        }

        Person[] people1 = addPerson(people, new Person("Jack"));

//        String[] person = new String[3];
//
//        person[0] = "Tom";
//        person[1] = "Alex";
//        person[2] = "Joe";
//
//        System.out.println(Arrays.toString(person));
    }
}
