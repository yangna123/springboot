package map_;

import java.util.*;

public class Map_ {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();//经典代码
        // 按照键无序、不重复、无索引
        //{null=null, 手表=2, 手机=100, java=4}

        //LinkedHashMap
        //HashMap<String, Integer> map = new LinkedHashMap<>();
        //按照键无序、不重复、无索引
        //{手机=100, 手表=2, null=null, java=4}
        map.put("手机",200);
        map.put("手机",100);//键相同，后面的数据会覆盖前面的数据
        map.put("手表",2);
        map.put(null,null);
        map.put("java",4);
        System.out.println(map);

        //Map集合常用方法
        //1、获取集合的大小
        System.out.println(map.size());
        //清空
//        map.clear();
//        System.out.println(map);
        //判断集合是否为空，是返回True，反之
        System.out.println(map.isEmpty());
        //根据键获取对应的值,若不存在则返回null
        System.out.println(map.get("手表"));
        //根据键删除整个元素（删除后会返回键的值）
        System.out.println(map.remove("手表"));
        //判断是否包含某个键，包含返回True，反之
        System.out.println(map.containsKey("手表"));//false
        System.out.println(map.containsKey("java"));//True
        //判断是否包含某个值，包含返回True，反之
        System.out.println(map.containsValue(4));//true
        //获取Map集合全部的键
        Set<String> keys = map.keySet();
        System.out.println(keys);
        //获取Map集合全部的值
        Collection<Integer> values = map.values();
        System.out.println(values);
        //把其他Map集合的元素倒入自己的集合中来
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("jack",2);
        map1.put("tom",5);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("jac",6);
        map2.put("tom",9);
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);


//        TreeMap
//        TreeMap<Integer, String> map1 = new TreeMap<>();
//        按键的大小排序，不重复，无索引
//         {1=李四, 3=MySQL, 4=jack, 7=tom}
//        map1.put(3,"MySQL");
//        map1.put(4,"jack");
//        map1.put(7,"tom");
//        map1.put(1,"李四");
//        System.out.println(map1);
    }
}
