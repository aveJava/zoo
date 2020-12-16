package Animals;

import Foods.Food;

public class Cat extends Animal
{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say () {
        if (this.age<2) {
            System.out.println("Мяу");
        }
        else {
            System.out.println("Давай жрать!!!");
        }
    }

    @Override
    public void move() {
        System.out.println( "Кошка идет грациозно!");
    }

    @Override
    public boolean eat (Food food) {
        System.out.println( this.name + " ест " + Food.accusativeName);
        return Math.random() * 1 > 0;
    }
}
