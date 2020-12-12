package Animals;

import Foods.Food;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say () {

    }

    public void eat (Food food) {
        System.out.println(this.name + " ест " + food.accusativeName);
    }
}
