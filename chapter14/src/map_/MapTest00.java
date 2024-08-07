package map_;

import java.util.HashMap;
import java.util.Set;

//Map集合遍历方式

public class MapTest00 {
    public static void main(String[] args) {
        //创建一个Map集合
        HashMap<String, Double> map = new HashMap<>();
        //添加元素
        map.put("张三",165.9);
        map.put("李四",168.8);
        map.put("张三",178.8);
        map.put("小羊",189.7);
        System.out.println(map);

        //1、获取Map集合的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);
        //2、遍历全部的键，通过键获取全部的值
        for (String key :keys) {
            //根据键获取对应的值
            double value = map.get(key);
            System.out.println(key +"=====>"+value);
        }


    }
}
