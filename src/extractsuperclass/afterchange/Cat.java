package extractsuperclass.afterchange;

public class Cat extends Animal {
    public Cat(String breed, int age) {
        super(breed, age);
    }

    public void meow() {
        System.out.println("Meow meow");
    }
}
