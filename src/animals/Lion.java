package animals;

import foods.Food;
import foods.Meat;

public class Lion {
    String name;
    int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void roar() {
        System.out.println( "Рррр!" );
    }

    public void run() {
        System.out.println( "Лев сидит на попе!" );
    }

    public void eatMeat( Meat food) {
        System.out.println( "Ммм какое вкусное " + food.getAccusativeName() );
    }
}
