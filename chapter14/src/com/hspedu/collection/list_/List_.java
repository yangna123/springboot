package com.hspedu.collection.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();//相当于向上转型
        //1、List集合类中元素有序（添加顺序==取出顺序），且可重复
        list.add("jack");
        list.add("tom");
        list.add("make");
        list.add("tom");
        System.out.println("list="+list);
        //2、List支持索引,索引从0开始
        System.out.println(list.get(2));
    }
}
