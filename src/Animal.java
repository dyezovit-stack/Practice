public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }

    public static void feed(Animal animal) {
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }

}
