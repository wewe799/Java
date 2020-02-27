package Listsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
有Person类，属性为：姓名、龄、收入。
New至少5个数据不同的Person将其放入ArrayList中，并分别根据收入和年龄降序排序
（调用库函数使用比较器(Comparator)方式排序，不允许自己写冒泡排序之类的）。
 */
public class sort {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 18, 5000));
        list.add(new Person("李四", 22, 8888));
        list.add(new Person("王五", 20, 2333));
        list.add(new Person("小六", 30, 6789));
        list.add(new Person("田七", 19, 6666));

        System.out.println("按照收入降序排列：");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int d = o2.getIncome() - o1.getIncome();
                if(d > 0) {
                    return 1;
                } else if (d < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list.toString());
    }

    AgeComparator ageSort = new AgeComparator();

}
