package CarandPersoon;

public class Car {
    private String brand;
    private int price;
    Person master;

    public Car() {
    }

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Car(String brand, int price, Person master) {
        this.brand = brand;
        this.price = price;
        this.master = master;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public String getInfo() {
        return "车的名字：" + this.brand + ",车的价格：" + this.price;
    }
}
