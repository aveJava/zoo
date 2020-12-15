import animals.Cat;
import animals.Dog;
import foods.Fish;
import foods.Meat;

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
