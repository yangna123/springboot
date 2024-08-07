package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//创建3个Dog{name,age}对象，放入到ArrayList，献给List使用
//用迭代器和增强for两种方式来遍历
//
public class CollectionExercise_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("大黄",3));
        list.add(new Dog("小黑",23));
        list.add(new Dog("大壮",4));
        
        
        //先用for循环增强
        for (Object dog :list) {
            System.out.println("dog"+dog);

        }
        
        //使用迭代器
        System.out.println("===使用迭代器来遍历===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println("dog"+dog);

        }


    }
}
class  Dog{
    private String name;
    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
