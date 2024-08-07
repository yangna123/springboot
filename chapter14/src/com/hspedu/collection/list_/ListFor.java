package com.hspedu.collection.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List的三种遍历方式
public class ListFor {
    public static void main(String[] args) {
        //List接口的实现子类 Vector、LinkedList（三种遍历方式都一样，任选一个即可）
        //List list = new LinkedList();
        //List list = new Vector();
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("三国演义");
        list.add("鱼香肉丝");

        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);

        }

        //增强for
        System.out.println("========");
        for (Object o :list) {
            System.out.println(o);
        }

        //普通
        System.out.println("========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


    }
}
