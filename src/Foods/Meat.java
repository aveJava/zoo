package Foods;

public class Meat extends Food
{
    static {
        productName = "мясо";
        accusativeName = "мясо";
    }

    int weight = 100;
    String type = "говяжье";

    @Override
    public String toString() {
        return type + " " + productName + " " + weight + "г";
    }
}
