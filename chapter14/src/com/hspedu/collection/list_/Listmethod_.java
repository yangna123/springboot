package com.hspedu.collection.list_;

import java.util.ArrayList;
import java.util.List;

//===========List常用的接口方法=========
public class Listmethod_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        //1、void.add(int index,Object else)：在index位置插入else元素
        list.add(1,"李伟");
        System.out.println("list"+ list);
        //2、boolean addAll(int index,Collection else):从index位置
        // 开始将else所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list="+list);
        //3、Object get(int index)：获取指定index位置的元素
        System.out.println(list.get(2));
        //4、int indexOf(Object obj)：返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        //5、int lastIndexOf(Object obj)：返回obj在集合中最后一次出现的位置
        list.add("tom");
        System.out.println("list"+ list);
        System.out.println(list.lastIndexOf("tom"));
        //6、Object remove(int index)：移除指定index位置元素,并返回此元素。
        list.remove(0);
        System.out.println("list="+list);
        //7、Object set(int index ,Object else)：设置制定index位置的元素为else,相当于是替换
        list.set(2,"小样");
        System.out.println("list="+list);
        //8、list sublist(int fromIndex ,int toIndex):返回从fromIndex到toIndex位置的子集合。
        List returnlist = list.subList(0, 2);//左闭右开
        System.out.println("returnlist="+returnlist);
    }
}
