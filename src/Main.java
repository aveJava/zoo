import Animals.Cat;
import Animals.Dog;
import Foods.Fish;
import Foods.Meat;

public class Main {
    public static void main(String[] args) {
        Cat catVaska = new Cat("Васька", 5);
        catVaska.eat(new Fish());

        Dog muhtar = new Dog( "Мухтар", 3 );
        muhtar.run();
        muhtar.bark();
        muhtar.eatMeat( new Meat() );
    }
}
