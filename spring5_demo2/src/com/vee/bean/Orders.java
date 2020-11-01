package com.vee.bean;

public class Orders {
    //无参构造
    public Orders() {
        System.out.println("1.执行无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2.调用set方法设置属性值");
    }

    //创建执行的初始化方法
    public void initMethod() {
        System.out.println("3.执行初始化方法");
    }

    //创建执行的销毁的方法
    public void destoryMethod() {
        System.out.println("5.执行销毁的方法");
    }
}
