package com.hspedu.collection.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//要求：添加10个以上的元素，比如（String hello），在2号位插入一个元素，韩顺平教育，
//获得第五个元素，删除第6个元素，修改第7个元素，再使用迭代器遍历集合，
// 使用List的实现类ArrayList完成。
public class ListExercise {
    public static void main(String[] args) {
       List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println("list="+list);
        list.add(1,"韩顺平教育");
        System.out.println("list="+list);
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println("list="+list);
        list.set(6,"三国演义");
        System.out.println("list="+list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+obj);

        }


    }
}
