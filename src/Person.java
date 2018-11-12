public class Person {
    private String name;
    // returns the person's name
//    public String getName();
//    // changes the name property to the passed value
//    public void setName(String name);
//    // prints a message to the console using the person's name
//    public void sayHello();

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }
}
