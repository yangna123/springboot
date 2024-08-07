package com.hspedu.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list"+list);
        list.remove(true);//删除元素true
        list.remove(0);//删除下表为0（即第一个）的元素
        System.out.println("list"+list);
        //contains:查找元素是否存在
        System.out.println(list.contains("jack"));//false
        //size获取元素的个数
        System.out.println(list.size());//1
        //isEmpty：判断是否为空
        System.out.println(list.isEmpty());//false
        //clear清空
        list.clear();
        System.out.println("list="+list);
        //addAll：添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list="+list);
        //containsAll：判断多个元素是否存在
        System.out.println(list.containsAll(list2));
        //removeAll：删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list="+list);


        }
    }

