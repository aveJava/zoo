import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Foods.Fish;

public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = {
                new Cat("Васька", 5),
                new Dog("Мухтар", 3),
                new Cat( "Борис", 2 )
        };

        for( Animal animal : animals ) {
            animal.move();
            animal.say();
            animal.eat(new Fish());
        }
    }
}
