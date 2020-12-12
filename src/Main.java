import Animals.Cat;
import Foods.Fish;

public class Main {
    public static void main(String[] args) {
        Cat catVaska = new Cat("Васька", 5);
        catVaska.eat(new Fish());
    }
}
