package Animals;

public class Dog
{
    String name;
    int age;

    public Dog( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println( "Гав!" );
    }

    public void run() {
        System.out.println( "Собачка бежит как угорелая!" );
    }
}
