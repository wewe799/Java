package linklist;

import java.util.Scanner;

public class TextDemo {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("Ann");
        link.add("Bob");
        link.add("Cindy");
        link.add("David");
        link.add("Ele");
        System.out.println("此链表结点个数为：" + link.size());
        System.out.println("是否为空：" + link.isEmpty());

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要查找的索引(小于等于4)：");
        int n = sc.nextInt();
        System.out.println("索引为" + n + "的数据为：" + link.get(n));

        System.out.println("删除最后一个数据");
        link.remove("Ele");

        System.out.println("清空链表。");
        link.clear();
    }
}
