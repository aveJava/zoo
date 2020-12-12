package Animals;

import Foods.Food;
import com.sun.source.util.SourcePositions;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say () {
       if (this.age<2) {
           System.out.println("Мяу");
       }
       else {
           System.out.println("Давай жрать!!!");
       }
    }

    public void eat (Food food) {
        System.out.println(this.name + " ест " + food.accusativeName);
    }
}
