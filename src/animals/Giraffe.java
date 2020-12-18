package animals;

import foods.Food;
import foods.Vegetation;

public class Giraffe {
    String name;
    int age;

    public Giraffe(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println( "Жираф подает голос!" );
    }

    public void run() {
        System.out.println( "Жираф бежит как угорелый!" );
    }

    public void eatLeaves (Vegetation food) {
        System.out.println( "Ммм какие вкусные " + food.productName );
    }

}
