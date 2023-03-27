package extractsuperclass.afterchange;

public class Dog extends Animal {
    public Dog(String breed, int age) {
        super(breed, age);
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}
