import animals.Cat;
import animals.Dog;
import animals.Giraffe;
import animals.Lion;
import foods.Fish;
import foods.Meat;
import foods.Vegetation;

public class Main {
    public static void main(String[] args) {
        Cat catVaska = new Cat("Васька", 5);
        catVaska.eat(new Fish());

        Dog muhtar = new Dog( "Мухтар", 3 );
        muhtar.run();
        muhtar.bark();
        muhtar.eat( new Meat());

        Giraffe giraffe = new Giraffe("Жираф", 10);
        giraffe.run();
        giraffe.voice();
        giraffe.eatLeaves(new Vegetation());

        Lion lion = new Lion("Чандр", 15);
        lion.run();
        lion.roar();
        Meat meat = new Meat();
        lion.eatMeat(new Meat());
    }
}
