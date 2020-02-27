package CarandPersoon;
/*
1.	车与主人
有两个类，车（Car）和人（Person）。
车有属性：品牌、价格、主人（Person）。
人有属性：姓名、年龄、拥有车辆（Car）.
编写程序模拟人买了一辆车，打印该车信息及该车主人信息。
 */
public class BuyCar {
    public static void main(String[] args) {

        Person one = new Person("Tom", 20);
        Car car = new Car("奥迪", 100000);
        one.setCar(car);
        car.setMaster(one);
        System.out.println(one.getCar().getInfo());
        System.out.println(car.getMaster().getInfo());
    }
}
