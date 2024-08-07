package com.hspedu.collection.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethor_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        //Set接口对象不能存放重复的元素，只能存放一个null,
        // 数据是无序的（存放不等于取出），取出的顺序是固定的
        set.add("join");
        set.add("hens");
        set.add("mnbv");
        set.add("join");//重复
        set.add(null);
        set.add(null);
        System.out.println(set);

        //遍历方式
        //方式一：迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        //方式二：增强for
        for (Object o :set) {
            System.out.println(o);

        }

    }
}
