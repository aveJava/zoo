import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Foods.Fish;
import Foods.Meat;

public class Main {
    public static void main(String[] args) {
        Animal catVaska = new Cat("Васька", 5);
        catVaska.say();
        catVaska.move();
        boolean vaskaHunger = catVaska.eat(new Fish());
        System.out.println( "Васька наелся? " + vaskaHunger );

        Animal muhtar = new Dog( "Мухтар", 3 );
        muhtar.move();
        muhtar.say();
        boolean muhtarHunger = muhtar.eat( new Meat() );
        System.out.println( "Мухтар наелся? " + muhtarHunger );
    }
}
