package Animals;

import Foods.Food;

public class Cat {
    private String name;
    private int age;
    private int weight;     // вес кота

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say () {
        System.out.println("Мяу!");
    }

    public void eat (Food food) {
        System.out.println(this.name + " ест " + food.accusativeName);
    }
}
