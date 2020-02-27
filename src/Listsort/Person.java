package Listsort;

public class Person {
    private String name;
    private int age;
    private int income;

    public Person() {
    }

    public Person(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.income = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int money) {
        this.income = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + income +
                '}';
    }
}
