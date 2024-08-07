package com.hspedu.collection.list_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三义和" ,"张三" ,89));
        list.add(new Book("无花果","王五",54));
        list.add(new Book("布衣柜","李二",11));
        list.add(new Book("苍蓝和","小样",78));
        for (Object o :list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("排序后");
    }
    //如何对集合进行排序
    //静态方法
    public static void sort(List list) {
        int listSize = list.size();
        for (int i = 0; i <= listSize - 1; i++) {
            for (int j = 0; j <= listSize - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);

                }

            }
        }
    }

}
