public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Dog{breed='" + breed + "'}";
    }
}
