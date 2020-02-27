package fruitfactory;

public class TextDemo {
    public static void main(String[] args) {
        Fruit one = FruitFactory.getInfo("Banana");
        one.eat();

        Fruit two=FruitFactory.getInfo("Apple");
        two.eat();

        Fruit three=FruitFactory.getInfo("Banana");
        three.eat();
    }
}
