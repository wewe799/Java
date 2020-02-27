package fruitfactory;

public class FruitFactory {
    public static Fruit getInfo(String fruit) {
        if ("Orange".equals(fruit)){
            return new Orange();
        }
        if ("Apple".equals(fruit)) {
            return new Apple();
        }
        if ("Banana".equals(fruit)) {
            return new Banana();
        }else {
            return null;
        }
    }
}
