//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        Dog dog = new Dog("doGG", "Haski");
        System.out.println(dog);

        String a = new String("hello");
        String b = new String("hello");

        System.out.println(a==b);
        System.out.println(a.equals(b));

        for(int i=-128; i<129; i++) {
            Integer a1 = i;
            Integer a2 = i;
            System.out.println("== "+i+" = "+ (a1==a2));
            System.out.println("Eq "+i+" = "+ (a1.equals(a2)));
        }
    }



}