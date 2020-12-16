package Animals;

import Foods.Food;

public class Dog extends Animal
{
    public Dog( String name, int age ) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println( "Гав!" );
    }

    @Override
    public void move() {
        System.out.println( "Собачка бежит как угорелая!" );
    }

    @Override
    public boolean eat(Food food) {
        System.out.println( "Ммм какое вкусное " + Food.accusativeName );
        return Math.random() * 1 > 0;
    }
}
