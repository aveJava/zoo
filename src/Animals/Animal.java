package Animals;

import Foods.Food;

public abstract class Animal
{
    String name;
    int age;
    String color;
    String size;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    public abstract void say();
    public abstract void move();
    public abstract boolean eat(Food food);
}
